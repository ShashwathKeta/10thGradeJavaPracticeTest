// find and finish all of the FINISH ME code segments

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JButton, etc.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Bitwise extends JFrame implements ActionListener { 

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

  JLabel     xLabel;
  JTextField xTextField;

  JLabel     yLabel;
  JTextField yTextField;

  
  JLabel     xBinaryLabel;
  JTextField xBinaryTextField;

  JLabel     yBinaryLabel;
  JTextField yBinaryTextField;

  JLabel     xAndYBinaryLabel;
  JTextArea  xAndYBinaryTextArea;
  
  JLabel     xOrYBinaryLabel;
  JTextArea  xOrYBinaryTextArea;

  JLabel     xXOrYBinaryLabel;
  JTextArea  xXOrYBinaryTextArea;


  
  
  JButton calculateButton;
  
  
  // ***** public void initialize *****
  
  
  public void initialize( ) { 


    
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
    northPanel          = new JPanel();
    southPanel          = new JPanel();
    westPanel           = new JPanel();
    eastPanel           = new JPanel();
    centerPanel         = new JPanel();
 	
	centerPanel.setLayout(new GridLayout(7,4));


	Font mainFont = new Font("Courier New",Font.BOLD,24);

	// x data entry in base 10
  	xLabel = new JLabel("       x   (in base 10)");
  	xLabel.setFont(mainFont);
  	xTextField = new JTextField("",32);
  	xTextField.setFont(mainFont);

	centerPanel.add(xLabel);
	centerPanel.add(xTextField);


	// y data entry 
  	yLabel = new JLabel("       y   (in base 10)");
  	yLabel.setFont(mainFont);
  	yTextField = new JTextField("",32);
  	yTextField.setFont(mainFont);

	centerPanel.add(yLabel);
	centerPanel.add(yTextField);


	// x in binary
  	xBinaryLabel = new JLabel("       x in Binary");
  	xBinaryLabel.setFont(mainFont);
  	xBinaryTextField = new JTextField("",32);
  	xBinaryTextField.setFont(mainFont);
	xBinaryTextField.setEditable(false);
	xBinaryTextField.setBackground(Color.MAGENTA);
	
	centerPanel.add(xBinaryLabel);
	centerPanel.add(xBinaryTextField);


	// y in binary
  	yBinaryLabel = new JLabel("       y in Binary");
  	yBinaryLabel.setFont(mainFont);
  	yBinaryTextField = new JTextField("",32);
  	yBinaryTextField.setFont(mainFont);
	yBinaryTextField.setEditable(false);
	yBinaryTextField.setBackground(Color.MAGENTA);

	centerPanel.add(yBinaryLabel);
	centerPanel.add(yBinaryTextField);


	// x & y in binary
  	xAndYBinaryLabel = new JLabel("       x & y   (and)");
  	xAndYBinaryLabel.setFont(mainFont);
  	xAndYBinaryTextArea = new JTextArea("",3,32);
  	xAndYBinaryTextArea.setFont(mainFont);
	xAndYBinaryTextArea.setEditable(false);
	xAndYBinaryTextArea.setBackground(Color.CYAN);
	
	centerPanel.add(xAndYBinaryLabel);
	centerPanel.add(xAndYBinaryTextArea);


	// x | y in binary
  	xOrYBinaryLabel = new JLabel("       x | y   (or)");
  	xOrYBinaryLabel.setFont(mainFont);
  	xOrYBinaryTextArea = new JTextArea("",3,32);
  	xOrYBinaryTextArea.setFont(mainFont);
	xOrYBinaryTextArea.setEditable(false);
	xOrYBinaryTextArea.setBackground(Color.YELLOW);

	centerPanel.add(xOrYBinaryLabel);
	centerPanel.add(xOrYBinaryTextArea);



	// x ^ y in binary
  	xXOrYBinaryLabel = new JLabel("       x ^ y   (exclusive or)");
  	xXOrYBinaryLabel.setFont(mainFont);
  	xXOrYBinaryTextArea = new JTextArea("",3,32);
  	xXOrYBinaryTextArea.setFont(mainFont);
	xXOrYBinaryTextArea.setEditable(false);
	xXOrYBinaryTextArea.setBackground(Color.CYAN);

	centerPanel.add(xXOrYBinaryLabel);
	centerPanel.add(xXOrYBinaryTextArea);


	
	Font titleFont = new Font("Courier New",Font.BOLD,24);
	String titleString = "Bitwise";
	JLabel titleLabel = new JLabel(titleString);
	titleLabel.setFont(titleFont);
	northPanel.add(titleLabel);

	Font buttonFont = new Font("Courier New",Font.BOLD,18);

	calculateButton =  new JButton("Calculate");
	calculateButton.setFont(buttonFont);
	calculateButton.addActionListener(this);
	southPanel.add(calculateButton);

	
    mainPanel.setLayout(new BorderLayout());
	
    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    westPanel.setBackground(new Color(115,205,255));
    eastPanel.setBackground(new Color(115,205,255));


    // ***** add the panels to the mainPanel 5 areas *****
    mainPanel.add(northPanel,BorderLayout.NORTH);
    mainPanel.add(southPanel,BorderLayout.SOUTH);
    mainPanel.add(eastPanel,BorderLayout.EAST);
    mainPanel.add(westPanel,BorderLayout.WEST);
    mainPanel.add(centerPanel,BorderLayout.CENTER);

    // make the mainPanel be the main content area and show it
    setContentPane(mainPanel);

	Toolkit tk = Toolkit.getDefaultToolkit();   
	int xSize = ((int) tk.getScreenSize().getWidth());   
	int ySize = ((int) tk.getScreenSize().getHeight()) - 35;   
	setSize(xSize,ySize);

    setVisible(true);  // always show the screen last
  }   // end of public void initialize 

  // ***** default constructor *****

  public Bitwise( ) { 
    // initialize variables

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Bitwise");


    initialize( );

  }


 

 // ***** ActionListener interface methods *****

  // start of actionPerformed (ActionListener interface)
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == exitMenuItem) {
      System.exit(0);
    }  // end of if

	// handle the click of the Calculate Button
	else if (source == calculateButton)
	{
		boolean xyOk = true;
		int x=0,y=0;
		
		// FINISH ME
		// get the text from the text field
		String xString = xTextField.getText().trim();
		
		if (!xString.equals(""))
		{
			// FINISH ME
			// get x as an integer
			x = Integer.parseInt(xString);
			
			// FINISH ME
			// set the text in the text field
			xBinaryTextField.setText(getBinaryString(x));
		}
		else
		{
			xyOk = false;
			// FINISH ME
			// set the text in the text field
			xBinaryTextField.setText("");
		}

		// FINISH ME
		// get the text 
		String yString = yTextField.getText().trim();
		
		if (!yString.equals(""))
		{
			// FINISH ME
			// get y as an integer
			y = Integer.parseInt(yString);
			
			// FINISH ME
			// set the text in the text field
			yBinaryTextField.setText(getBinaryString(y));
		}
		else
		{
			xyOk = false;
			// FINISH ME
			// set the text in the text field
			yBinaryTextField.setText("");
		}
		
		
		if (xyOk)
		{
			String xy = getBinaryString(x)+"\n"+
				        getBinaryString(y)+"\n";
				           
			String xAndY = xy + getAnd(x,y);
			String xOrY  = xy + getOr(x,y);
			String xXOrY = xy + getXOr(x,y);
			
			// FINISH ME
			// set the text in the text fields			
			xAndYBinaryTextArea.setText(xAndY);
			xOrYBinaryTextArea.setText(xOrY);
			xXOrYBinaryTextArea.setText(xXOrY);
		}
		else
		{
			// FINISH ME
			// set the text in the text field
			xAndYBinaryTextArea.setText("");			
			xOrYBinaryTextArea.setText("");
			xXOrYBinaryTextArea.setText("");
		}
	}
  }  // end of actionPerformed


  public String getBinaryString(int number)
  {
	String binaryString = "";
					
	int numBits = 1;
	while (numBits<=32)
	{
		// FINISH ME		
		// get the first bit
		int bit = 0x00000001 & number;
				
		// FINISH ME		
		// join it onto our output
		binaryString = bit + binaryString;
				
		// FINISH ME		
		// slide all the bits to the right by 1
		number = number >> 1;
		
		// FINISH ME		
		// add 1 to numBits
		numBits++;
		
	}
  	
  	return binaryString;
  	
  	
  }


  public String getAnd(int x, int y)
  {
  	// FINISH ME
  	// and x and y
  	int andOfXY = x & y;
  	return getBinaryString(andOfXY);
 // FINISH ME
   	// return andOfXY as a binary string
 	// call getBinaryString and pass it your int

  }
  
  public String getOr(int x, int y)
  {
  	// FINISH ME
  	// or x and y
  	int orOfXY = x|y;
  	return getBinaryString(orOfXY);
  	// FINISH ME
  	// return orOfXY as a binary string
	// call getBinaryString and pass it your int
	
	
  }

  public String getXOr(int x, int y)
  {
  	// FINISH ME
  	// exclusive or x and y
	  int getXOr = x ^ y;
	  return getBinaryString(getXOr);
  	// FINISH ME
  	// return xOrOfXY as a binary string
	// call getBinaryString and pass it your int
	
	
  }

  
  // ***** main method *****
  public static void main(String[] arguments) {
    @SuppressWarnings("unused")
	Bitwise bitwise = new Bitwise( );
  }
  
} // end of class Bitwise