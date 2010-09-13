package lab2;

import java.awt.Color;
import java.awt.Graphics;


public class Hyposphere extends MyShape {

    
	public Hyposphere(Color c, int x, int y) {
		super(c, x, y);
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x,y,40,40);
		g.setColor(color);
		g.drawOval(x,y,40,40);
	}


}