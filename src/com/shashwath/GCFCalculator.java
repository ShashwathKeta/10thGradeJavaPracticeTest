package com.shashwath;

import java.util.Scanner;

public class GCFCalculator {
	
	public static int gcf(int num1, int num2) {
		int gcf = 1;
		
		for (int d = 1; d <= num1; d++) {
			if (num1 % d == 0 && num2 % d == 0) {
				gcf = d;
			}
		}
		return gcf;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("GCF Finder");
		System.out.println();
		
		
		for (int k = 0; k < Integer.MAX_VALUE; k++) {
			
			System.out.print("Enter a number ");
			int num1 = scan.nextInt();
			System.out.print("Enter a number ");
			int num2 = scan.nextInt();
			
			if (num1 == 0 && num2 == 0) {
				System.out.println();
				System.out.println("How could you kill me like this?");
				break;
			}
			
			int gcf = gcf(num1, num2);
		
			System.out.println("The GCF of " + num1 + " and " + num2 + " is " + gcf);
			System.out.println();
			System.out.println();
			
		}
	}
}