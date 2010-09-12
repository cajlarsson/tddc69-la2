 /**
 * 
 */
package step1;

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
		//		g.fillTriangle(x,y,x+40,y+40 ,x+20,y+20);
	}


}
