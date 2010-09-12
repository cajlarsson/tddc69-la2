package lab2;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame //
{
	private ShapeFactory shapeFactory;
	private Controller controller;
	
	public Window(String name, Controller controller)
	{
	    super(name);
	    
	    this.controller = controller;
	    
	    shapeFactory = new ShapeFactory();
	    
	    setLayout(new BorderLayout());
	    
	    
	    PaintArea paintArea = new PaintArea(shapeFactory,controller);
	    controller.addObserver(paintArea);
	    
	    add(paintArea,BorderLayout.CENTER);
	    
	    MenuBar menuBar = new MenuBar(shapeFactory);
	    add(menuBar,BorderLayout.WEST);
	    
	    setSize(800,600);
	    setVisible(true);
	}

	public void addShapeAt(int x, int y)
	{
		controller.addShape(shapeFactory.newShape(x,y));
	}
	

	
}
    

 
