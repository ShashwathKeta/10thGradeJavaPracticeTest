package com.shashwath;

import java.util.Scanner;

public class SlopeOfALine {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Slope of a Line");
		System.out.println();
		System.out.print("Enter the length of the first points x ");
		double x1 = scan.nextDouble();
		System.out.print("Enter the length of the first points y ");
		double y1 = scan.nextDouble();
		System.out.print("Enter the length of the second points x ");
		double x2 = scan.nextDouble();
		System.out.print("Enter the length of the second points y ");
		double y2 = scan.nextDouble();
		
		if (x1 == x2) {
			System.out.println();
			System.out.println("The Slope is: undefined");
		}
		else {
			System.out.println();
			System.out.println("The Slope is: " + (y1 - y2)/(x1-x2));
		}
	}
}
