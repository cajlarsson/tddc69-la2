/**
 * 
 */
package step1;

import javax.swing.*;

/**
 * @author Rita Kovordányi
 *
 */
public class DrawingTool {
	
	/**
	 * Creates a model and a view,
	 * and lets the model subscribe to
	 * updates on events in the view.
	 *  
	 * @param args Not used
	 */
	public static void main(String[] args) {
		View gui = new DrawingWindow("My Drawing Tool 1");
		Model contents = new ForegroundComponents();
		gui.addToNotifyList(contents);
	}

}
