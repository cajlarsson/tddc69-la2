 /**
 * 
 */
package step1;

import java.awt.*;
import javax.swing.*;


public class View extends JComponent {
	private static Model contents;   // could be a list of several models

	/**
	 * Get a handle on the model,
	 * so that we can notify it when
	 * user makes an input in the gui.
	 *  
	 * @param contents
	 */
	public void setNotifyList(Model contents) {
		this.contents = contents;
	}
	
	/** 
	 * Notify the model that is should add
	 * this shape to its contents.
	 * 
	 * @param shape The newly created shape to add
	 */
    public void addToContents(MyShape shape) {
	contents.addShape(shape);
	}
	
	/**
	 * Gets called each time an event occurs
	 * in the GUI and the contents have been updated.
	 * 
	 * @param g The graphics object obtained
	 * 			when we called repaint().
	 */
	public void drawAllContents(Graphics g) {
		contents.drawAll(g);
	}
	
}
