package com.shashwath;

public class MatrixMultiplication {


public static Double[][] multiplicar(Double[][] A, Double[][] B){
	//the method runs and returns a matrix of the correct dimensions
	//(I actually changed the .length function to a specific value to eliminate 
	//it as a possible issue), but not the correct values

	    Double[][] C= new Double[2][2];
	    int i,j;
	    int Crows = 2;
	    int Ccolumns = 2;

	    ////I fill the matrix with zeroes, if I don't do this it gives me an error
	    for(i=0; i< Crows ; i++) {
	        for(j=0;j< Ccolumns ; j++){
	            C[i][j]=0.00000;
	        }
	    } 
	    ///this is where I'm supposed to perform the adding of every element in
	    //a row of A multiplied by the corresponding element in the
	    //corresponding column of B, for all columns in B and all rows in A
	    for(i=0;i<2;i++){
	        for(j=0;j<2;j++)
	            C[i][j]+=(A[i][j]*B[j][i]);
	    }
	    return C;
	}

	public static void main(String[] args) {
		
		Double[][] A = new Double[2][2];
	    
		A[0][0] = 4.0;
		A[0][1] = 9.0;
		A[1][0] = 7.0;
		A[1][1] = 3.0;
		
		Double[][] B = new Double[2][2];
		
		B[0][0] = 6.0;
		B[0][1] = 3.0;
		B[1][0] = 8.0;
		B[1][1] = 5.0;
		
		Double[][] C = new Double[2][2];
		
		C= multiplicar( A, B );
		
		System.out.println("The solution to the Matrix Multiplication is: [" + C[0][0] + "\t" + C[0][1] + "]" );
		System.out.println("The solution to the Matrix Multiplication is: [" + C[1][0] + "\t" + C[1][1] + "]" );
	}
}