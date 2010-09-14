package lab2;

import java.awt.*;
/**
 * Fabricerar nya former beroende på vald färg och typ.
 * Nyttjar protorype-mönstret, typ
 */

public class ShapeFactory
{
	private MyShape prototype;
	
/**
 * Sätter standard värden
 */
	public ShapeFactory()
	{
		prototype = new Square(Color.RED,0,0);
	}

	/**
	 * Skapar en ny form på koordinaterna
	 */
	public MyShape newShape(int x, int y )
	{
		MyShape tmp = (MyShape) prototype.clone();
		tmp.setLocation(x,y);
		return tmp;
	}
	
	/**
	 * Anger fabrikens produktfärg
	 */
	public void setColor(Color color)
	{
		prototype.setColor(color);
	}
	/**
	 * Anger fabrikens produktform
	 */
	public  void setShape(MyShape shape)
	{
		Color tColor = prototype.getColor();
		prototype = shape;
		prototype.setColor(tColor);
	}

}