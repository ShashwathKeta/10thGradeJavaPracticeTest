package paintProgram;
//DO NOT TOUCH THIS FILE
//THE INTERFACE HAS BEEN WRITTEN FOR YOU


import java.awt.Color;
import java.awt.*;

public interface ShapeInterface
{
	// all variables (constants) are public static final by default

	public int defaultWidth = 1;
	public int defaultHeight = 1;
	public int defaultThickness = 1;
	public Color defaultColor = Color.RED;
	
	// these methods are all public abstract by default
	public int getX();
	public void setX(int x);

	public int getY();
	public void setY(int y);

	public int getWidth();
	public void setWidth(int width);

	public int getHeight();
	public void setHeight(int height);

	public int getThickness();
	public void setThickness(int thickness);

	public Color getColor();
	public void setColor(Color color);

	public String getMode();
	public void setMode(String mode);
	
	public boolean getKeep();
	public void setKeep(boolean keep);

	public abstract void draw(Graphics window);	
}