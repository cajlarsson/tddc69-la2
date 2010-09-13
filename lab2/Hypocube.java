package lab2;

import java.awt.Color;
import java.awt.Graphics;


public class Hypocube extends MyShape {

    
	public Hypocube(Color c, int x, int y) {
		super(c, x, y);
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x,y,40,40);
		g.setColor(color);
		g.drawRect(x,y,40,40);
	}


}