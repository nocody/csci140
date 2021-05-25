
/**
 * MethodsProgram.java
 * 
 * Program that implements the Pig Latin, the Light Years, Print Box, and Print Pyramid Java Program
 * Described in CSCI 140 Homework 6. 
 * 
 * 
 * @author Nick Cody
 * @course csci140-01
 * @version 1.0
 */

import java.util.Scanner;

public class MethodsProgram {


	
    /**
     * This method contains the main algorithm and should be
     * 	 	complete. Please look at how this is set-up.
     *            You will need to add and uncomment portions 
	 *			  of code as you implement the methods below.
     */
	public static final String WELCOME = "Welcome to MethodsProgram! \n";
	public static final String EXIT  = "Thank you for using MethodsProgram! \n";
	public static final String ERROR = "ERROR: invalid input. \n";
	public static final String AY = "ay";
	public static final char[] VOWELS =  {'a', 'e', 'i', 'o', 'u'};
	public static final String GREETING = " ";
	public static final double KMPERLIGHTYEAR = 0.00000000000010570;
	public static Scanner kb = new Scanner(System.in);
	public static final String DONE = "done";
	public static final String DISTANCE = "distance to light years";
	public static final String PIG = "pig latin";
	public static final String BOX = "print box";
	public static final String PYRAMID = "print pyramid";
    public static void main(String[] args) {
		
    	//1. declare variables
		/**
		 * Constants
		 * Could you add more constants
		 */
    	
	
		int x = 0;
		int userChoice = 0;
		String userInput = "";
    	
    	//2. display greeting
		displayGreeting();
    	
		//printPyramid(17);
		
    	do{
			
    		//3. show menu and get user input
    		userInput = showMenu(kb);
    		
    		//4. user enters distance in light years
    		if(userInput.equalsIgnoreCase(DISTANCE))
    		{
    			//4a. handle distance in light years
    			//printIt("Initiating light years.");
    			handleDistanceInLightYears();
    		}
    		//5. user enters pig latin
    		else if(userInput.equalsIgnoreCase(PIG))
    		{
    			printIt("Initiating pig latin.");
    			//5a. handle pig latin
    			handlePigLatin();
    		}
    		//7. user enters print box
    		else if(userInput.equalsIgnoreCase(BOX))
    		{
    			printIt("Enter an odd number: ");
    			userChoice = kb.nextInt();
    			if(userChoice % 2 == 0) 
    			{
    			//5a. handle print box
    				printBox(userChoice);
    			}
    			else 
    			{
    				printIt(userChoice + " is not an odd number.");	
    			}
    		}
    		else if(userInput.equalsIgnoreCase(PYRAMID))
    		{
    			printIt("Enter an odd number: ");
    			userChoice = kb.nextInt();
    			if(userChoice % 2 != 0) 
    			{
    			//5a. handle print box
    				printPyramid(userChoice);
    			}
    			else 
    			{
    				printIt(userChoice + " is not an odd number.");	
    			}
    		}
    		//7. user enters invalid input
    		else if(userInput.equalsIgnoreCase(DONE)) 
    		{
    			printIt(EXIT);
    			return;
    		}
    		else
    		{
    			//7a. handle error
    			handleError();
    		}
			
    	}while(!userInput.equalsIgnoreCase(DONE));
		
		
    } // end main method
	
	
	/**
	 * public static void displayGreeting()
	 * @return the program has displayed a greeting
	 */
    public static void displayGreeting(){
    	printIt(WELCOME);
    	
    }
	
	/**
	 * public static String showMenu()
     *
     * @param input is a valid Scanner object (not null)
	 * @return the user has been asked to enter their choice,
	 * 	   based on the MENU options. That value is returned.
	 */
    public static String showMenu(Scanner input){
		/**
		 * Constants
		 */
		final String MENU = "Enter \"pig latin\" to convert a phrase" 
			+ "\nEnter \"distance to light years\" to convert a distance"
			+ "\nEnter \"print box\" to print a box made of Xs"
			+ "\nEnter \"print pyramid\" to print a pyramid made of Xs"
			+ "\nEnter \"Done\" to exit the program";
    	
		// your code goes here
		
		printIt(MENU);
		
		String choice = input.nextLine();
    	//printIt(choice);
    	return choice; // just to make the compiler happy - change this
    }

      

    
    /**
     * public static void handleDistanceInLightYears()
     * 
	 * @return the user has been asked to enter a distance in
	 *       in kilometers has been converted to distance in light-
	 *       years and displayed to the console
	 *       
	 * Note: this method should call the light years problem
	 *       described in the homework assignment, which you will also have to create!
	 *       
	 *       add your method here
	 */
    


    
    
    public static void handleDistanceInLightYears() {
    	double km = 0;
    	double lightYears = 0;
    	printIt("Enter a distance in Kilometers: \n");
    	km = kb.nextDouble();
    	lightYears = km / KMPERLIGHTYEAR;
    	printIt( km + " kilometers is equal to " + lightYears + " light years. \n");
    }
    
    
    
    
    
    
    /**
     * public static void handlePigLatin()
     * 
     * @return the user has been asked to enter a word or
     *     phrase and that word or phrase has been converted and 
     *     displayed to the console
     *       
     * Note: this method should call the pig latin method indicated
     *       in your homework assignment.
     *       
     *       add your method here
     */
    
    public static void handlePigLatin() 
    {
    	String input = " ";
     
    	printIt("Enter a word: ");
    	input = kb.next();
    	char[] inputArray = input.toCharArray();
    	
    	char [] pigLatArray = new char[inputArray.length + 4];
    	//System.out.println(firstChar);
    	boolean firstCharIsVowel = false;
    	for(char vowel : VOWELS)
    	{
    	 if(inputArray[0] == vowel)
    	 {
    		 firstCharIsVowel = true;
    	 }
    	}
    	//System.out.println(firstCharIsVowel);
    	if(firstCharIsVowel) 
    	{
    	 for(int i = 0; i < inputArray.length; i++ ) 
    	 {
    		pigLatArray[i] = inputArray[i]; 
    	 }
    	 
    	 //System.out.println(pigLatArray);
    	 pigLatArray[inputArray.length] = 'a';
    	 pigLatArray[inputArray.length + 1] = 'y';
    	//System.out.println(pigLatArray);
    	}
    	else {
    		pigLatArray[inputArray.length - 1] = inputArray[0];
    		for(int i = 0; i < inputArray.length - 1; i++ ) 
       	 {
       		pigLatArray[i] = inputArray[i + 1]; 
       	 }
    	 pigLatArray[inputArray.length] = 'a';
       	 pigLatArray[inputArray.length + 1] = 'y';
       	 
    	}
    	System.out.println(pigLatArray);
    }
    



    
    /**
     * This method prints a box composed Xs with a height and width equal to the parameter
     * @param x - any positive odd integer.
     */
    
    
    public static void printBox(int length) 
    {
    	for(int col = 0; col <= length; col++) 
    	{
    		if(col == 0 || col == length) 
    		{
    			for(int i = 0; i < length; i++) 
    			{
    				printIt("X");
    			}
    			System.out.println();
    		}
    		else 
    		{
    			for(int i = 0; i <= length; i++) 
    			{
    				if(i == 0 || i == length) 
    				{
    					printIt("X");
    				}
    				else 
    				{
    					printIt(" ");
    				}
    				
    			}
    			System.out.println();
    		}
    	}
    }
    /**
     * This method prints a pyramid composed of Xs with a height equal the parameter and a max width equal to the median 
     * @param x - any positive odd integer.
     */
    public static void printPyramid(int height) 
    {
    	for(int i = 0; i <= (height / 2); i++) 
		{
    		for (int col = 0; col <= i; col++) 
			{
				System.out.print("X");
			}
		System.out.println();
		}
    	
    	for(int i = 1; i <= height; i++) 
		{
    		for (int col = (height / 2); col >= i; col--) 
			{
				System.out.print("X");
			}
		System.out.println();
		}
	
    }
   
    /**
     * This method prints the parameter value
     * @param x - any String, double, or int value
     */
    public static void printIt(String x)
    {
    	
    	System.out.print(x);
    }
    public static void printIt(double x)
    {
    	
    	System.out.print(x);
    }
    public static void printIt(int x)
    {
    	
    	System.out.print(x);
    } 
    /**
     * Prints an error message
     * @param
     */
    public static void handleError() {
    	printIt(ERROR);
    }

} //end MethodsProgram class
