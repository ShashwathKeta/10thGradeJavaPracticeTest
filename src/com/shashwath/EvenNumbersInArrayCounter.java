package com.shashwath;

public class EvenNumbersInArrayCounter {
	public static int numberOfEvenNumberFinder (int [] array) {
		int value = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] % 2 == 0) {
				value = value + 1;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		int [] one = {12,3,6,8,14,12,1};
		int [] two = {1,2,8,4,9,6,6,8,2};

		int numberOfEvenNumbersOne = numberOfEvenNumberFinder (one);
		int numberOfEvenNumbersTwo = numberOfEvenNumberFinder (two);

		System.out.println("The number of even numbers in array one is " + numberOfEvenNumbersOne);
		System.out.println("The number of even numbers in array two is " + numberOfEvenNumbersTwo);
	}

}
