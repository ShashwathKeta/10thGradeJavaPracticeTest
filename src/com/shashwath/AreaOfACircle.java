package com.shashwath;

import java.util.Scanner;

public class AreaOfACircle {
	public static void main(String args[]) {
		Double pi =  Math.PI;
		Scanner scan = new Scanner(System.in);
		System.out.println("Area of a Circle");
		System.out.println();
		System.out.print("Enter the radius ");
		Double radius = scan.nextDouble();
		System.out.println();
		System.out.println("The area of the circle is " + pi * Math.pow(radius, 2));
	}
}
