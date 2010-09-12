 package step1;

import java.awt.*;

public class ShapeFactory
{
	private MyShape prototype;
	public ShapeFactory()
	{
		prototype = new Square(Color.RED,0,0);
	}
	
	public MyShape newShape(int x, int y )
	{
		MyShape tmp = (MyShape) prototype.clone();
		tmp.setLocation(x,y);
		return tmp;
	}

	public void setColor(Color color)
	{
		prototype.setColor(color);
	}
	
	public  void setShape(MyShape shape)
	{
		Color tColor = prototype.getColor();
		prototype = shape;
		prototype.setColor(tColor);
	}

}