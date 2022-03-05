/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 16, 2021
* Description:
* This program uses math methods
* It can...
* Find the largest of two numbers 
* Find the smallest of two numbers
* Raise a base to any power
* Find the hypotenuse of a triangle
* Round a decimal up or down
* Find the square root of a number
* Convert an angle in degrees to radians
* Displays information through a GUI
*/

//Import classes used for the GUI
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

class Main {
  //Class variables
  //All the elements needed to build GUI 
  static JFrame frmMain;

  static JLabel lblTitle;

  static JLabel lblLargest;
  static JLabel lblSmallest;
  static JLabel lblPowerOf;
  static JLabel lblHypotenuse;
  static JLabel lblRoundDown;
  static JLabel lblRoundUp;
  static JLabel lblSquareRoot;
  static JLabel lblRadians;
  
  static JTextField txtLargestOne;
  static JTextField txtLargestTwo;
  static JTextField txtSmallestOne;
  static JTextField txtSmallestTwo;
  static JTextField txtBase;
  static JTextField txtPower;
  static JTextField txtHypOne;
  static JTextField txtHypTwo;
  static JTextField txtRoundDown;
  static JTextField txtRoundUp;
  static JTextField txtSqrt;
  static JTextField txtRadians;

  static JTextArea txtLargest;
  static JTextArea txtSmallest;
  static JTextArea txtPowerOf;
  static JTextArea txtHypotenuse;
  static JTextArea txtDown;
  static JTextArea txtUp;
  static JTextArea txtSquareRoot;
  static JTextArea txtInRadians;

  static JButton btnLargest;
  static JButton btnSmallest;
  static JButton btnPowerOf;
  static JButton btnHypotenuse;
  static JButton btnRoundDown;
  static JButton btnRoundUp;
  static JButton btnSquareRoot;
  static JButton btnRadians;
  
  //Stores the first number to find the largest
  static double largeOne;
  //Stores the second number to find the largest 
  static double largeTwo;
  //Stores the first number to find the smallest
  static double smallOne;
  //Stores the second number to find the smallest
  static double smallTwo;
  //Stores the base value
  static double base;
  //Stores the power value
  static double power;
  //Stores one side of the triangle to 
  //find the hypotenuse
  static double sideA;
  //Stores the other side of the triangle
  static double sideB;
  //Stores the number to round down
  static double roundDown;
  //Stores the number to round up
  static double roundUp;
  //stores the number to find square root
  static int squareRoot;
  //stores the angle to turn into radians
  static double radians;
  
  //stores the answer for largest number
  static String largeAnswer;
  //stores the answer for smallest number
  static String smallAnswer;
  //stores the answer for base raised to a power
  static String powerAnswer;
  //stores the answer to the hypotenuse of the triangle
  static String hypAnswer;
  //stores the answer to the number rounded down
  static String downAnswer;
  //stores the answer to the number rounded up
  static String upAnswer;
  //stores the answer to the square root of a number
  static String sqrtAnswer;
  //stores the answer for the angle in degrees
  //converted to radians
  static String radiansAnswer;

  static double hypValue;
  static double radValue;
  
    public static void main(String[] args) {
        /*
        * Initialize all GUI elements and place them in the form
        */
        //setting up the main frame
        frmMain = new JFrame("Magical Math Methods");
        //stops program when user closes window
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //allows for specific element locations
        frmMain.setLayout(null);
        //makes window visible to user
        frmMain.setVisible(true);
        frmMain.setBounds(10, 10, 850, 600);
        
        //setting title position and adding to frame
        lblTitle = new JLabel("Magical Math Methods");
        lblTitle.setBounds(275, 10, 300, 20);
        frmMain.add(lblTitle);

        //add largest number label
        lblLargest = new JLabel("Enter two numbers then click the button. The "
                + "program will display the largest of the two numbers:");
        lblLargest.setBounds(10, 40, 700, 20);
        frmMain.add(lblLargest);
        //add text field for first number to find the largest
        txtLargestOne = new JTextField();
        txtLargestOne.setBounds(10, 70, 50, 30);
        frmMain.add(txtLargestOne);
        //add text field for second number to find the largest
        txtLargestTwo = new JTextField();
        txtLargestTwo.setBounds(100, 70, 50, 30);
        frmMain.add(txtLargestTwo);
        //add button to find the largest number
        btnLargest = new JButton("Largest");
        btnLargest.setBounds(200, 70, 100, 30);
        frmMain.add(btnLargest);
        //add text area to show largest number
        txtLargest = new JTextArea("...");
        txtLargest.setBounds(400, 70, 50, 30);
        //makes text area not editable 
        txtLargest.setEditable(false); 
        frmMain.add(txtLargest);
        
        //add smallest number label
        lblSmallest = new JLabel("Enter two numbers then click on the button. "
                + "The program will display the smallest of the two numbers:");
        lblSmallest.setBounds(10, 100, 800, 20);
        frmMain.add(lblSmallest);
        //add text field for first number to find the smallest
        txtSmallestOne = new JTextField();
        txtSmallestOne.setBounds(10, 130, 50, 30);
        frmMain.add(txtSmallestOne);
        //add text field for first number to find the smallest
        txtSmallestTwo = new JTextField();
        txtSmallestTwo.setBounds(100, 130, 50, 30);
        frmMain.add(txtSmallestTwo);
        //add button to find the smallest number
        btnSmallest = new JButton("Smallest");
        btnSmallest.setBounds(200, 130, 100, 30);
        frmMain.add(btnSmallest);
        //add text area to show smallest number
        txtSmallest = new JTextArea("...");
        txtSmallest.setBounds(400, 130, 50, 30);
        //makes text area not editable
        txtSmallest.setEditable(false);
        frmMain.add(txtSmallest);
        
        //add power of a number label
        lblPowerOf = new JLabel("Enter two numbers then click the button. "
                + "The program will display the first number to the power of the "
                + "second:");
        lblPowerOf.setBounds(10, 160, 800, 20);
        frmMain.add(lblPowerOf);
        //add text field for base
        txtBase = new JTextField();
        txtBase.setBounds(10, 190, 50, 30);
        frmMain.add(txtBase);
        //add text field for power
        txtPower = new JTextField();
        txtPower.setBounds(100, 190, 50, 30);
        frmMain.add(txtPower);
        //add button to raise base to the power
        btnPowerOf = new JButton("To the power of");
        btnPowerOf.setBounds(200, 190, 175, 30);
        frmMain.add(btnPowerOf);
        //add text area to show the result 
        txtPowerOf = new JTextArea("...");
        txtPowerOf.setBounds(400, 190, 50, 30);
        //makes text area not editable 
        txtPowerOf.setEditable(false);
        frmMain.add(txtPowerOf);

        //add hypotenuse label
        lblHypotenuse = new JLabel("Enter the lengths of two sides of a right "
                + "angle triangle. The program will display the hypotenuse of "
                + "the triangle:");
        lblHypotenuse.setBounds(10, 220, 800, 20);
        //add text field for first side of triangle
        frmMain.add(lblHypotenuse);
        txtHypOne = new JTextField();
        txtHypOne.setBounds(10, 250, 50, 30);
        frmMain.add(txtHypOne);
        //add text field for second side of triangle 
        txtHypTwo = new JTextField();
        txtHypTwo.setBounds(100, 250, 50, 30);
        frmMain.add(txtHypTwo);
        //add button to calculate the hypotenuse of the triangle
        btnHypotenuse = new JButton("Hypotenuse");
        btnHypotenuse.setBounds(200, 250, 150, 30);
        frmMain.add(btnHypotenuse);
        //add text area to show the hypotenuse
        txtHypotenuse = new JTextArea("...");
        txtHypotenuse.setBounds(400, 250, 50, 30);
        //makes the text area not editable
        txtHypotenuse.setEditable(false);
        frmMain.add(txtHypotenuse);
        
        //add rounded down label
        lblRoundDown = new JLabel("Enter a decimal value. The program will "
                + "round down to the nearest integer:");
        lblRoundDown.setBounds(10, 280, 700, 20);
        frmMain.add(lblRoundDown);
        //add text field for the decimal
        txtRoundDown = new JTextField();
        txtRoundDown.setBounds(10, 310, 50, 30);
        frmMain.add(txtRoundDown);
        //add button to round the number down
        btnRoundDown = new JButton("Rounded Down");
        btnRoundDown.setBounds(200, 310, 150, 30);
        frmMain.add(btnRoundDown);
        //add text area to show the rounded number
        txtDown = new JTextArea("...");
        txtDown.setBounds(400, 310, 50, 30);
        //makes the text area not editable 
        txtDown.setEditable(false);
        frmMain.add(txtDown);
        
        //add rounded up label
        lblRoundUp = new JLabel("Enter a decimal value. The program will "
                + "round up to the nearest integer:");
        lblRoundUp.setBounds(10, 340, 700, 20);
        frmMain.add(lblRoundUp);
        //add text are for the decimal value
        txtRoundUp = new JTextField();
        txtRoundUp.setBounds(10, 370, 50, 30);
        frmMain.add(txtRoundUp);
        //add button to round the number up
        btnRoundUp = new JButton("Rounded Up");
        btnRoundUp.setBounds(200, 370, 150, 30);
        frmMain.add(btnRoundUp);
        //add text area to show the rounded number
        txtUp = new JTextArea("...");
        txtUp.setBounds(400, 370, 50, 30);
        //makes the text area not editable 
        txtUp.setEditable(false);
        frmMain.add(txtUp);
        
        //add square root label
        lblSquareRoot = new JLabel("Enter an integer. The program will display "
                + "the square root of the integer");
        lblSquareRoot.setBounds(10, 400, 700, 20);
        frmMain.add(lblSquareRoot);
        //add text area for integer 
        txtSqrt = new JTextField();
        txtSqrt.setBounds(10, 430, 50, 30);
        frmMain.add(txtSqrt);
        //add button to calculate square root 
        btnSquareRoot = new JButton("Square Root");
        btnSquareRoot.setBounds(200, 430, 150, 30);
        frmMain.add(btnSquareRoot);
        //add area to show the root 
        txtSquareRoot = new JTextArea("...");
        txtSquareRoot.setBounds(400, 430, 50, 30);
        //makes the text area not editable
        txtSquareRoot.setEditable(false);
        frmMain.add(txtSquareRoot);
        
        //add radians label
        lblRadians = new JLabel("Enter an angle in degrees. The program will "
                + "display the angle in radians:");
        lblRadians.setBounds(10, 460, 700, 30);
        frmMain.add(lblRadians);
        //add text area for angle in degrees
        txtRadians = new JTextField();
        txtRadians.setBounds(10, 490, 50, 30);
        frmMain.add(txtRadians);
        //add button to convert angle in degrees to radians
        btnRadians = new JButton("In Radians");
        btnRadians.setBounds(200, 490, 150, 30);
        frmMain.add(btnRadians);
        //add text area to show angle in radians
        txtInRadians = new JTextArea("...");
        txtInRadians.setBounds(400, 490, 50, 30);
        //makes text area not editable 
        txtInRadians.setEditable(false);
        frmMain.add(txtInRadians);
        
        //adds button to find largest number to action listener 
        btnLargest.addActionListener((ActionEvent e)-> {
            //converts strings into doubles
            largeOne = Double.parseDouble(txtLargestOne.getText());
            largeTwo = Double.parseDouble(txtLargestOne.getText());
            
            //find the largest of the two numbers 
            //Stores answer as a string 
            largeAnswer = String.valueOf(Math.max(largeOne, largeTwo));
            //puts answer into text area for user
            txtLargest.setText(largeAnswer);
        });//end of action listener for this button 
        
        //adds button to find smallest button to action listener 
        btnSmallest.addActionListener((ActionEvent e)-> {
            //converts strings into doubles 
            smallOne = Double.parseDouble(txtSmallestOne.getText());
            smallTwo = Double.parseDouble(txtSmallestTwo.getText());
            
            //find the smallest of the two numbers 
            //Stores answer as a string 
            smallAnswer = String.valueOf(Math.min(smallOne, smallTwo));
            //puts answer into text area for user
            txtSmallest.setText(smallAnswer);
        });//end of action listener for this button
        
        //adds button to raise a number to the action listener
        btnPowerOf.addActionListener((ActionEvent e)-> {
            //converts strings into doubles
            base = Double.parseDouble(txtBase.getText());
            power = Double.parseDouble(txtPower.getText());
            
            //raises the base to the power the user chose
            //Stores answer as a string 
            powerAnswer = String.valueOf(Math.pow(base, power));
            //puts the answer in the text area for the user
            txtPowerOf.setText(powerAnswer);
        });//end of action listener for this button 
        
        //adds button to find hypotenuse of triangle to action listener
        btnHypotenuse.addActionListener((ActionEvent e)-> {
            //converts strings into doubles 
            sideA = Double.parseDouble(txtHypOne.getText());
            sideB = Double.parseDouble(txtHypTwo.getText());
            
            //calculates the hypotenuse of the triangle
            hypValue = Math.hypot(sideA, sideB);
            //Rounds to 2 decimal places 
            hypValue = hypValue * 100;
            hypValue = Math.round(hypValue);
            hypValue = hypValue / 100;
            //Stores answer as a string 
            hypAnswer = String.valueOf(hypValue);
            //puts the answer in the text area for the user
            txtHypotenuse.setText(hypAnswer);    
        });//end of action listener for this button
        
        //adds button that rounds down to action listener
        btnRoundDown.addActionListener((ActionEvent e)-> {
            //converts string into double
            roundDown = Double.parseDouble(txtRoundDown.getText());
            
            //rounds the decimal down
            //Stores answer as a string 
            downAnswer = String.valueOf(Math.floor(roundDown));
            //puts answer in text area for user
            txtDown.setText(downAnswer);
        });//end of action listener for this button
        
        //adds button that rounds up to action listener
        btnRoundUp.addActionListener((ActionEvent e)-> {
            //converts string into double
            roundUp = Double.parseDouble(txtRoundUp.getText());
            
            //rounds decimal up
            //Stores answer as a string 
            upAnswer = String.valueOf(Math.ceil(roundUp));
            //puts answer in text area for the user
            txtUp.setText(upAnswer);
        });//end of action listener this button 
        
        //adds button that finds square root to action listener 
        btnSquareRoot.addActionListener((ActionEvent e)-> {
            //converts string into integer
            squareRoot = Integer.parseInt(txtSqrt.getText());
            
            //finds the square root of the number
            //Stores answer as a string 
            sqrtAnswer = String.valueOf(Math.sqrt(squareRoot));
            //puts the answer in the text area for the user
            txtSquareRoot.setText(sqrtAnswer);
        });//end of action listener for this button
        
        //adds button that finds angle in radians to action listener
        btnRadians.addActionListener((ActionEvent e)-> {
            //converts string to double
            radians = Double.parseDouble(txtRadians.getText());
            
            //converts angle in degrees to radians
            radValue = Math.toRadians(radians);
            //Rounds answer to 2 decimal places
            radValue = radValue * 100;
            radValue = Math.round(radValue);
            radValue = radValue / 100;
            //Stores answer as a string 
            radiansAnswer = String.valueOf(radValue);
            //puts answer in text area for user
            txtInRadians.setText(radiansAnswer);
        });//end of action listener for this button
    }//end of main method
    
}//end of class method 
