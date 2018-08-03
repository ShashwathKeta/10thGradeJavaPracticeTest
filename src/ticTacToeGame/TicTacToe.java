package ticTacToeGame;

// YOU DO NOT NEED TO DO ANYTHING WITH THIS CODE (UNLESS YOU WANT TO)
// YOU WILL NEED TO FINISH THE BOARD CLASS

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements BoardConstants, ActionListener
{ 

  
  // ***** declaration of JFrame variables *****

  
  // define a mainPanel for components
  JPanel mainPanel;  

  // ***** declaration of menu variables *****

  // define a menu bar variable to hold JMenus
  JMenuBar  menuBar;
  
  // define some JMenus and their JMenuItems
  // define a JMenu called fileMenu and add menuItems
  JMenu     fileMenu;
  JMenuItem exitMenuItem; 
 
  // define JPanels for a BorderLayout
  JPanel     northPanel;
  JPanel     southPanel;
  JPanel     westPanel;
  JPanel     eastPanel;
  JPanel     centerPanel;

  // define buttons
  MyButton [][] button;      // X or O   3x3 
  Board         board;       // X or O   3x3
  JButton       startButton;
  
  JLabel        titleLabel;  // for top JPanel (northPanel)
    
  boolean       gameIsPlaying; // is a game in progress
  char          whosTurn;      // 'X' or 'O' or ' '
  
  // ***** public void initialize *****

  public void initialize( )
  { 
  	gameIsPlaying = false;
	whosTurn = ' ';  	  	
  	    
    // create a mainPanel for components
    mainPanel = new JPanel();    

    // ***** assignments for menu variables *****

    menuBar            = new JMenuBar();
    
    fileMenu           = new JMenu("File");
    exitMenuItem       = new JMenuItem("Exit");
       
    // add mnemonics to the menu system
    fileMenu.setMnemonic('F');
    exitMenuItem.setMnemonic('x');
    
    // add the menuItem addActionListener(this) calls
    // fileMenu
    exitMenuItem.addActionListener(this);
        
    // add menuItems to the fileMenu
    fileMenu.add(exitMenuItem);
    
    
    // add menus to the menuBar
    menuBar.add(fileMenu);
    
    // attach the JMenuBar to the Window
    setJMenuBar(menuBar);
    
    
    // ***** create JPanels for a BorderLayout *****
    northPanel   = new JPanel();
    southPanel   = new JPanel();
    westPanel    = new JPanel();
    eastPanel    = new JPanel();
    centerPanel  = new JPanel();

    mainPanel.setLayout(new BorderLayout());
    centerPanel.setLayout(new GridLayout(defaultNumberOfRows,defaultNumberOfColumns,3,3));

    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    westPanel.setBackground(new Color(115,205,255));
    eastPanel.setBackground(new Color(115,205,255));
    
    // ***** You need to add buttons, etc. to the 5 panels *****

	board = new Board(defaultNumberOfRows,defaultNumberOfColumns);
	
  	button = new MyButton[defaultNumberOfRows][defaultNumberOfColumns];
  	for (int r=0; r<defaultNumberOfRows; r++)
  	{
  		for (int c=0; c<defaultNumberOfColumns; c++)
  		{
			button[r][c] = new MyButton("");
			button[r][c].addActionListener(this);	
			// change the font
			Font font = new Font("Courier New",Font.BOLD,32);
			button[r][c].setFont(font);
			centerPanel.add(button[r][c]);
  		}
  	}
  
    titleLabel = new JLabel("Tic-Tac-Toe");
	Font font = new Font("Courier New",Font.BOLD,24);
    titleLabel.setFont(font);
	northPanel.add(titleLabel);
	
	startButton = new JButton("New Game");
	font = new Font("Courier New",Font.BOLD,24);
	startButton.setFont(font);
	startButton.addActionListener(this);
	southPanel.add(startButton);
	
    // ***** add the panels to the mainPanel 5 areas *****
    mainPanel.add(northPanel,BorderLayout.NORTH);
    mainPanel.add(southPanel,BorderLayout.SOUTH);
    mainPanel.add(eastPanel,BorderLayout.EAST);
    mainPanel.add(westPanel,BorderLayout.WEST);
    mainPanel.add(centerPanel,BorderLayout.CENTER);

    // make the mainPanel be the main content area and show it
    setContentPane(mainPanel);
    setVisible(true);  // always show the screen last
  }   // end of public void initialize 

  // ***** default constructor *****

  public TicTacToe( )
  { 
    // initialize variables

    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Tic-Tac-Toe Version 2.0");


    initialize( );

  }

  // ***** ActionListener interface methods *****

  // start of actionPerformed (ActionListener interface)
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();
    if (source == exitMenuItem)
    {
      System.exit(0);
    }  // end of if
    else if (source == startButton)
    {
    	// clear the board, buttons, etc.
    	
		clearBoard();		
     	gameIsPlaying = true;
		whosTurn = 'X';
		westPanel.setBackground(Color.RED);
    	eastPanel.setBackground(Color.RED);
    }  // end of if (source == startButton)
    else
    {
     if (!gameIsPlaying)
     {
     	JOptionPane.showMessageDialog(this,"You must start a new game!");
     	return;
     }
     
  	 for (int r=0; r<defaultNumberOfRows; r++)
  	 {
  		for (int c=0; c<defaultNumberOfColumns; c++)
  		{
  			if (source == button[r][c]) // this is the button that got clicked
  			{
  				// check to see if it is a valid move
  				
  				// you can't play on another person's piece
  				if (!board.isPositionAvailable(r,c))
  				{ 
     				JOptionPane.showMessageDialog(this,"You must play on an empty cell!");
  					return;
  				}
  				  				
  				// make the move	
				button[r][c].setText(""+whosTurn);
				button[r][c].setOwner(""+whosTurn);
				
				board.setCellValue(r,c,whosTurn);
				
				// check for a winner here
    			boolean isWinner = false;
       			if (board.isWinner(whosTurn)==whosTurn)
       			{
        			isWinner = true;
       			} 
       			if (board.isWinner(whosTurn)=='C')
       			{
        			isWinner = true;
     				titleLabel.setForeground(Color.GRAY);
     				titleLabel.setText("Cat's Game!");
     				northPanel.setBackground(Color.CYAN);
     				gameIsPlaying = false;
     				return;
       			} 
    
    			if (isWinner)			
				{
     				gameIsPlaying = false;
				    westPanel.setBackground(new Color(115,205,255));
     				eastPanel.setBackground(new Color(115,205,255));
     				
     				if (board.getCellValue(r,c) == 'X')
     				{
     					//Font font = new Font("Helvetica",Font.BOLD,14);
     					//titleLabel.setFont(font);
     					titleLabel.setForeground(Color.GRAY);
     					titleLabel.setText("X Wins!");
     					northPanel.setBackground(Color.RED);
     					gameIsPlaying = false;
     				}
     				else
     				{
     					titleLabel.setForeground(Color.GRAY);
     					titleLabel.setText("O Wins!");
     					northPanel.setBackground(Color.BLACK);
     					gameIsPlaying = false;
     				}
     				whosTurn = ' ';					
     				return;
				}
				
				
				if (whosTurn=='X')
				{
					whosTurn = 'O';
				    westPanel.setBackground(Color.BLACK);
    				eastPanel.setBackground(Color.BLACK);
				}
				else
				{
					whosTurn = 'X';
				    westPanel.setBackground(Color.RED);
    				eastPanel.setBackground(Color.RED);
				}
				
  			}
  		}
  	 }
    }
    
  }  // end of actionPerformed


  public void clearBoard()
  {
     titleLabel.setText("Tic-Tac-Toe");

	 board.clearBoard();
	 
	 // we set all the buttons to empty
  	 for (int r=0; r<defaultNumberOfRows; r++)
  	 {
  		for (int c=0; c<defaultNumberOfColumns; c++)
  		{
			button[r][c].setText("");
			button[r][c].setOwner("");
  		}
  	 }
	 northPanel.setBackground(new Color(115,205,255));
     westPanel.setBackground(new Color(115,205,255));
     eastPanel.setBackground(new Color(115,205,255));
     titleLabel.setForeground(Color.BLACK);
  }
  
  
  // ***** main method *****
  public static void main(String[] arguments)
  {
    @SuppressWarnings("unused")
	TicTacToe ticTacToe = new TicTacToe( );
  }

  
} // end of class ConnectFour


class MyButton extends JButton implements BoardConstants
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -55949720564416960L;
	String owner = "";

	public MyButton(String s)
	{
		super(s);
		Font font = new Font("Courier New",Font.BOLD,fontSize);
		setFont(font);
		owner = "";
		setText("");
	}	
	
	public void setOwner(String owner)	
	{
		this.owner = owner;
		Font font = new Font("Courier New",Font.BOLD,fontSize);
		setFont(font);
		setText(owner);
	}
	
	public String getOwner()	
	{
		return owner;
	}

      public void paintComponent(Graphics window)
      {  
		super.paintComponent((Graphics2D)window);
      }		

}