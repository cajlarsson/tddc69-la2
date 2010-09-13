package lab2;

import java.awt.*;
/**
 * Fabricerar nya former beroende p� vald f�rg och typ.
 * Nyttjar protorype-m�nstret, typ
 */

public class ShapeFactory
{
	private MyShape prototype;
	
/**
 * S�tter standard v�rden
 */
	public ShapeFactory()
	{
		prototype = new Square(Color.RED,0,0);
	}

	/**
	 * Skapar en ny form p� koordinaterna
	 */
	public MyShape newShape(int x, int y )
	{
		MyShape tmp = (MyShape) prototype.clone();
		tmp.setLocation(x,y);
		return tmp;
	}
	
	/**
	 * Anger fabrikens produktf�rg
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