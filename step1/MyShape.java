/**
 * 
 */
package step1;

import java.awt.*;


public abstract class MyShape implements Cloneable{ 
	protected Color color;
	protected int x, y;

	public MyShape(Color c, int x, int y) {
		color = c;
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
	}

	public Object clone()
	{
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	public Color getColor()
	{
		return this.color;
	}
		
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
