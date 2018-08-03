package com.shashwath;

import java.util.Scanner;

public class SurfaceAreaOfACube {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Surface of a Cube");
		System.out.println();
		System.out.print("Enter the length of one side of the cube ");
		Double length = scan.nextDouble();
		System.out.println();
		System.out.println("The Surface area of the Cube is " + Math.pow(length, 2) * 6 + "units squared");
	}
}
