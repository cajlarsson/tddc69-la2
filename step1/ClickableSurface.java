/**
 * 
 */
package step1;

import java.awt.*;
import java.awt.event.*;


public class ClickableSurface extends View {
	
	private class ClickListener extends MouseAdapter 
	{
		
		public void mousePressed(MouseEvent ev) 
		{
			addToContents(shapeFactory.newShape(ev.getX(), ev.getY()));
			repaint();
	        }
	}
	  
		private ShapeFactory shapeFactory;
		public ClickableSurface(ShapeFactory shapeFactory)
	{
		addMouseListener(new ClickListener());
		this.shapeFactory = shapeFactory;
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0,0,this.getWidth( ), this.getHeight());
		drawAllContents(g);
		
	}
}
