package ticTacToeGame;

// class board holds the data for the board
// and methods to access, set, and check for a winner

// you must FINISH all of the code segments that are
// marked with FINISH ME

public class Board implements BoardConstants, BoardMethods 
{

	// holds 'X' or 'O' or ' '
	char [][] board;
	
	
	// constructors 

 	// default constructor Board
    public Board() 
    {
    	board = new char[defaultNumberOfRows][defaultNumberOfColumns];
    	clearBoard();
    }
 
 	// initializer constructor Board
    public Board(int rows, int cols) 
    {
    	// instantiate (new) the board (a char array) and put spaces into each cell
    	// FINISH ME
    	board = new char[' '][' '];
    	
    	// FINISH ME
    	// now put spaces into each cell of the board
    	// call your clearBoard() method
    	clearBoard();
    	
    }
    
    
    // FINISH ME
	// set the cell's value
	// write the method setCellValue(int row, int col, char value)
	// board[???][???] = ????;
	// it is declared in the interface
    public void setCellValue(int row, int col, char value)
    {
    	// FINISH ME
    	board[row][col] = value;
    }
    
    
    // FINISH ME
   	// return the value of the cell
   	// write the method char getCellValue(int row, int col)
   	// return board[???][???];
	// it is declared in the interface   	
    public char getCellValue(int row, int col)
    {
    	// FINISH ME
    	return board[row][col];
    }
 

   	// FINISH ME
   	// write the method isPositionAvailable(int row, int col)
   	// if (board[???][???] == ?)
   	// see if the position is available (i.e. if it is a space return true else return false)
	// it is declared in the interface
    public boolean isPositionAvailable(int row, int col)
    {
    	// FINISH ME
    	// see if the position is available (i.e. empty which is a space)
    	if (board[row][col] == ' ' ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
   	// FINISH ME
   	// write the method clearBoard()
   	// use nested loops and set each board[r][c] to a space (' ')
 	// set all positions on the board to a space char ' '
	// it is declared in the interface
    public void clearBoard()
    {
    	// FINISH ME
    	// use nested loops and set each board[r][c] to a space (' ')
    	for (int r=0; r < board.length; r++)
    	{
     		for (int c=0; c < board[r].length; c++)
     		{
     			setCellValue(r, c, ' ');
     		}
    	}
    }
    
  // this method is done for you
  public boolean cellIsFilled(int row, int col)
  {
	if (board[row][col] == ' ')
			return false;
  	return true;
  }


  // this method is written for you     
  // it is declared in the interface
  public boolean isWinnerDown(char who, int col)
  {  	
  	// DO NOT CHANGE THE CODE IN THIS METHOD  		
	if (
		  board[0][col] == who && 
		  board[1][col] == who &&
		  board[2][col] == who
		)
		return true;

  	return false;
  }


  // it is declared in the interface
  public boolean isWinnerAcross(char who, int row)
  {  
	  if (
			  board[row][0] == who && 
			  board[row][1] == who &&
			  board[row][2] == who
			)
			return true;	
  	
  	return false;
  }



  // it is declared in the interface
  // upper left to lower right
  public boolean isWinnerDiagonal1(char who)
  {  
	  if (board [0][0] == who && board [1][1] == who && board[2][2] == who) {
			return true;
		}
		else {
			return false;
		}
  }



  public boolean isWinnerDiagonal2(char who)
  {  
	  if (board [0][2] == who && board [1][1] == who && board[2][0] == who) {
			return true;
		}
		else {
			return false;
		}
  }


  public boolean isCatGame()
  {  
  	// FINISH ME	
    // use nested loops and check to see if any cell == ' '
    // if so, then we do NOT have a Cat's game
    for (int r=0; r < board.length; r++)
    {
     	for (int c=0; c < board[r].length; c++)
     	{
     		if (board[r][c] == ' ')
     			return false;
     	}
    }
  	
  	// if it gets here, then all cells are filled, and
  	// thus we have a Cat's game
  	return true;
  }


  // check to see if the board has a winner (3 in a row)
  // call the appropriate methods from above
  // return who if who is the winner
  // return a ' ' if who is NOT the winner
  // if it is a cat's game return a C
  public char isWinner(char who)
  {
  	// check to see if there is a winner going down
  	for (int col=0; col<=2; col++) {
  		if (isWinnerDown(who,col)) {
  			return who;
  		}
  		if (isWinnerAcross(who,col)) {
  			return who;
  		}
  		if (isWinnerDiagonal1(who)) {
  			return who;
  		}
  		if (isWinnerDiagonal2(who)) {
  			return who;
  		}
  	}
  	
  	if (isCatGame()) {
  		return 'C';
  	}
  	// if none of the above are true,
  	// we will return a ' ' to indicate
  	// that there is no winner and it is not a Cat's game
  	// DO NOT CHANGE THIS
  	return ' ';
  }
  
    
    
} // end of class Board