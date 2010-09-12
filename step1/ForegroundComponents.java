 /**
 * 
 */
package step1;

import java.awt.*;
import java.util.*;


public class ForegroundComponents implements Model {
	private ArrayList<MyShape> allShapes = new ArrayList<MyShape>();
		
	public void addShape(MyShape shape) {
		allShapes.add(shape);
	}
	
	/**
	 * This method lets each shape use the same 
	 * Graphics-object to draw itself.
	 * (We get a new instance of Graphics
	 * each time repaint is called that is,
	 * each time the whole gui is redrawn.)
	 * 
	 */
	public void drawAll(Graphics g) 
	{
		for (MyShape shape : allShapes) 
		{
		shape.draw(g);
		}
	}
	
}

