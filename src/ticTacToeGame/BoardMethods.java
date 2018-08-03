package ticTacToeGame;
// DO NOT CHANGE THIS CODE 

public interface BoardMethods {
    
  // public abstract methods (note that we don't have to put public abstract in front
  // since methods declared in an interface are public abstract by default  
  
  
  
  public abstract void setCellValue(int row, int col, char value);
  
  
  
  public abstract char getCellValue(int row, int col);
  
  
  
  public boolean isPositionAvailable(int row, int col);
  
  
    
  // set all positions on the board to a space char ' '
  public void clearBoard();    
      
      
       
  public boolean cellIsFilled(int row, int col);
  
  

  public boolean isWinnerDown(char who, int col);
  
  
  
  public boolean isWinnerAcross(char who, int row);
  
  
  
  public boolean isWinnerDiagonal1(char who);



  public boolean isWinnerDiagonal2(char who);
  


  // check to see if the board has a winner (three in a row of the same char)
  // call the appropriate methods from above
  public char isWinner(char who);
  
  
  
  
   
   
  // note that we can not write constructors in an interface!!!!
  
}