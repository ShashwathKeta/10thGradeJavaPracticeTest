package com.shashwath;

import java.util.Scanner;

public class Celsius2Fahernheit {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Celsius to Fahrenheit Converter");
		System.out.println();
		System.out.print("Enter the temperature in Celsius ");
		Double celsiusValue = scan.nextDouble();
		System.out.println();
		System.out.println("The temperature is " + (1.8 * celsiusValue + 32) + " Fahrenheit");
	}
}