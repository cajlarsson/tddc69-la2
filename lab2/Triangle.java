 /**
 * 
 */
package lab2;

import java.awt.Color;
import java.awt.Graphics;


public class Triangle extends MyShape 
{

	public Triangle(Color c, int x, int y) 
	{
		super(c, x, y);
	}

	public void draw(Graphics g) 
	{
		g.setColor(color);
		int xArray[]= {x,x+40,x};
		int yArray[]= {y,y+20,y+40};
		g.fillPolygon(xArray,yArray,3);
	}


}
