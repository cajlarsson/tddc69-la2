package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;


/**
 * Kontrolleraren har koll p� modellen och skapar det f�rsta f�nstret 
 */
public class Controller extends Observable
{
	private Model model;
	
	/**
	 *  Skapar modellen och ett f�nster
	 */
	public Controller()
	{
		super();
		Window firstWindow = new Window("1st Window",this);
		model = new Model();
	}
	
	/**
	 * Skickar vidare till modellens metod f�r att rita formerna
	 */
	public void drawShapes(Graphics g)
	{
		model.drawAll(g);
	}

	/**
	 * S�ger �t modellen att l�gga till en form och medelar alla Observer 
	 * att modellen har �ndrats
	 */
	public void addShape(MyShape shape)
	{
		model.addShape(shape);
		setChanged();		
		notifyObservers();
	}

	/**
	 * S�ger �t modellen att flytta den markerade formen och medelar alla
	 * Observer att modellen har �ndrats
	 */ 
	public void moveSelectedTo(int x, int y)
	{
		model.moveSelectedTo(x,y);
		setChanged();		
		notifyObservers();
	}

	/**
	 * S�ger �t modellen att ta bort den markerade formen och medelar alla 
	 * Observer att modellen har �ndrats
	 */
	public void deleteSelected()
	{
		model.deleteSelected();
		setChanged();		
		notifyObservers();
	}

	/**
	 * S�ger �t modellen att markera formen p� angiven koordinat
	 */	
	public void setSelectedShape(int x, int y)
	{
		model.setSelectedShape(x,y);
	}
	
        /**
	 * S�ger �t modellen att ta bort alla former 
	 */	
    	public void clearShapes()
	{
		model.clearShapes();
		setChanged();		
		notifyObservers();
	}

	/**
	 * Sparar hela modellistan p� fil
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
	 * Ers�tter modellistan med en l�st fr�n fil
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