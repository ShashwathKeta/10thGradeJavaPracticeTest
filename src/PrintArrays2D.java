public class PrintArrays2D {
	
	public static void printRow (int [] array) {
		for (int c = 0; c < array.length; c++) {
			System.out.printf("%3d", array[c]);
		}
	}
	public static void printRowSum (int [] array) {
		int sum = 0;
		for (int c = 0; c < array.length; c++) {
			sum = sum + array[c];
		}
		System.out.println(" The Sum of this row is " + sum);
	}
	public static void printAllRowsAndSum (int [][] array) {
		for (int r = 0; r < array.length; r++) {
			printRow(array[r]);
			printRowSum(array[r]);
		}
	}
	public static void printColumnSum(int [][] array, int column) {
		int sum = 0;
		for (int r = 0; r < array.length; r++) {
			sum = sum + array[r][column];
		}
		System.out.printf("%3d", sum);
	}
	public static void printSumOfAllColumns (int [][] array) {
		for (int c = 0; c < array[0].length; c++) {
			printColumnSum(array, c);
		}
		System.out.println(" These are the sums of the columns");
	}
	
	public static void main(String args[]) {
		int [][] one = { {1, 3, 6, 8, 14, 16, 18},
				{1, 2, 3, 4, 5, 6, 7},
				{1, 2, 8, 4, 9, 6, 6}				
		};
		int [][] two = { {2, 3, 6, 8, 14, 16, 18},
				{3, 2, 3, 4, 5, 6, 7},
				{4, 2, 8, 4, 9, 6, 6}
		};
		printAllRowsAndSum(one);
		printSumOfAllColumns(one);
		
		System.out.println();
		System.out.println();
		
		printAllRowsAndSum(two);
		printSumOfAllColumns(two);
	}
}