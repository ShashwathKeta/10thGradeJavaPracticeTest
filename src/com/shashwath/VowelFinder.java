package com.shashwath;

import java.util.Scanner;

public class VowelFinder {
	public static void vowelFinder(String name) {
		name = name.toUpperCase();
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);
			if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
				System.out.print(letter);
				count = count + 1;
			}
		}
		System.out.println();
		System.out.println("And the number of vowels are: " + count);
	}
	public static void main(String args []) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vowel Finder");
		
		for(int k = 0; k< Integer.MAX_VALUE; k++) {
			System.out.println();
			System.out.print("Enter a word ");
			String word  = scan.nextLine();
			word = word.toLowerCase();
			
			if(word.equals("die")) {
				System.out.println("How could you kill me like this?");
				break;
			}
			System.out.print("The vowels in " + word + " are: ");
			vowelFinder(word);
			System.out.println();
	}
}
}	
	
