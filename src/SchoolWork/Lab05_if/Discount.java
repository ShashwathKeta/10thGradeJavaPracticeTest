//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -
package SchoolWork.Lab05_if;

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	// instance variables and constructors could be used, but are not really needed
	
	// getDiscountedBill() will return the final amount of the bill
	//			if the bill is > 1000, the bill receives a 15% discount
	
	// notice that this method is static
	// this means that the method has no access to instance variables or other
	// object methods
	
	public static double getDiscountedBill(double bill) throws Exception
	{
		if (bill <=0){
			throw new Exception("Input a valid bill amount");
				
		}
		else if(bill<=1000 && bill>=0){
			return bill;
		}
		else {
			return bill*.85;
		}
	}
}