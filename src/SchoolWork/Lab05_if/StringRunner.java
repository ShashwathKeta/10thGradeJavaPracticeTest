//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 5 - #3  StringOddOrEven    2017



public class StringRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 5 - #3  StringOddOrEven    2017");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is ????????");
		out.println();


		// create a new Scanner object and pass it System.in
		// this object knows how to read in data from the keyboard
		// variable keyboard holds the location of the Scanner object in memory
		Scanner keyboard = new Scanner(in);
		
		// we now prompt the user to enter a word
		out.print("Enter a word :: ");
		
		String strWord = keyboard.next(); 
		
		// create a StringOddOrEven object and pass to the constructor the
		//     value of strWord
		StringOddOrEven obj = new StringOddOrEven(strWord);
		
		
		// print out the value of the toString() method
		out.println(obj.toString());
		
		out.println(); // print a blank line
		
		
		// add more cases
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();
		
		out.print("Enter a word :: ");
		strWord = keyboard.next(); 
		obj.setString(strWord);
		out.println(obj.toString());
		out.println();	
	}
}