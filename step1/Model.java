 /**
 * 
 */
package step1;

import java.awt.Graphics;


public interface Model {
	
	/**
	 * Any definition of this method 
	 * should add shape to the
	 * current list of shapes. 
	 * Current list of shapes represents
	 * all shapes that are currently visible
	 * on the drawing surface.
	 */
	public void addShape(MyShape shape);
	
	/**
	 * Definitions of this method should
	 * loop through the current list of shapes
	 * and ask each shape to draw itself.
	 */
	public void drawAll(Graphics g);

}
