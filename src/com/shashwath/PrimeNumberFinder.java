package com.shashwath;

import java.util.Scanner;

public class PrimeNumberFinder {
	public static boolean primeFinder(int num) {
		
		if (num <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Prime NUmber Finder");
		for (int k = 0; k < Integer.MAX_VALUE; k++) {
			System.out.println();
			System.out.print("Enter a number ");
			int num = scan.nextInt();
			
			if (num == 0) {
				System.out.println("How could you kill me like this?");
				break;
			}
			
			if (primeFinder(num) == true) {
				System.out.println(num + " is a prime number");
			}
			else if (primeFinder(num) == false) {
				System.out.println(num + " is not a prime number");
			}
		}
	}
}
