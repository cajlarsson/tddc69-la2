package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Controller extends Observable
{
	private Model model;
	
	public Controller()
	{
		super();
		Window firstWindow = new Window("1st Window",this);
		
		model = new Model();
		
		
		
	}

	public void drawShapes(Graphics g)
	{
		model.drawAll(g);
	}

	public void addShape(MyShape shape)
	{
		model.addShape(shape);
		setChanged();		
		notifyObservers();
	}
	
	public void moveSelectedTo(int x, int y)
	{
		model.moveSelectedTo(x,y);
		setChanged();		
		notifyObservers();
	}

	public void deleteSelected()
	{
		model.deleteSelected();
		setChanged();		
		notifyObservers();
	}
	
	public void setSelectedShape(int x, int y)
	{
		model.setSelectedShape(x,y);
	}
    
	public void clearShapes()
	{
		model.clearShapes();
		setChanged();		
		notifyObservers();
	}

}
 
 
