package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

/**
 *Håller koll på alla former i en ArrayList
 */

public class Model implements Serializable
{
	private ArrayList<MyShape> shapeList;
	private int selectedShape;

	/**
	 * Skapar en tom lista med former
	 */ 
    	public Model()
	{
		shapeList = new ArrayList<MyShape>();
	}

	/**
	 * Tömmer listan med former
	 */
	public void clearShapes()
	{
		shapeList = new ArrayList<MyShape>();
	}
	
	/**
	 * Lägger till en form i listan
	 */
	public void addShape(MyShape shape)
	{
		shapeList.add(shape);		
	}

	/**
	 * Ritar ut alla former på en Graphics
	 */
	public void drawAll(Graphics g)
	{
		for ( int i =  0; i < shapeList.size(); i++)
		{
			shapeList.get(i).draw(g);
		}
	}

	/**
	 * Markerar det objekt som ligger högst upp på position x,y
	 */
       	public void setSelectedShape(int x, int y)
	{
		selectedShape = -1;
		for ( int i = shapeList.size() -1 ; i >= 0; i--) 
		{
			int sX = shapeList.get(i).getX();
			int sY = shapeList.get(i).getY();
			
			if ((x >= sX) 
			    && (x <= (sX +40)) 
			    && (y >= sY)
			    && (y <= (sY +40) ))
			{
				selectedShape = i;
				break;
			}
		}
	}
	
	/**
	 * Flyttar den markerade formen till ett koordinatpar
	 */
	public void moveSelectedTo(int x, int y)
	{
		if (selectedShape != -1)
		{
			shapeList.get(selectedShape).setLocation(x,y);
		}
	}
	
	/**
	 * Tar bort den markerade formen
	 */
	public void deleteSelected()
	{
		if (selectedShape != -1)
		{
			shapeList.remove(selectedShape);
		}
	}

    
}
    

 
