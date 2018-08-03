package com.shashwath;

import java.util.Scanner;

public class BitShiftEncrypt {
	public static String bitShiftEncrypt (String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if (i % 2 == 0) {
				output = output + (char)(ch<<1);
			}
			else {
				output = output + (char)(ch<<2);
			}

		}
		return output;
	}
	
	public static String bitShiftDecrypt (String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if (i % 2 == 0) {
				
				
				output = output + (char)(ch>>1);
			}
			else {
				
				output = output + (char)(ch>>2);
			}

		}
		return output;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bit Shift Encrypter");
		boolean finished = false;
		while (finished == false) {
			System.out.println();
			System.out.print("What do you want to encrypt ");
			String input = scan.nextLine();
			if (input.equals("die")) {
				System.out.println("Why do you have to kill me like this");
				break;
			}
			else {
					System.out.print("Your Encrypted String is: ");
					String encrypt = bitShiftEncrypt(input);
					System.out.println(encrypt);
					System.out.println("Do you want to decrypt this ");
					String option = scan.nextLine();
					if (option.equals("yes")) {
						String decrypt = bitShiftDecrypt(encrypt);
						System.out.println(decrypt);
					}
					else if (option.equals("no")){}
			}
		}
	}
}
