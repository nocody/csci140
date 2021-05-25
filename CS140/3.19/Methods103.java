/**
 * print sentence backwards and the meaning of life
 */

/**
 * @author clintf
 *
 */

import java.util.Scanner;

public class Methods103 {
	
	public static final String GREETING = "Welcome to our methods program!";

	public static final String GOODBYE = "So long, have a nice day!";

	public static final String QUIT = "Quit";
	
	public static final String MEANING = "Meaning";
	
	public static final String BACKWARDS = "Backwards";
	
	public static final String POW = "Power";
	
	public static final String MENU ="*******************************************************\n" +
									 "* Enter Meaning to see the meaning of life            *\n" +
									 "* Enter Backwards to print a sentence backwards       *\n" +
									 "* Enter Power to calculate a number raised to a power *\n" +
									 "* Enter Quit to stop                                  *\n" +
									 "*******************************************************\n";
	
	public static final String BACKWARD_PROMPT = "Please enter a sentence: ";
	
	public static final String ERROR = ", is an invalid input, please try again.";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//1. declare variables
		Scanner keyboard = new Scanner(System.in);
		String selection = "no selection yet";
		
		//2. print greeting
		printMessage(GREETING);
		
		//3. loop until user is ready to quit
		//for(;!selection.equalsIgnoreCase(QUIT);) {
		while(!selection.equalsIgnoreCase(QUIT)) {
			//3a. print menu and get user selection
			//printMessage(MENU);
			selection = getUserInput(MENU, keyboard);
			//3b. if selection is print sentence backwards
			if(selection.equalsIgnoreCase(BACKWARDS)) {
				//printMessage("Backwards selected...");
				
				//3b1. print sentence backwards
				printSentenceBackwards(keyboard);
			}
			//3c. if seleciton is the meaning of life
			else if(selection.equalsIgnoreCase(MEANING)) {
				//printMessage("Meaning selected...");
				//3c1. print the meaning of life
				printMeaningOfLife(keyboard);
			}
			//3d. if selection is quit
			else if(selection.equalsIgnoreCase(QUIT)) {
				
				//printMessage("Quit selected");
				//do nothing or break out of loop
			}
			//3e. calculate the power of a number
			else if(selection.equalsIgnoreCase(POW)) {
				calculatePower(keyboard);
			}
			//3f. otherwise error
			else {
				//3d1. print error message
				printMessage(selection + ERROR);
			}
		
		}
		//print good bye message
		printMessage(GOODBYE);

	}

	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static String getUserInput(String message, Scanner input) {
		String response = "no response yet";
		
		printMessage(message);
		response = input.nextLine();
		
		return response;
	}
	
	public static int getUserInput(String message, Scanner input, int x) {
		
		int value = 0;
		
		printMessage(message);
		value = input.nextInt();
		input.nextLine(); //this just clears the newline char from the input
		
		return value;
	}
	
	
	public static void printSentenceBackwards(Scanner input) {
		printMessage("In printSentenceBackwards....");
		
		//1. declare variables
		String sentence = "no sentence yet";
		
		//2. prompt and get sentence from user
		sentence = getUserInput(BACKWARD_PROMPT, input);
		
		//3. printBackwards
		printBackwards(sentence);
	
	}
	
	public static void printBackwards(String line) {
		
		//1. declare variables
		
		//2. loop through line in reverse to print
		for(int index=line.length()-1; index>=0; index--) {
			System.out.print(line.charAt(index));
		}
		System.out.println();
	}
	
	
	public static void printMeaningOfLife(Scanner input) {
		printMessage("In printMeaningOfLife..");
		
		String name = "no name yet";
		
		name = getUserInput("Please enter your name: ", input);
		
		printMessage(name + ", the meaning of life is tihs and 42");
		
		
	}
	
	public static void calculatePower(Scanner keyboard) {
		//1. declare variables
		int number = 0;
		int power = 0;
		int answer = 0;
		
		//2. get the value from the user
		number = getUserInput("Please enter a number: ", keyboard, number);
		
		//3. get the power from the user
		power = getUserInput("Please enter a power: ", keyboard, number);
		
		//4. calculate the value raised to the power
		answer = Methods101.pow(number, power);
		
		//5. print the result
		printMessage("" + number + " raised to the power " + power +
				" is: " + answer);
		
	}
	
	
	
	
	
	
	
}
