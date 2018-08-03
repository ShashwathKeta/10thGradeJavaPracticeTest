package com.shashwath;

public class StrictlyIncreasing {
	public static boolean isStrictlyIncreasing (int [] array) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] < array[i+1]) {}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		int [] one = {1,3,6,8,14,16,18};
		int [] two = {1,2,8,4,9,6,6,8,2};
		
		if (isStrictlyIncreasing(one) == true) {
			System.out.println("Array one is strictly increasing");
		}
		else if (isStrictlyIncreasing(one) == false) {
			System.out.println("Array one is not strictly increasing");
		}
		if (isStrictlyIncreasing(two) == true) {
			System.out.println("Array two is strictly increasing");
		}
		else if (isStrictlyIncreasing(two) == false) {
			System.out.println("Array two is not strictly increasing");
		}
	}
}
