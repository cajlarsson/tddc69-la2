package lab2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


/**
 * Ritytan som alla former ritas ut på
 */
public class PaintArea extends JComponent implements Observer{
	
	private class ClickListener extends MouseAdapter 
	{
		public void mouseClicked(MouseEvent ev) 
		{
			int button = ev.getButton();
			
			if(button == MouseEvent.BUTTON1)
			{
				controller.addShape(
					shapeFactory.newShape(ev.getX(), ev.getY())); 
			} 
			else
			{
			    controller.deleteSelected();				
			}
	        }
		
		public void mousePressed(MouseEvent ev)
		{
			controller.setSelectedShape(ev.getX(),ev.getY());
		}
	}
	  
	private ShapeFactory shapeFactory;
	private Controller controller;
	

/**
 * Ritytan kopplas till en formfabrik och en kontrollerare samt lägger till
 * lystnare för drag
 */
	
	public PaintArea(ShapeFactory shapeFactory, Controller controller)
	{
		super();

		addMouseListener(new ClickListener());
	   
		final Controller fController = controller;
		
		addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent e) 
			{
			}
			
			public void mouseDragged(MouseEvent e) 
			{
				fController.moveSelectedTo(e.getX(), e.getY());
			}
		});

		this.shapeFactory = shapeFactory;
		this.controller = controller;
	}
/**
 * Överlagrad funktion för Swingsutritningsytemet
 */
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0,0,this.getWidth( ), this.getHeight());
		controller.drawShapes(g);
	}
     
/**
 * Överlagrad funktion från Observer interface:et som anropas när fönstret
 * ska ritas om
 */
	public void update(Observable o, Object arg)
	{
		repaint();
	}
}
