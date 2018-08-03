package Calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener,FocusListener
{
	// global or instance variables go here  (no commands)
    // the main panel
    JPanel mainPanel = new JPanel();
    
    // Menu Bar 
	JMenuBar menuBar = new JMenuBar();

    // file menu
    JMenu     fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
   
	
	// calculate menu
	JMenu     calcMenu = new JMenu("Calculate");
	JMenuItem calcMenuItem = new JMenuItem("Calculate");
	
	//textfields
	JTextField number1Field     = new JTextField("",8);
	JTextField operatorField   = new JTextField("",2);   
	JTextField number2Field = new JTextField("",8);
	JTextField finalNumField = new JTextField("",8);
	
	
    // buttons
    JButton calcButton = new JButton("Calculate");
    JButton exitButton = new JButton("Exit");
    JButton clearButton = new JButton("Clear");
    
    JButton exponentButton = new JButton("^");
    JButton timesButton = new JButton("*");
    JButton divideButton = new JButton("/");
    JButton plusButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton percentButton = new JButton("%");
    
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton zeroButton = new JButton("0");
    
    JButton negativeButton = new JButton("-");
    JButton periodButton = new JButton(".");
              
	//labels	
	JLabel equalLabel   = new JLabel("=");
	 
		
	//buttons for filler
	JLabel fillerLabel1 = new JLabel("           ");
	JLabel fillerLabel2 = new JLabel("           ");
	JLabel fillerLabel3 = new JLabel("           ");
	JLabel fillerLabel4 = new JLabel("           ");
	JLabel fillerLabel5 = new JLabel("           ");
	JLabel fillerLabel6 = new JLabel("           ");
	
    // create a panel for each BorderLayout position
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel centerPanel = new JPanel();
	
	
	int whichBox = 1;  // indicates which box the digit goes in
	char whichOperator = '+'; // indicates the current operator
	
	// constructor to initialize global or instance variables
	public Calculator()
	{
		super("Calculator");
		setSize(500,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// call addActionListener(this) for each menuItem
		calcMenuItem.addActionListener(this);
		exitMenuItem.addActionListener(this);
		calcButton.addActionListener(this);
		exitButton.addActionListener(this);
		clearButton.addActionListener(this);
		
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		
		plusButton.addActionListener(this);
		subtractButton.addActionListener(this);
		exponentButton.addActionListener(this);
		timesButton.addActionListener(this);
		divideButton.addActionListener(this);
		percentButton.addActionListener(this);
		// FINISH ME
		
		
		periodButton.addActionListener(this);
		
        // this will allow us to see who has the focus
        number1Field.addFocusListener(this);
        number2Field.addFocusListener(this);
        
        // we don't want them to enter this, we will calc it for them
        finalNumField.setEnabled(false);

                
        // create layout managers for the panels
        BorderLayout b1 = new BorderLayout();
        mainPanel.setLayout(b1);
        
        GridLayout eastLayout = new GridLayout(5,1);
        eastPanel.setLayout(eastLayout);
        
        GridLayout centerLayout = new GridLayout(4,3);
        centerPanel.setLayout(centerLayout);
        
        GridLayout westLayout = new GridLayout(4,1);
        westPanel.setLayout(westLayout);
        
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        southPanel.setLayout(fl);
        northPanel.setLayout(fl);
        
        

        // add components to the center panel (i.e. labels, fields, etc.)
		centerPanel.add(sevenButton);
		centerPanel.add(eightButton);
		centerPanel.add(nineButton);
		centerPanel.add(fourButton);
		centerPanel.add(fiveButton);
		centerPanel.add(sixButton);
		centerPanel.add(oneButton);
		centerPanel.add(twoButton);
		centerPanel.add(threeButton);
		centerPanel.add(zeroButton);
		centerPanel.add(periodButton);
		centerPanel.add(negativeButton);
		
		eastPanel.add(plusButton);
		eastPanel.add(subtractButton);
		eastPanel.add(timesButton);
		eastPanel.add(divideButton);
		eastPanel.add(percentButton);
		
		westPanel.add(clearButton);
		westPanel.add(exponentButton);
		westPanel.add(fillerLabel1);
		westPanel.add(fillerLabel2);
        
        // add components to the other panels
		northPanel.add(number1Field);
		northPanel.add(operatorField);
		northPanel.add(number2Field);
		northPanel.add(equalLabel);
		northPanel.add(finalNumField);
		
		
		southPanel.add(calcButton);
		southPanel.add(exitButton);
				
	
				
        // **** add menu items to the menus
		calcMenu.add(calcMenuItem);
		fileMenu.add(exitMenuItem);

        // **** add the menus to the bar
		menuBar.add(fileMenu);
        menuBar.add(calcMenu);
        // **** set the bar to be the menu bar
		setJMenuBar(menuBar);

        
        // add each panel to the mainPanel
        mainPanel.add(northPanel,BorderLayout.NORTH);
        mainPanel.add(southPanel,BorderLayout.SOUTH);
        mainPanel.add(eastPanel,BorderLayout.EAST);
        mainPanel.add(westPanel,BorderLayout.WEST);
		mainPanel.add(centerPanel,BorderLayout.CENTER);

                
        // make the mainPanel be the main content area and show it
        setContentPane(mainPanel);
        setVisible(true);

	}

    public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Calculator cal = new Calculator();
	}
	

    // this method is in the FocusListener interface 
    public void focusGained(FocusEvent fe)
    {
		Object source = fe.getSource();
    	if (source == number1Field)
    	  whichBox = 1;
    	else if (source == number2Field)
    	  whichBox = 2;
    }
    
    // this method is in the FocusListener interface 
    public void focusLost(FocusEvent fe)
    {
    	// nothing we want to do, but it must be here
    }
    
    // this method adds a string to the right of a number field
    public void addDigit(String key)
    {
			if (whichBox == 1) // if whichBox is number1Field
			{
				String s = number1Field.getText();
				number1Field.setText(s+key);
			}
			else
			{
				String s = number2Field.getText();
				number2Field.setText(s+key);
			}    	
    }
    
    public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if ( (source == exitMenuItem) || (source == exitButton) )
		{
			System.exit(0);			
		}
		
		else if (source == oneButton)
		{
			addDigit("1");
		}
		
		else if (source == twoButton)
		{
			addDigit("2");
		}
		
		else if (source == threeButton)
		{
			addDigit("3");
		}
		
		else if (source == fourButton)
		{
			addDigit("4");
		}
		
		else if (source == fiveButton)
		{
			addDigit("5");
		}
		
		else if (source == sixButton)
		{
			addDigit("6");
		}
		
		else if (source == sevenButton)
		{
			addDigit("7");
		}
		
		else if (source == eightButton)
		{
			addDigit("8");
		}
		
		else if (source == nineButton)
		{
			addDigit("9");
		}
		
		else if (source == zeroButton)
		{
			addDigit("0");
		}
		
		else if (source == periodButton) {
			addDigit(".");
		}

		else if (source == plusButton)
		{
			operatorField.setText("+");
			whichOperator = '+';
		}
		
		else if (source == subtractButton)
		{
			operatorField.setText("-");
			whichOperator = '-';
		}
		
		else if (source == timesButton)
		{
			operatorField.setText("x");
			whichOperator = '*';
		}
		
		else if (source == divideButton)
		{
			operatorField.setText("/");
			whichOperator = '/';
		}
		
		else if (source == percentButton)
		{
			operatorField.setText("%");
			whichOperator = '%';
		}
		else if (source == exponentButton) {
			operatorField.setText("^");
			whichOperator = '^';
		}
		// FINISH ME - add more button checks



		else if (source == clearButton)
		{
			number1Field.setText("");
			number2Field.setText("");
			operatorField.setText("");
			finalNumField.setText("");
			whichBox = 1;
		}
		
		else if ( (source == calcMenuItem) || (source == calcButton) )
		{
		  try
		  {
            
            String s1 = number1Field.getText();
            String s2 = number2Field.getText();
            
            if (s1.contains("/") && s2.contains("/"))
            {
            	// display the result as a fraction
            	Fraction f1 = new Fraction(s1);
            	Fraction f2 = new Fraction(s2);
            	Fraction result = null;
            	
            	if (whichOperator == '+')
            	{
            		result = f1.add(f2);
            	}
            	else if (whichOperator == '-')
            	{
            		result = f1.subtract(f2);
            	}
            	else if (whichOperator == '*') {
            		result = f1.multiply(f2);
            	}
            	else if (whichOperator == '/') {
            		result = f1.divide(f2);
            	}
            	
            	
            	finalNumField.setText(result.toString());
            }
            else
            {
            	double x=0;
            	double y=0;
            	double z=0;
            	
            	if (s1.contains("/"))
            	{
            		// FINISH ME
            		// build a Fraction object and call getDoubleValue()
            		// x = 
            		Fraction f = new Fraction(s1);
            		x = f.getDoubleValue();
            	}
            	else
            	{
            		x = Double.parseDouble(s1);
            	}

				// FINISH ME
            	// now do the same for y
            	if (s2.contains("/"))
            	{
            		// FINISH ME
            		// build a Fraction object and call getDoubleValue()
            		// x = 
            		Fraction f = new Fraction(s2);
            		y = f.getDoubleValue();
            	}
            	else
            	{
            		y = Double.parseDouble(s2);
            	}
            	
            	
            	
            	
            	
				if (whichOperator == '+')
				{
			  		z = x + y;
				}
				else if (whichOperator == '-')
				{
			  		z = x - y;
				}
				else if (whichOperator == '*') {
					z = x * y;
				}
				else if (whichOperator == '/') {
					z = x / y;
				}
				else if (whichOperator == '%') {
					z = x % y;
				}
				else if (whichOperator == '^') {
					z = Math.pow(x, y);
				}
		 
				DecimalFormat df = new DecimalFormat("0.0000");

            
				finalNumField.setText(df.format(z));
            }
            
		  }
		  catch (Exception event)	
		  {
		  	System.out.println("Error in Calculating");
		  }
		}
				
	} // end of actionPerformed method
	
	
	class Fraction
	{
		int numerator;
		int denominator;
		
		public Fraction(int numerator, int denominator)
		{
			this.numerator = numerator;
			this.denominator = denominator;
			
			reduce();
		}
		
		public Fraction(String fraction)
		{
			// parse the input   "4/8"  think Scanner and useDelimeter
			Scanner scan = new Scanner(fraction);
			scan.useDelimiter("/");
			
			// FINISH ME
			// assign values to the instance variables
			numerator = scan.nextInt();
			denominator = scan.nextInt();
			
			reduce();
			
		}

		private void reduce()
		{
			int gcf = 1;
			for (int d = 1; d <= numerator; d++) {
				if (numerator % d == 0 && denominator % d == 0) {
					gcf = d; 
				}
			}
			numerator = numerator / gcf;
			denominator = denominator / gcf;
		}
		
		public Fraction add(Fraction other)
		{
			// do not modify this Fraction!!!!!!
			// add this Fraction and the other Fraction
			// create a new Fraction object and return it
			int newNum = numerator*other.denominator + denominator * other.numerator;
			
			
			// FINISH ME			
			int newDen = denominator*other.denominator; // FIX ME 
			return new Fraction(newNum,newDen);	
		}

		public Fraction subtract(Fraction other)
		{
			int newNum = numerator*other.denominator - denominator * other.numerator;

			int newDen = denominator*other.denominator; // FIX ME 
			return new Fraction(newNum,newDen);		
		}
		
		public Fraction multiply(Fraction other) {
			int newNum = numerator * other.numerator;
			int newDen = denominator * other.denominator;
			
			return new Fraction(newNum, newDen);
		}
		
		public Fraction divide(Fraction other) {
			int newNum = numerator * other.denominator;
			int newDen = denominator * other.numerator;
			
			return new Fraction(newNum, newDen);
		}
		
		
		public double getDoubleValue()
		{
			return (double) numerator/denominator;
		}
		
		public String toString()
		{
			// if you have 5/1 return 5
			// otherwise return as shown below
			return numerator + "/" + denominator;
		}
	} // end of class Fraction 	
	
} // end of 