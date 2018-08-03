
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GuessGame extends JFrame implements ActionListener 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3796956342105268037L;

	// the main panel
    JPanel mainPanel = new JPanel();
    
    // Menu Bar 
	JMenuBar menuBar = new JMenuBar();

    // file menu
    JMenu     fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
   
	
	// guess menu
	JMenu     guessMenu = new JMenu("Guess");
	JMenuItem guessMenuItem = new JMenuItem("Guess");
	
	//textfields
	JTextField guessField = new JTextField("");
	
	//labels
	JLabel guessLabel   = new JLabel("Enter your Guess");
	JLabel resultLabel  = new JLabel("Result");
	JLabel resultStatus = new JLabel("Your result will show here"); // too high or too low
	JLabel titleLabel   = new JLabel("You will have 7 tries to guess a number between 1 and 100 (inclusive)"); // You will have ...
	
	//buttons for filler
	JLabel fillerButton1 = new JLabel("           ");
	JLabel fillerButton2 = new JLabel("           ");
	JLabel fillerButton3 = new JLabel("           ");
	JLabel fillerButton4 = new JLabel("           ");
	JLabel fillerButton5 = new JLabel("           ");
	JLabel fillerButton6 = new JLabel("           ");


	JLabel fillerButton7  = new JLabel("           ");
	JLabel fillerButton8  = new JLabel("           ");
	JLabel fillerButton9  = new JLabel("           ");
	JLabel fillerButton10 = new JLabel("           ");
	JLabel fillerButton11 = new JLabel("           ");
	JLabel fillerButton12 = new JLabel("           ");
	JLabel fillerButton13 = new JLabel("           ");
	JLabel fillerButton14 = new JLabel("           ");
	JLabel fillerButton15 = new JLabel("           ");
	JLabel fillerButton16 = new JLabel("           ");

	
    // create a panel for each BorderLayout position
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel centerPanel = new JPanel();
	
    JButton guessButton = new JButton("Guess");
    JButton startButton = new JButton("New Game");
    
    Random random = new Random();
    
    int numTries = 0;
    int theNumber;
    boolean gameOver;
    
    public GuessGame()
	{
		super("The Guessing Game");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameOver = true;
		
		
	    northPanel = new JPanel();
    	southPanel = new JPanel();
    	westPanel = new JPanel();
    	eastPanel = new JPanel();
    	centerPanel = new JPanel();
        
        guessButton.addActionListener(this);
        startButton.addActionListener(this);
          
                
        // create layout managers for the panels
        BorderLayout bl = new BorderLayout();
        mainPanel.setLayout(bl);

		GridLayout layoutCenter = new GridLayout(5,4);
		centerPanel.setLayout(layoutCenter);
		
        // add components to the center panel
        // first row
		centerPanel.add(fillerButton1);
		centerPanel.add(fillerButton2);
		centerPanel.add(fillerButton3);
		centerPanel.add(fillerButton4);
		
		// second row
		centerPanel.add(fillerButton5);
		centerPanel.add(guessLabel);
		centerPanel.add(guessField);
		centerPanel.add(fillerButton6);
		
		// third row
		centerPanel.add(fillerButton7);
		centerPanel.add(resultLabel);
		centerPanel.add(resultStatus);
		centerPanel.add(fillerButton8);
		
		// fourth row
		centerPanel.add(fillerButton9);
		centerPanel.add(fillerButton10);
		centerPanel.add(fillerButton11);
		centerPanel.add(fillerButton12);
		
		// fifth row
		centerPanel.add(fillerButton13);
		centerPanel.add(fillerButton14);
		centerPanel.add(fillerButton15);
		centerPanel.add(fillerButton16);
		
		
		// add the titleLabel to the northPanel		
		northPanel.add(titleLabel);
		
		southPanel.add(startButton);
		southPanel.add(guessButton);
						
		
		// FINISH ME
		// call addActionListener(this) for each menuItem
		exitMenuItem.addActionListener(this);
		guessMenuItem.addActionListener(this);

        
		// FINISH ME
        // **** add menu items to the menus
		fileMenu.add(exitMenuItem);
		guessMenu.add(guessMenuItem);


		// FINISH ME
        // **** add the menus to the bar
		menuBar.add(fileMenu);
		menuBar.add(guessMenu);

        
		// FINISH ME
        // **** set the bar to be the menu bar
		setJMenuBar(menuBar);

        
        // add each panel to the mainPanel
    	mainPanel.add(northPanel,BorderLayout.NORTH);
    	mainPanel.add(southPanel,BorderLayout.SOUTH);
    	mainPanel.add(eastPanel,BorderLayout.EAST);
    	mainPanel.add(westPanel,BorderLayout.WEST);
    	mainPanel.add(centerPanel,BorderLayout.CENTER);

        
		// FINISH ME        
        // compute the random number between 1 and 100 inclusive
        // theNumber = ???;
    	theNumber = (int)(Math.random()*100)+1;
        
        // make the mainPanel be the main content area and show it
     	setContentPane(mainPanel);
    	setVisible(true);  // always show the screen last

    }
	
	
    public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		GuessGame gg = new GuessGame();
	}
	
    public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if (source == exitMenuItem)
		{
			System.exit(0);			
		}
		
		else if ( source == startButton)
		{
			// FINISH ME
			// set gameOver to false
			gameOver = false;
			
			// FINISH ME
			// pick a new random number (theNumber = ?)
			theNumber = (int)(Math.random()*100)+1;
			
			// FINISH ME
			// clear the input field (guessField)
			// and clear the resultStatus label
			guessField.setText(" ");
			resultStatus.setText(" ");
			
			// FINISH ME
			// set the number of tries back to 0
			numTries = 0;


		}

		else if ( (gameOver) && ((source == guessMenuItem) || (source == guessButton)) )
		{
			// FINISH ME
			// pop up a dialog box informing the user that the game 
			// is over (i.e. they must click on New Game)
			JOptionPane.showMessageDialog(this, "Game Over");
			
			
		}	
				
		else if ( (!gameOver) && ((source == guessMenuItem) || (source == guessButton)) ) 
		{
			  String theGuessAsString = guessField.getText();
			  
			  // trim any pre or post spaces that the user might have entered
			  theGuessAsString = theGuessAsString.trim();
			  
			  // FINISH ME
			  // check for theGuessString being equal to the ""
			  if (theGuessAsString.equals("")) {
				  return;
			  }
			  int theGuessAsInteger = 0;
			   
			  try
			  {
			  	// FINISH ME
			  	// try to convert theGuessAsString to an integer		  	
			  	theGuessAsInteger = Integer.parseInt(theGuessAsString);
			  	
			  	
	            // FINISH ME
			    // the user has taken one more try, so up the counter numTries
			    numTries = numTries + 1;
			    
			    
		  	if (theGuessAsInteger == theNumber)
		  	{
		  		// FINISH ME
		  		// pop up a message dialog box informing the user that
		  		// they have won
		  		
		  		JOptionPane.showMessageDialog(this, "You have Won");
		  		
		  		// FINISH ME
		  		// set the gameOver variable to true
		  		gameOver = true;


		  		
		  	}
		  	else if (numTries >= 7)
		  	{
		  		// FINISH ME
		  		// pop up a dialog box to tell the user that they have lost
		  		JOptionPane.showMessageDialog(this, "You have Won");

		  		// FINISH ME
		  		// set the gameOver variable to true
		  		gameOver = true;


		  	}
		  	else if (theGuessAsInteger < theNumber)
		  	{
		  		// FINISH ME
		  		// set the resultStatus on the screen
		  		resultStatus.setText("Your guess was too low!");

		  	}
		  	else if (theGuessAsInteger > theNumber)
		  	{
		  		resultStatus.setText("Your guess was too high!");

		  		
		  	}
		  }
		  catch (Exception errorConverting)
		  {
		  	resultStatus.setText("Error! Enter a number!");		  	
		  }
		}
		
		
	}
}