package com.shashwath;

import java.util.Scanner;

public class FactorFinder {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Factor Finder");
		System.out.println();
		System.out.print("Enter a number ");
		int num = scan.nextInt();
		System.out.print("The factors of " + num + " are");
		
		int loopCounter = 0;
		
		for (int d = 1; d <= num; d++) {
			if (num % d == 0) {
				System.out.print(" " + d);
				loopCounter += 1;
				
			}
		}
		System.out.println();
		System.out.println("We have found " + loopCounter + " factors!");
	}
}