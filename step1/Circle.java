/**
 * 
 */
package step1;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends MyShape 
{
    
	public Circle(Color c, int x, int y) 
	{
	super(c, x, y);
	}

	public void draw(Graphics g) 
	{
		g.setColor(color);
		g.fillOval(x,y,40,40);
	}

 
}
