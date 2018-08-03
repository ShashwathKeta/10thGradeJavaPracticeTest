package com.shashwath;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Multiplication Tables");
		System.out.println();
		System.out.print("Enter the number of the multiplication table you wish to know: ");
		double tableNum = scan.nextDouble();
		
		if (tableNum <= 9) {
			for (int i = 0; i <= 9; i++) {
				System.out.println(tableNum + " x " + i + " = " + tableNum * i);
			}
		}
		else if (tableNum > 9) {
			for (int i = 0; i <= tableNum; i++) {
				System.out.println(tableNum + " x " + i + " = " + tableNum * i);
			}
		}
	}
}
