package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Varje fönster är en instans av denna klass
 *
 */
public class Window extends JFrame //
{
	private ShapeFactory shapeFactory;
	private Controller controller;
	
	private class OurButton extends JButton
	{
		public OurButton(String name)
		{
			super(name);
			this.setFont(new Font("Monospace",0, 12));
		}
	}	
	

	private class WindowButton extends OurButton
	{
		public WindowButton(String name)
		{
			super(name);
			final Controller fC = controller;
			this.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Window newWindow = new Window("Derivate", fC);
				}
			});
		}
	}			  
    
	private class ClearButton extends OurButton
	{
		public ClearButton(String name)
		{
			super(name);

			final Controller fC = controller;
			this.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					fC.clearShapes();
				}
			});
		}
	} 


	private class SaveButton extends OurButton
	{

		public SaveButton(String name)
		{
			super(name);
			
			final Controller fC = controller;
			this.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					fC.saveModel();
				}
			});
		}
	}
	private class LoadButton extends OurButton
	{

		public LoadButton(String name)
		{
			super(name);
			
			final Controller fC = controller;
			this.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					fC.loadModel();
				}
			});
		}
	}

	/**
	 * Denna konstruktor tar fönstrets namn och vilket kontrollerar-objekt  som
	 * den använder. Instansierar en egen meny och dekorerar den.
	 *
	 */
	public Window(String name, Controller controller)
	{
	    super(name);
	    
	    this.controller = controller;
	    shapeFactory = new ShapeFactory();
	    setLayout(new BorderLayout());
	    
	    PaintArea paintArea = new PaintArea(shapeFactory,controller);
	    controller.addObserver(paintArea);
	    add(paintArea,BorderLayout.CENTER);
	    
	    MenuBar menuBar = new MenuBar(shapeFactory);
	    menuBar.add(new WindowButton("New Window"));
	    menuBar.add(new ClearButton("Clear Shapes"));
	    menuBar.add(new SaveButton("Save Shapes"));
	    menuBar.add(new LoadButton("Load Shapes"));
	    add(menuBar,BorderLayout.WEST);
	    
	    setSize(800,600);
	    setVisible(true);
	}
}
    

 
