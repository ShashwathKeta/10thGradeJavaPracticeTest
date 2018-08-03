package com.shashwath;

import java.util.Scanner;

public class CapitalLetterFinder {
	public static void capitalLetterFinder(String name) {
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);
			if (letter >= 'A' && letter <= 'Z') {
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
			
			if(word.equals("die")) {
				System.out.println("How could you kill me like this?");
				break;
			}
			System.out.print("The Capital letters in " + word + " are: ");
			capitalLetterFinder(word);
			System.out.println();
	}
}
}
