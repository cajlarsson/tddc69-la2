/**
 * 
 */
package step1;

import javax.swing.*;
import java.awt.Color;


public class DrawingTool {
	
	/**
	 * Creates a model and a view,
	 * and lets the model subscribe to
	 * updates on events in the view.
	 *  
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Model contents = new ForegroundComponents();
		View gui = new DrawingWindow("My Drawing Tool 1");
		gui.setNotifyList(contents);
		//	contents.addShape( new Square(Color.RED, 34,56) );
	}

}
