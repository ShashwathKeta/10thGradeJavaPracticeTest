//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

// Lab Chapter 5 - #5  Distance    2017

// Uses files  DistanceRunner.java and Distance.java

public class DistanceRunner
{
	public static void main( String[] args )
	{

		out.println("Lab Chapter 5 - #5  Distance    2017");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Shashwath Keta");
		out.println();

		// create a new Scanner object
		Scanner keyboard = ???  ?????( System.in );


		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		// create a new Distance object (call the default constructor)
		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		
		// add more test cases
		
		
		
	}
}