/**
 * 
 */
package step1;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Rita Kovordányi
 */
public class ClickableSurface extends View {

	private class ClickListener extends MouseAdapter {

		public void mouseClicked(MouseEvent ev) {
			
		}

	}
	
	public ClickableSurface() {
		addMouseListener(new ClickListener());
	}

	public void paintComponent(Graphics g) {
		
	}

}
