//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	// instance variable theChar
	private char theChar;

	
	// default constructor
	public CharacterAnalyzer()
	{
		// assign a default value to theChar (an empty space)
		// i.e. you can say 
		theChar = ' ';
		
	}


	// initializer constructor
	public CharacterAnalyzer(char c)
	{
		// assign the incoming value to 
		theChar = c;

	}


	public void setChar(char c)
	{
		// assign the incoming value to theChar
		theChar = c;
		
	}


	public char getChar()
	{
		return theChar;  // change me (return the value of the instance variable)
	}


	public boolean isUpper( )
	{
		// is theChar an uppercase letter?  If so, return true.  If not, return false.
		// use nested if statements!
		if(theChar <97 && theChar >= 65){
			return true;
		}
		
		return false;
	}


	public boolean isLower( )
	{
		if(theChar <= 122 && theChar >= 97){
			return true;
		}
		
		return false;
	}
	
	
	public boolean isNumber( )
	{
		// is theChar a digit 0, 1, 2, ..., 9
		if(theChar == 1 || theChar == 2 || theChar == 3 || theChar == 4 || theChar == 5 || theChar == 6 || theChar == 7 || theChar == 8 || theChar == 9 || theChar == 0){
			return true;
		}
		
		return false;
	}	


	public int getASCII( )
	{
		int i = (int)theChar;
		return i;  // change me!  return theChar as an int
	}


	public String toString()
	{
		return ""+ getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
	
	
}