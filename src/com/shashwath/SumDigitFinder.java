package com.shashwath;

import java.util.Scanner;

public class SumDigitFinder {
	public static int sum(int num) {
		int sum = 0;
		
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num/10;
		}
		
		
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sum of Digits Finder");
		
		for(int k = 0; k< Integer.MAX_VALUE; k++) {
			System.out.println();
			System.out.print("Enter a number ");
			int num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("How could you kill me like this?");
				break;
			}
			
			int sum = sum(num);
			
			System.out.println("The sum of " + num + " digits is " + sum);			
			System.out.println();
		}
	}
}
