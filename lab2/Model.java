package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Model // 
{
	private ArrayList<MyShape> shapeList;
	private int selectedShape;
	
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

       	public void setSelectedShape(int x, int y)
	{
		for ( int i = shapeList.size() -1 ; i >= 1 ; i--) 
		{
			int sX = shapeList.get(i).getX();
			int sY = shapeList.get(i).getY();
			
			if ((x >= sX) 
			    && (x <= (sX +40)) 
			    && (y >= sY)
			    && (y <= (sY +40)))
			{
				selectedShape = i;
				break;
			}
		}
		selectedShape = -1;
	}
	
	public void moveSelectedTo(int x, int y)
	{
		if (selectedShape != -1)
		{
			shapeList.get(selectedShape).setLocation(x,y);
		}
	}

	public void deleteSelected()
	{
		if (selectedShape != -1)
		{
			shapeList.remove(selectedShape);
		}
	}
    
}
    

 
