//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	// instance variables
	private int x1,y1,x2,y2;


	// default constructor
	public Distance()
	{
		// assign default values to the instance variables
		x1 =0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}


	// initilizer constructor
	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		// store the incoming values into the instance variables
		x1 =xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}


	// modifier (setter) method
	// allows us to modify or set the instance variables
	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		// store the incoming values into the instance variables
		x1 =xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo; 
	}


	// returns who is closest to (0,0), is A closer to (0,0) or is B closer to (0,0)?
	public String determineClosest( )
	{
		double distanceOfA = 0.0, distanceOfB = 0.0;
		String result="";
		// result     A is closer to (0,0).
		//         or B is closer to (0,0).






		return result;
	}
	
	
	public String toString()
	{
		// return the values of your instance variables	
		return "x1=" + x1 + "  y1=" + y1 + ...;  // finish this!
	}
	
}