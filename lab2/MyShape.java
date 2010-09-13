 /**
 * 
 */
package lab2;

import java.awt.*;
import java.io.*;


/**
 * Abstrakt basklass som implemeterar det mesta av formernas metoder
 */ 
public abstract class MyShape implements Cloneable, Serializable{ 
	protected Color color;
	protected int x, y;

	public MyShape(Color c, int x, int y) {
		color = c;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Skall överlagras så att respektive form ritas ut korrekt
	 */
	public abstract void draw(Graphics g) {
	}
	
	/**
	 * Anropar Object.clone() och fångar exception
	 */
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

	/**
	 * Anger färg 
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
	public Color getColor()
	{
		return this.color;
	}
		
/**
 * Flyttar formen
 */
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

/**
 * Ger X-koordinaten
 */
 	public int getX()
	{
		return x;
	}
	
/**
 * Ger Y-koordinaten
 */

	public int getY()
	{
		return y;
	}
	
}
