package com.shashwath;

import java.util.Scanner;

public class AreaOfARectangle {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find the area of a Rectangle");
		System.out.println();
		System.out.print("Enter the Length ");
		Double Length = scan.nextDouble();
		System.out.print("Enter the Width");
		Double Width = scan.nextDouble();
		System.out.println();
		System.out.println("The Area of this Rectangle is " + Length * Width + " square units");
	}
	
}
