package com.shashwath;

import java.util.Scanner;

public class Encrypt {
	public static String encrypt (String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if (i % 2 == 0) {
				ch = ch + 4;
				output = output + (char)ch;
			}
			else {
				ch = ch + 7;
				output = output + (char)ch;
			}

		}
		return output;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Encrypter");
		boolean finished = false;
		while (finished == false) {
			System.out.println();
			System.out.print("Enter a string ");
			String input = scan.nextLine();

			if (input.equals("die")) {
				System.out.println("How could you kill me like this?");
				finished = true;
			}
			else {
			System.out.println("The encrypted word is: ");
			System.out.println(encrypt(input));
			}
		}
		for (int i = 0; i < 512; i++) {
			System.out.println(i + " " + (char)i + "    ");
		}
	}
}
