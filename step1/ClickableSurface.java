/**
 * 
 */
package step1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class ClickableSurface extends View {
	

	private Timer paintTimer;
	private int mouseX;
	private int mouseY;
	private class ClickListener extends MouseAdapter 
	{
		
		public void mousePressed(MouseEvent ev) 
		{
			addToContents(shapeFactory.newShape(mouseX, mouseY));
			paintTimer.start();
			repaint();
	        }
		
		public void mouseReleased(MouseEvent ev)
		{
			paintTimer.stop();

		}
	}
	  
	private ShapeFactory shapeFactory;
	public ClickableSurface(ShapeFactory shapeFactory)
	{
		addMouseListener(new ClickListener());
		addMouseMotionListener(new MouseMotionListener()
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

		});
		
		final ShapeFactory fu = shapeFactory;
		
		this.shapeFactory = shapeFactory;
	

		paintTimer = new Timer(10,new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				addToContents(fu.newShape(mouseX, mouseY));
				repaint();
			
			}
		});
		


	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0,0,this.getWidth( ), this.getHeight());
		drawAllContents(g);
		
	}
}
