package mineSweeper;
//class board holds the data for the board
//there is an inner class called Cell
//class board has several methods that are
//  the same name as the Cell method names
//	   in which case the board methods should
//  simply call the method of the Cell class

public class Board implements BoardConstants, BoardMethods 
{

	// holds info about what is on the cell - a bomb, played upon, or blank
	// notice that Cell is an inner class (at the bottom)
	Cell [][] board;
	
	
	// here come the constructors 

	// default constructor Board
 public Board() 
 {
	board = new Cell[defaultNumberOfRows][defaultNumberOfColumns];
	for (int r = 0; r < board.length; r++) {
 		for (int c = 0; c < board[r].length; c++) {
 			board[r][c] = new Cell();
 		}
 	}	
	clearBoard();
 }

	// constructor Board
 public Board(int rows, int cols) 
 {
 	board = new Cell [rows][cols];
 	
 	for (int r = 0; r < board.length; r++) {
 		for (int c = 0; c < board[r].length; c++) {
 			board[r][c] = new Cell();
 		}
 	}
 	clearBoard();
 }
 
 
 public void setCellStatus(int row, int col, char value){
	 board [row][col].setStatus(value); 
 }
 
 
	public char getCellValue (int row, int col){
		return board[row][col].getStatus();
 }

	
 public void setCellBomb(int row, int col)
 {
	 board [row][col].setBomb();
 }

 
 public void setCellPlayedOn(int row, int col)
 {
 	board [row][col].setPlayed();
 }
 
	public boolean isBomb(int row, int col)
	{
		return board [row][col].isBomb();
	} 

	public boolean isPlayedOn(int row, int col)
	{
		return board [row][col].isPlayedOn();
	} 

	public boolean isOpen(int row, int col)
	{
		return board [row][col].isOpen();
	} 

	public int numBombs(int row, int col)
	{
		return board[row][col].getNumSurroundingBombs();
	} 


 public boolean isPositionAvailable(int row, int col)
 {
	 return board[row][col].isOpen();
 }
 
	// set all positions on the board to a space char ' '
 public void clearBoard()
 {
 	// FINISH ME
 	// use nested loops and set each board[r][c] to a space (' ')
 	//    you should call the Cell's setOpen
 	// also call the Cell's setNumSurroundingBombs(0) 
 	// since we have not added the bombs yet
	 for (int r = 0; r < board.length; r++) {
		 for (int c = 0; c < board[r].length; c++) {
			 board[r][c].setOpen();
		 }
	 }


 }


 public void printBoard()
 {
 	// FINISH ME
 	// use nested loops and print out the board to the console
 	//    in matrix format
	 for (int r = 0; r < board.length; r++) {
		 for (int c = 0; c < board[r].length; c++) {
			 System.out.printf("%2c", board[r][c].getStatus());
		 }
		 System.out.println();
	 }

 }

 
 public void makeBoard(int numBombs)
 {
 	clearBoard();
 	
 	for (int i=0; i<numBombs; i++)
 	{
 		// FINISH ME
 		// get a random row on the board (use Math.random())
 		// and get a random col
 		// stay in bounds!!!
 		
 		// int r = ? // get a random row on the board
 		// int c = ? // get a random column on the board
 		int r = (int) (Math.random() * board.length);
 		int c = (int) (Math.random() * board[r].length);
 		
 		board[r][c].setBomb();
 	}
 	
 	fillCellWithNumSurroundingBombs();
 		
 	}
 
 
 public int findNumSurroundingBombs(int row, int col)   
 {
 	// FINISH ME
 	// make sure that you stay on the board (isValid may help)
 	// in determining if a cell is on the board
 	
 	int count = 0;
 	
 	for (int r = row-1; r <= row+1; r++) {
 		for (int c = col-1; c <= col + 1; c++) {
 			if (isValid(r,c) && board[r][c].isBomb()) {
 				count++;
 			}
 		}
 	}
 	if (board[row][col].isBomb()) {
 		col--;
 	}

 	return count;    	  	
 }


	// DO NOT TOUCH THIS METHOD
	// this method has been finished for you
	public void fillCellWithNumSurroundingBombs()
	{
 	for (int r=0; r < board.length; r++)
 	{
  		for (int c=0; c < board[r].length; c++)
  		{
  			if (board[r][c].isOpen() || board[r][c].isPlayedOn())
  			{
  				int numBombs = findNumSurroundingBombs(r,c);     			
					board[r][c].setNumSurroundingBombs(numBombs);     			
  			}
  			else
  			{
  				board[r][c].setNumSurroundingBombs(0);
  			}
  		}
 	}    	  	
	}
	
	
	public boolean isValid(int row, int col)
	{
		
		if (row >= 0 && row < board.length && col >= 0 && col < board[row].length) {
			return true;
		}
		return false;
	}
	
	

// check to see if the player is a winner
// all cells have been clicked on except for the bombs
// i.e. there are no open positions (isOpen might help you)
public boolean isWinner()
{
	// FINISH ME
	// if there is an open cell, return false, else return true
	for (int r = 0; r < board.length; r++) {
		for (int c = 0; c < board[r].length; c++) {
			if (!board[r][c].isPlayedOn() && !board[r][c].isBomb()) {
				return false;
			}
		}
	}
		
	return true;
}

  

// this is an inner class  
// this class has been finished for you
class Cell
{
	char status;  // P=Played on, B=Bomb, ' ' open
	int numSurroundingBombs;
	
	public Cell()
	{
		status = ' ';
		numSurroundingBombs = 0;
	}
	
	public boolean isOpen()
	{
		if (status == ' ')
			return true;
		return false;
	}
	
	public boolean isBomb()
	{
		if (status == 'B')
			return true;
		return false;
	}

	public boolean isPlayedOn()
	{
		if (status == 'P')
			return true;
		return false;		
	}  	
		
		
	public void setBomb()
	{
		status = 'B';
	}

	public void setPlayed()
	{
		status = 'P';
	}

	public void setOpen()
	{
		status = ' ';
	}

	public void setStatus(char status)
	{
		this.status = status;
	}

	public char getStatus()
	{
		return status;
	}

	public void setNumSurroundingBombs(int numSurroundingBombs)
	{
		this.numSurroundingBombs = numSurroundingBombs;
	}

	public int getNumSurroundingBombs()
	{
		return numSurroundingBombs;
	}

} // end of class Cell




} // end of class Board

