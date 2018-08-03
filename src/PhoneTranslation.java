import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PhoneTranslation extends JFrame implements  ActionListener
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
  JLabel     phoneTextLabel;
  JTextField phoneTextField;  // input field for phone number
  JLabel     filler23;
  
  // row 3
  JLabel     filler30;
  JLabel     filler31;
  JLabel     filler32;
  JLabel     filler33;

  // row 4
  JLabel     filler40;
  JLabel     filler41;
  JLabel     filler42;
  JLabel     filler43;

  // row 5
  JLabel     filler50;
  JLabel     filler51;
  JLabel     filler52;
  JLabel     filler53;

  // row 6
  JLabel     filler60;
  JLabel     phoneNumberLabel;
  JLabel     phoneNumberResult;
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
    filler20 = new JLabel("  ");
	filler20.setFont(font);	
    phoneTextLabel = new JLabel("Phone Number");
    phoneTextLabel.setFont(font);
    phoneTextField = new JTextField("",30);
    phoneTextField.setFont(font);
    filler23 = new JLabel("  ");
	filler23.setFont(font);	

    // row 3 - base 10 result
    filler30 = new JLabel(" ");
	filler30.setFont(font);	
    filler31 = new JLabel(" ");
    filler31.setFont(font);
    filler32 = new JLabel(" ");
    filler32.setFont(font);
    filler33 = new JLabel(" ");
	filler33.setFont(font);	

    // row 4 - 
    filler40 = new JLabel(" ");
	filler40.setFont(font);	
    filler41 = new JLabel(" ");
    filler41.setFont(font);
    filler42 = new JLabel(" ");
    filler42.setFont(font);
    filler43 = new JLabel(" ");
	filler43.setFont(font);	

    // row 5 - octal result
    filler50 = new JLabel(" ");
	filler50.setFont(font);	
    filler51 = new JLabel(" ");
    filler51.setFont(font);
    filler52 = new JLabel(" ");
    filler52.setFont(font);
    filler53 = new JLabel(" ");
	filler53.setFont(font);	

    // row 6 - hex result
    filler60 = new JLabel(" ");
	filler60.setFont(font);	
    phoneNumberLabel = new JLabel("Phone Number");
    phoneNumberLabel.setFont(font);
    phoneNumberResult = new JLabel("");
    phoneNumberResult.setFont(font);
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

    
    // create a mainPanel for components
    mainPanel = new JPanel();    

    // ***** assignments for menu variables *****

    menuBar            = new JMenuBar();
    
    fileMenu           = new JMenu("File");
    exitMenuItem       = new JMenuItem("Exit");
    
    // add the menuItem addActionListener(this) calls
    // fileMenu
    // exitMenuItem
    exitMenuItem.addActionListener(this);
    fileMenu.addActionListener(this);
   
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

	centerPanel.setLayout(new GridLayout(9,4));
	
    mainPanel.setLayout(new BorderLayout());

    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    westPanel.setBackground(new Color(115,205,255));
    eastPanel.setBackground(new Color(115,205,255));
   
    // create a new JButton object that displays Convert
    convertButton = new JButton("Convert");

    // call the addActionListener method and pass it this    
    convertButton.addActionListener(this);

    // add the convertButton to the southPanel (call the add method)
	southPanel.add(convertButton);

    // create a new JButton object that displays Clear
    clearButton = new JButton("Clear");
    
    //call the addActionListener method and pass it this    
    clearButton.addActionListener(this);
    // FINISH ME  add the clearButton to the southPanel (call the add method)
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
	centerPanel.add(phoneTextLabel);
	centerPanel.add(phoneTextField);
	centerPanel.add(filler23);
	
	// fill row 3
	centerPanel.add(filler30);
	centerPanel.add(filler31);
	centerPanel.add(filler32);
	centerPanel.add(filler33);

	// fill row 4
	centerPanel.add(filler40);
	centerPanel.add(filler41);
	centerPanel.add(filler42);
	centerPanel.add(filler43);

	// fill row 5
	centerPanel.add(filler50);
	centerPanel.add(filler51);
	centerPanel.add(filler52);
	centerPanel.add(filler53);

	// fill row 6
	centerPanel.add(filler60);
	centerPanel.add(phoneNumberLabel);
	centerPanel.add(phoneNumberResult);
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
    
    // Put your name on the console (debug window)
    System.out.println("My name is UH ???? I FORGOT ???");
    
  }   // end of public void initialize 

  // ***** default constructor *****

  public PhoneTranslation( )
  { 
    // initialize variables

    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Put your first and last name on the title
    // call the JFrame's setTitle method (we inherited all of the methods and variables)
    // and pass to it a String 
	setTitle("Phone Translation Code - I forgot my name????");


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
    	// get the text from phoneTextField 
    	String phoneTextNumber = phoneTextField.getText();
    	if (phoneTextNumber.equals("")) {
    		return;
    	}
 
		// convert the Phone Number to all digits
		// and then put it on the screen
		
		String phoneNumber = ""; // holds the new phone number with all digits and -'s
		
		for (int i = 0; i < phoneTextNumber.length(); i++) {
			char ch = phoneTextNumber.charAt(i);
			ch = Character.toUpperCase(ch);
			switch (ch) {
				case 'A': 
					 
				case 'B':
				
				case 'C':
					phoneNumber = phoneNumber + 2; break;
					
				case 'D': 
					 
				case 'E':
				
				case 'F':
					phoneNumber = phoneNumber + 3; break;
					
				case 'G': 
					 
				case 'H':
				
				case 'I':
					phoneNumber = phoneNumber + 4; break;
					
				case 'J': 
					 
				case 'K':
				
				case 'L':
					phoneNumber = phoneNumber + 5; break;
					
				case 'M': 
					 
				case 'N':
				
				case 'O':
					phoneNumber = phoneNumber + 6; break;
					
				case 'P': 
					 
				case 'Q':
				
				case 'R':
				
				case 'S':
					phoneNumber = phoneNumber + 7; break;
				
				case 'T': 
					 
				case 'U':
				
				case 'V':
					phoneNumber = phoneNumber + 8; break;
					
				case 'W': 
					 
				case 'X':
				
				case 'Y':
					
				case 'Z':
					phoneNumber = phoneNumber + 2; break;
				
				default: 
					phoneNumber = phoneNumber + ch;
			}
			
		}
	
		phoneNumberResult.setText(phoneNumber); 
    }	
    else if (source == clearButton)
    {
 
    	phoneTextField.setText("");
    	phoneNumberResult.setText("");
    }
    
  }  // end of actionPerformed


  // ***** main method *****
  public static void main(String[] arguments)
  {
    	new PhoneTranslation( );
  }


} // end of class PhoneTranslation

