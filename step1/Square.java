 /**
 * 
 */
package step1;

import java.awt.Color;
import java.awt.Graphics;


public class Square extends MyShape {

    
	public Square(Color c, int x, int y) {
		super(c, x, y);
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x,y,40,40);
	}


}
