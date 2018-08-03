// find the FINISH ME comments
// you also need to follow what is happening
// you will be asked to build your own programs later on (with some help ofcourse)


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Charleston extends JFrame implements  ActionListener
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

  JButton    convertButton;
  JButton    clearButton;

  // define all of the fields and place holders for the main screen
  // 9 x 4
  
  // row 0
  JLabel     filler00;
  JLabel     filler01;
  JLabel     filler02;
  JLabel     filler03;
  
  // row 1
  JLabel     filler10;
  JLabel     filler11;
  JLabel     filler12;
  JLabel     filler13;

  // row 2
  JLabel     filler20;
  JLabel     codeTextLabel;
  JTextField codeTextField;
  JLabel     filler23;
  
  // row 3
  JLabel     filler30;
  JLabel     base10Label;
  JLabel     base10Result;
  JLabel     filler33;

  // row 4
  JLabel     filler40;
  JLabel     binaryLabel;
  JLabel     binaryResult;
  JLabel     filler43;

  // row 5
  JLabel     filler50;
  JLabel     octalLabel;
  JLabel     octalResult;
  JLabel     filler53;

  // row 6
  JLabel     filler60;
  JLabel     hexLabel;
  JLabel     hexResult;
  JLabel     filler63;

  // row 7
  JLabel     filler70;
  JLabel     filler71;
  JLabel     filler72;
  JLabel     filler73;

  // row 8
  JLabel     filler80;
  JLabel     filler81;
  JLabel     filler82;
  JLabel     filler83;


  
  Font       font;
  

  // ***** public void initialize *****

  public void initialize( )
  { 
  	font = new Font("Courier New",Font.PLAIN, 24);
  	
  	// row 0
	filler00 = new JLabel("  ");
	filler00.setFont(font);	
	filler01 = new JLabel("  ");
	filler01.setFont(font);	
	filler02 = new JLabel("  ");
	filler02.setFont(font);	
	filler03 = new JLabel("  ");
	filler03.setFont(font);	
	
  	// row 1
	filler10 = new JLabel("  ");
	filler10.setFont(font);	
	filler11 = new JLabel("  ");
	filler11.setFont(font);	
	filler12 = new JLabel("  ");
	filler12.setFont(font);	
	filler13 = new JLabel("  ");
	filler13.setFont(font);	

    // row 2
    filler20 = new JLabel("  ");;
	filler20.setFont(font);	
		
	// FINISH ME
	// create a JLabel that says Charleston Code
    codeTextLabel = new JLabel("Charleston Code");
    codeTextLabel.setFont(font);
    
    
	// FINISH ME
	// create a JTextField that 
	// contains the empty String and has a width
	// that holds 30 characters
    codeTextField = new JTextField("", 30);    

	// FINISH ME
	// set the font of the codeTextField to hold the font 
    codeTextField.setFont(font);;


    filler23 = new JLabel("  ");;
	filler23.setFont(font);	

    // row 3 - base 10 result
    filler30 = new JLabel("  ");;
	filler30.setFont(font);	
    base10Label = new JLabel("Base 10");
    base10Label.setFont(font);
    base10Result = new JLabel("");
    base10Result.setFont(font);
    filler33 = new JLabel("  ");;
	filler33.setFont(font);	

    // row 4 - binary result
    filler40 = new JLabel("  ");;
	filler40.setFont(font);	
		
	// FINISH ME
	// create a JLabel that says Binary on it 
	// and set its font
    binaryLabel = new JLabel ("Binary");    
    binaryLabel.setFont(font);
    
    // FINISH ME
    // create a JLabel to hold the binary answer and
    // set it to the empty String
    // and set its font        
    binaryResult = new JLabel (" ");
    binaryResult.setFont(font);
    
    filler43 = new JLabel("  ");;
	filler43.setFont(font);	


    // row 5 - octal result
    filler50 = new JLabel("  ");;
	filler50.setFont(font);	
		
	// FINISH ME
	// create a JLabel that says Octal on it 
	// and set its font
    octalLabel = new JLabel ("Octal");
    octalLabel.setFont(font);
    
    // FINISH ME
    // create a JLabel to hold the octal answer and
    // set it to the empty String
    // and set its font        
    octalResult = new JLabel ("");
    octalResult.setFont(font);
    
    filler53 = new JLabel("  ");;
	filler53.setFont(font);	

    // row 6 - hex result
    filler60 = new JLabel("  ");;
	filler60.setFont(font);	

	// FINISH ME
	// create a JLabel that says Hex on it 
	// and set its font
    hexLabel = new JLabel ("Hex");
    hexLabel.setFont(font);
    
    // FINISH ME
    // create a JLabel to hold the hex answer and
    // set it to the empty String
    // and set its font        
    hexResult = new JLabel ("");
    hexResult.setFont(font);
    
    filler63 = new JLabel("  ");;
	filler63.setFont(font);	

  	// row 7
	filler70 = new JLabel("  ");
	filler70.setFont(font);	
	filler71 = new JLabel("  ");
	filler71.setFont(font);	
	filler72 = new JLabel("  ");
	filler72.setFont(font);	
	filler73 = new JLabel("  ");
	filler73.setFont(font);	

  	// row 8
	filler80 = new JLabel("  ");
	filler80.setFont(font);	
	filler81 = new JLabel("  ");
	filler81.setFont(font);	
	filler82 = new JLabel("  ");
	filler82.setFont(font);	
	filler83 = new JLabel("  ");
	filler83.setFont(font);	

    
    // FINISH ME
    // create a JPanel to hold the components
    mainPanel = new JPanel();    

    // ***** assignments for menu variables *****

	// FINISH ME
	// create a new JMenuBar
    menuBar =  new JMenuBar();
    
    
	// FINISH ME
	// create a new JMenu object for the following
    fileMenu           = new JMenu("File");
    exitMenuItem       = new JMenuItem("Exit");
    
    
    // add mnemonics to the menu system
    fileMenu.setMnemonic('F');

	// FINISH ME
	// add a mnemonic of 'x' for the exitMenuItem
    exitMenuItem.setMnemonic('x');;
    
	// FINISH ME
    // add the menuItem addActionListener(this) call
    // for exitMenuItem
    exitMenuItem.addActionListener(this);;
    
   
	// FINISH ME
    // add the exitMenuItem to the fileMenu
    fileMenu.add(exitMenuItem);
    
    
    // add menus to the menuBar
    // FINISH ME
    // add the fileMenu object to the menuBar
    menuBar.add(fileMenu);
    
    // FINISH ME
    // attach the JMenuBar to the Window
    setJMenuBar(menuBar);
    
    
    // ***** create JPanels for a BorderLayout *****
    northPanel   = new JPanel();
    southPanel   = new JPanel();
    westPanel    = new JPanel();
    eastPanel    = new JPanel();
    centerPanel  = new JPanel();

	centerPanel.setLayout(new GridLayout(9,4));
	
    mainPanel.setLayout(new BorderLayout());

    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    westPanel.setBackground(new Color(115,205,255));
    eastPanel.setBackground(new Color(115,205,255));
    
    
    // ***** You need to add buttons, etc. to the 5 panels *****
    
    // FINISH ME  create a new JButton object that displays Convert
    // convertButton =
    convertButton = new JButton("Convert");
    
    // FINISH ME  call the addActionListener method and pass it this    
    // convertButton.?
    convertButton.addActionListener(this);
    
    // FINISH ME  add the convertButton to the southPanel (call the add method)
	// ?????.????(????);
    southPanel.add(convertButton);

    // FINISH ME  create a new JButton object that displays Clear
    // clearButton =
    clearButton = new JButton("Clear");
    
    // FINISH ME  call the addActionListener method and pass it this    
    // clearButton.?
    clearButton.addActionListener(this);
    
    // FINISH ME  add the clearButton to the southPanel (call the add method)
	// ?????.????(????);
    southPanel.add(clearButton);


	
	// add all of the components to the centerPanel
	
	// fill row 0
	centerPanel.add(filler00);
	centerPanel.add(filler01);
	centerPanel.add(filler02);
	centerPanel.add(filler03);
	
	// fill row 1
	centerPanel.add(filler10);
	centerPanel.add(filler11);
	centerPanel.add(filler12);
	centerPanel.add(filler13);

	// fill row 2
	centerPanel.add(filler20);
	centerPanel.add(codeTextLabel);
	centerPanel.add(codeTextField);
	centerPanel.add(filler23);
	
	// fill row 3
	centerPanel.add(filler30);
	centerPanel.add(base10Label);
	centerPanel.add(base10Result);
	centerPanel.add(filler33);

	// fill row 4
	centerPanel.add(filler40);
	centerPanel.add(binaryLabel);
	centerPanel.add(binaryResult);
	centerPanel.add(filler43);

	// fill row 5
	centerPanel.add(filler50);
	centerPanel.add(octalLabel);
	centerPanel.add(octalResult);
	centerPanel.add(filler53);

	// fill row 6
	centerPanel.add(filler60);
	centerPanel.add(hexLabel);
	centerPanel.add(hexResult);
	centerPanel.add(filler63);

	// fill row 7
	centerPanel.add(filler70);
	centerPanel.add(filler71);
	centerPanel.add(filler72);
	centerPanel.add(filler73);
	
	// fill row 8
	centerPanel.add(filler80);
	centerPanel.add(filler81);
	centerPanel.add(filler82);
	centerPanel.add(filler83);


	
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

  public Charleston( )
  { 
    // initialize variables

    // FINISH ME
	// call the JFrame's setSize method and set
	// the size of the window to 800x600
	// btw, you are a JFrame, so you own the method
    setSize(800, 600);


    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // FINISH ME
    // call the JFrame's setTitle method (we inherited all of the methods and variables)
    // and pass to it a String 
    // set the title to an appropriate title
    setTitle("Charleston Converter");


    initialize( );

  }

  // ***** ActionListener interface methods *****

  // start of actionPerformed (ActionListener interface)
  
  // this method gets called by the JVM when a JButton
  // or a MenuItem object is clicked
  // (provided we called the addActionListener method
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();
    if (source == exitMenuItem)
    {
      System.exit(0);
    }  // end of if
    else if (source == convertButton)
    {
    	// do the conversions and place the results into the appropriate text field or label
    	
    	// FINISH ME 
    	// get the text from the codeTextField
    	String charleston = codeTextField.getText();
    	
    	if (charleston.equals(""))
    		return;
    		

		// convert the charleston code to a base 10 number (int)

    	int result = 0;
    	int value = 0;
    	
    	boolean isValid = true;
    	
    	// we will now loop through the charleston String
    	// character by character
    	for (int i=0; i<charleston.length(); i++ )	
    	{
    		// FINISH ME
    		// get the character at the ith position from charleston
    		// char ch = ?
    		char ch = charleston.charAt(i);
    		// FINISH ME
    		// change it to upper case
    		// find a static method in the Character class to help you
    		// or write your own method for the fun of it
    		// ch = Character.?
    		ch = Character.toUpperCase(ch);
    	
    		// FINISH ME
    		// get the value of each character
    		
    		switch(ch)
    		{
    			case 'C' : value = 0; break;
    			
    			case 'H' : value = 1; break;
    			
    			case 'A' : value = 2; break;
    			
    			case 'R' : value = 3; break;
    			
    			case 'L' : value = 4; break;
    			
    			case 'E' : value = 5; break;
    			
    			case 'S' : value = 6; break;
    			
    			case 'T' : value = 7; break;
    			
    			case 'O' : value = 8; break;
    			
    			case 'N' : value = 9; break;
				// cover each charleston character in order
				
				// if you find an illegal character then show a pop up message and quit the method
				// see JOptionPane examples on my website
				// JOptionPane.?????
				// pull up the java sdk api (google it!)
				//    or simply search for JOptionPane
				// DO THIS INSIDE THE default block
				default : { // it will come here if it is not one of the above characters
							// FINISH ME
							// put your JOptionPane call  here
							JOptionPane.showMessageDialog(this, "Error: Type in Letters Only");
							// FINISH ME
							isValid = false;
						  } // end of default
						  
    		} // end of switch(ch)
    		
    		result = result*10 + value;
    		
    		// for debugging purposes
    		// look at your debug window for
    		// possible errors and debug help
    		System.out.println("result="+result);
    	}
    	
    	// result is the base 10 value
    	
    	
    	// FINISH ME
    	// set the fields on the screen that hold the results
    	// call each objects setText() method and pass it the new text to display
    	// base10Result.?;
    	// DO THIS INSIDE THE if else statement
		if (isValid)
		{
	    	// FINISH ME
    		// get the number converted into binary, octal, hex
    		// look in the Integer class for appropriate methods
    		String binary = Integer.toBinaryString(result);
    		String octal = Integer.toOctalString(result);
    		String hex = Integer.toHexString(result);
    		
    		// now set all the result fields
    		base10Result.setText("" + result);
    		binaryResult.setText(binary);
    		octalResult.setText(octal);
    		hexResult.setText(hex);
			
		}
		else
		{
			binaryResult.setText("");
    		octalResult.setText("");
    		hexResult.setText("");
    		base10Result.setText("");
		}
    	
    }
    else if (source == clearButton)
    {
    	// FINISH ME
    	// clear the input field and
    	// clear all the result fields  
    	// (call the setText("") method of each textfield or label)
    	codeTextField.setText("");
    	binaryResult.setText("");
		octalResult.setText("");
		hexResult.setText("");
    	base10Result.setText("");
    }
    
  }  // end of actionPerformed


  // ***** main method *****
  public static void main(String[] arguments)
  {
    @SuppressWarnings("unused")
	Charleston charleston = new Charleston( );
  }


} // end of class Charleston

