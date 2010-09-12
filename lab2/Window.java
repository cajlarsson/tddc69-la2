package lab2;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame //
{
	private ShapeFactory shapeFactory;
	
	public Window(String name)
	{
	    super(name);

	    shapeFactory = new ShapeFactory();
	    
	    setLayout(new BorderLayout());
	    
	    JPanel  paintSurface = new JPanel();
	    add(paintSurface,BorderLayout.CENTER);
	    
	    MenuBar menuBar = new MenuBar(shapeFactory);
	    add(menuBar,BorderLayout.WEST);
	    
	    setSize(800,600);
	    setVisible(true);
	    
	}

}
    

 
