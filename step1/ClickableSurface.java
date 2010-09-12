/**
 * 
 */
package step1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class ClickableSurface extends View {
	
	
	private class ClickListener extends MouseAdapter 
	{
		
		public void mousePressed(MouseEvent ev) 
		{
			addToContents(shapeFactory.newShape(ev.getX(),ev.getY()));
			
			repaint();
	        }
		
		public void mouseReleased(MouseEvent ev)
		{
		

		}
	}
	  
	private ShapeFactory shapeFactory;
	public ClickableSurface(ShapeFactory shapeFactory)
	{
		addMouseListener(new ClickListener());
	   
		/*addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent e) 
			{

			    	mouseX = e.getX();
			    	mouseY = e.getY();
			}
			
			public void mouseDragged(MouseEvent e) 
			{
				mouseX = e.getX();
				mouseY = e.getY();

			}

			});*/
		this.shapeFactory = shapeFactory;
		
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0,0,this.getWidth( ), this.getHeight());
		drawAllContents(g);
		
	}
}
