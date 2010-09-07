/**
 * 
 */
package step1;

import java.awt.*;
import javax.swing.*;

/**
 * @author Rita Kovordányi Window1 is a specific gui that is actually displayed
 *         on the computer screen. It inherits the method addToNotifyList() and
 *         updateContents, but _must_ define its own paintComponent(Graphics).
 */
public class DrawingWindow extends View {
	private JFrame frame;
	private ClickableSurface drawSurface;

	public DrawingWindow(String windowTitle) {
		frame = new JFrame(windowTitle);
		frame.setLayout(new BorderLayout());
		drawSurface = new ClickableSurface();
		frame.add(drawSurface, BorderLayout.CENTER);
	}

}
