package lab2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PaintArea extends JComponent implements Observer{
	
	
	private class ClickListener extends MouseAdapter 
	{
		
		public void mouseClicked(MouseEvent ev) 
		{
			if(ev.getButton() == MouseEvent.BUTTON1)
			{
				controller.addShape(
					shapeFactory.newShape(ev.getX(), ev.getY())); 
				
			} else if ( ev.getButton() == MouseEvent.BUTTON2)
			{
				controller.setSelectedShape(ev.getX(),ev.getY());
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

	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0,0,this.getWidth( ), this.getHeight());
		controller.drawShapes(g);
	}

	public void update(Observable o, Object arg)
	{
		repaint();
	}
}
