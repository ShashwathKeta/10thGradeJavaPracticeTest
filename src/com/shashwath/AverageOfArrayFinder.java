package com.shashwath;

public class AverageOfArrayFinder {
	public static double averageNumberFinder (int [] array) {
		double value = 0;
		for (int i = 0; i < array.length; i ++) {
			value = value + array[i];
		}
		return (value/array.length);
	}

	public static void main(String[] args) {
		int [] one = {12,3,6,8,14,12,1};
		int [] two = {1,2,8,4,9,6,6,8,2};

		double numberOfEvenNumbersOne = averageNumberFinder (one);
		double numberOfEvenNumbersTwo = averageNumberFinder (two);

		System.out.println("The average of the numbers in array one is " + numberOfEvenNumbersOne);
		System.out.println("The average of the numbers in array two is " + numberOfEvenNumbersTwo);
	}
}