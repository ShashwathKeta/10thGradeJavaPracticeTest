package SchoolWork.Lab05_if;
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;


public class DiscountRunner
{
	public static void main( String args[] )
	{
		
		double discountedBill = -1;
		double bill;
		Scanner keyboard = new Scanner(System.in);
		
		for (;;) {
			out.print("Enter the original bill amount or enter \"exit\":: ");
			String originalBill = keyboard.next();
			if(originalBill.equals("exit")) {
				System.out.println("Thank you for using the discount calculator, good night!");
				return;
			}
			bill = (Double.parseDouble(originalBill.trim()));
			try {
				discountedBill = Discount.getDiscountedBill(bill);
				out.println("Bill after discount is:: " + discountedBill);
				out.println(); // prints a blank line (skips down a line)
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}	
	}
}