//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

// Lab Chapter 5 - #4  CharacterAnalyzer    2017

 
public class CharacterRunner
{
	public static void main ( String[] args )
	{
		out.println("Lab Chapter 5 - #4  CharacterAnalyzer    2017");
		out.println();
		out.println();
		// fill in your name
		out.println("My name is Shashwath Keta ");
		out.println();

		
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0); // this is how we read in a single character
		
		String absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   // calls toString()
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);   // calls toString()
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
		
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0); // this is how we read in a single character
		test.setChar(letter);
		absorbsEnterKey = keyboard.nextLine(); // flushes the input buffer
		out.println(test);
	}
}