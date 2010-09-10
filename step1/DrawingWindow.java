/**
 * 
 */
package step1;

import java.awt.*;
import javax.swing.*;

public class DrawingWindow extends View {
	private JFrame frame;
	private ClickableSurface drawSurface;
	private ShapeFactory shapeFactory;

	public DrawingWindow(String windowTitle) {
		frame = new JFrame(windowTitle);
		shapeFactory = new ShapeFactory();
		frame.setLayout(new BorderLayout());

		drawSurface = new ClickableSurface(shapeFactory);
		MenuBar menuBar = new MenuBar(shapeFactory);
		frame.add(drawSurface, BorderLayout.CENTER);
		
		frame.add(menuBar, BorderLayout.WEST);

//		drawSurface

		frame.setVisible(true);
	}
}
