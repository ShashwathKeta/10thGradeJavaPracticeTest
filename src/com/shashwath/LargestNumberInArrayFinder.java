package com.shashwath;

public class LargestNumberInArrayFinder {
	public static int largestNumberFinder (int [] array) {
		int value = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > value) {
			value = array[i];
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		int [] one = {12,3,6,8,14,12,1};
		int [] two = {1,2,8,4,9,6,6,8,2};
		
		int largestOne = largestNumberFinder (one);
		int largestTwo = largestNumberFinder (two);
		
		System.out.println("The largest number in array one is " + largestOne);
		System.out.println("The largest number in array two is " + largestTwo);
	}

}
