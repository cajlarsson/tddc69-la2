package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Model // 
{
	private ArrayList<MyShape> shapeList;
	
	public Model()
	{
		shapeList = new ArrayList<MyShape>();

	}
	
	public void clearShapes()
	{
		shapeList = new ArrayList<MyShape>();
	}
	
	public void addShape(MyShape shape)
	{
		shapeList.add(shape);		
	}
	
	public void drawAll(Graphics g)
	{
		for ( int i =  0; i < shapeList.size(); i++)
		{
			shapeList.get(i).draw(g);
		}

	}
	
	//public whatsAt(int x int y)
    
    
}
    

 
