package lab2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JPanel
{
	private  ShapeFactory shapeFactory ; 

	private class ColorButton extends JButton
	{
		
		private class ColorClickListener implements ActionListener 
		{
			private Color color;
			
			public ColorClickListener( Color color)
			{
				this.color = color;
				
			}
			
			public void  actionPerformed(ActionEvent e) 
			{
				shapeFactory.setColor(color);
			}
			
		}
		
		public ColorButton(String name, final Color color)
		{
			super(name);

			final ShapeFactory fu = shapeFactory;

			this.setBackground(color);
			this.setFont(new Font("Monospace",0, 12));

			this.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					fu.setColor(color);
				}
			});
			
		}
	}			  

	private class ShapeButton extends JButton
	{
		private class ShapeClickListener implements ActionListener
		{
			private MyShape prototype;
			
			public ShapeClickListener(MyShape prototype)
			{
				this.prototype = prototype;
			
			}
			
			public void actionPerformed(ActionEvent e) 
			{
				shapeFactory.setShape(prototype);
			}
		}

		public ShapeButton(String name,final MyShape shape)
		{
			super(name);
			
			final ShapeFactory fu = shapeFactory;
			
			this.setFont(new Font("Monospace",0, 12));
			
			this.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					fu.setShape(shape);
				}
			});      
		}
		
	}
				      
	
	public MenuBar(ShapeFactory shapeFactory) 
	{
		super();

		this.shapeFactory = shapeFactory;
		this.setLayout( new BoxLayout( this, BoxLayout.PAGE_AXIS));
		this.add(Box.createHorizontalGlue());
		this.setBackground(Color.red);

		this.add(new ShapeButton("Square",new Square(Color.black,0,0)));
		this.add(new ShapeButton("Hypocube",new Hypocube(Color.black,0,0)));
		this.add(new ShapeButton("Hyposphere",new Hyposphere(Color.black,0,0)));
		this.add(new ShapeButton("Circle",new Circle(Color.black,0,0)));
		this.add(new ShapeButton("Triangle",new Triangle(Color.black,0,0)));
		this.add(new ColorButton("Red",Color.red));
		this.add(new ColorButton("Yellow",Color.yellow));
		this.add(new ColorButton("Green",Color.green));
		this.add(new ColorButton("Black",Color.black));
		this.add(new ColorButton("White",Color.white));
	}
}
