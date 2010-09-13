package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;


/**
 * Kontrolleraren har koll på modellen och skapar det första fönstret 
 */
public class Controller extends Observable
{
	private Model model;
	
	/**
	 *  Skapar modellen och ett fönster
	 */
	public Controller()
	{
		super();
		Window firstWindow = new Window("1st Window",this);
		model = new Model();
	}
	
	/**
	 * Skickar vidare till modellens metod för att rita formerna
	 */
	public void drawShapes(Graphics g)
	{
		model.drawAll(g);
	}

	/**
	 * Säger åt modellen att lägga till en form och medelar alla Observer 
	 * att modellen har ändrats
	 */
	public void addShape(MyShape shape)
	{
		model.addShape(shape);
		setChanged();		
		notifyObservers();
	}

	/**
	 * Säger åt modellen att flytta den markerade formen och medelar alla
	 * Observer att modellen har ändrats
	 */ 
	public void moveSelectedTo(int x, int y)
	{
		model.moveSelectedTo(x,y);
		setChanged();		
		notifyObservers();
	}

	/**
	 * Säger åt modellen att ta bort den markerade formen och medelar alla 
	 * Observer att modellen har ändrats
	 */
	public void deleteSelected()
	{
		model.deleteSelected();
		setChanged();		
		notifyObservers();
	}

	/**
	 * Säger åt modellen att markera formen på angiven koordinat
	 */	
	public void setSelectedShape(int x, int y)
	{
		model.setSelectedShape(x,y);
	}
	
        /**
	 * Säger åt modellen att ta bort alla former 
	 */	
    	public void clearShapes()
	{
		model.clearShapes();
		setChanged();		
		notifyObservers();
	}

	/**
	 * Sparar hela modellistan på fil
	 */
	public void saveModel()
	{
		try
		{
			FileOutputStream fileOutStream = new FileOutputStream(
				"alotofshapes.bin");
			ObjectOutputStream objectOutStream = new ObjectOutputStream(
				fileOutStream);
			objectOutStream.writeObject(model);
		}catch(IOException ex)
		{
			ex.printStackTrace();
			
		}
       	}
	/**
	 * Ersätter modellistan med en läst från fil
	 */
	public void loadModel()
	{
		try 
		{
			FileInputStream fileInStream = new FileInputStream(
				"alotofshapes.bin");
			ObjectInputStream objectInStream = new ObjectInputStream(
				fileInStream);
			model = (Model) objectInStream.readObject();
			setChanged();		
			notifyObservers();
			
		}catch(IOException ex)
		{
			ex.printStackTrace();
   
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}