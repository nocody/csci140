/**
 * 
 */

/**
 * @author nickcody
 * @date 03/26/2019
 * @class csci 140l
 * @lab lab 11
 * @email njcody@coastal.edu
 */
import java.util.Scanner;

public class Lab11 {

	/**
	 * @param args
	 */
	public static Scanner keyboard = new Scanner(System.in);
	public static final String PROGRAM_DESCRIPTION = "This program...";//FIXME finish copy
	public static final String MENU = "$~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~$\n"+
									  "| Enter vowels - to count vowels        |\n"+
									  "| Enter words - to count words          |\n"+
									  "| Enter quit - to exit program          |\n"+
									  "$~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~$"; //FIXME
	public static final String BREAK = "________________________________________"; //FIXME
	public static final String VOWELS = "vowels"; //FIXME
	public static final String VOWEL_MESSAGE = "Enter a word or words and the number of vowels will be determined:"; //FIXME
	public static final String WORDS_MESSAGE = "words"; //FIXME
	public static final String WORDS = "words"; //FIXME
	public static final String QUIT = "quit"; //FIXME
	public static final String PUNCTUATION = "punctuation"; //FIXME
	public static final String NAME = "Please enter your name: "; //FIXME
	public static final String WELCOME = ", welcome to Lab 11, we will be analyzing Strings today!";
	public static final String GOODBYE = "Goodbye.";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. declare variables
		String userName = " ";
		String userChoice = " ";
		//2. prompt user for name
		//3. display greeting
		
		printDescription();
		userName = getInput(NAME);
		printStatement(userName + WELCOME);
		userChoice = displayMenu();
		//printStatement(userChoice);
		//4. --loop
		do {
			if(userChoice.equalsIgnoreCase(VOWELS)) {
				//printStatement(userChoice);
				handleVowels(userChoice);
			}	
			else if(userChoice.equalsIgnoreCase(WORDS)) {
				handleWords();
			}		
		}while(!userChoice.equalsIgnoreCase(QUIT)); 
			printStatement(GOODBYE);
		
	}
	//1. create method that prints brief program description
	/**
	 * @description 
	 * @param 
	 * 
	 * */
	public static void printDescription() {
		printStatement(PROGRAM_DESCRIPTION);
	}
	
	public static void printStatement(String statement) {
		System.out.println(statement);
	}
	public static void printStatement(int statement) {
		System.out.println(statement);
	}
	
	
	//2. create method that prompts user to input string and returns that string
	public static String getInput(String prompt) {
		String userInput;
		printStatement(prompt);
		userInput = keyboard.next();
		return userInput;
	}
	//3. create method that displays menu, prompts user to input, and returns userinput 
	public static String displayMenu() {
		String userChoice;
		userChoice = getInput(MENU);
		return userChoice;
	} 
	
	//4. create method 
	public static void handleVowels(String userInput) {
		int numVowels = 0;
		 
		printStatement(VOWEL_MESSAGE);
		numVowels = countVowels(userInput);
		printStatement(numVowels);
		
	}
	//5. 
	public static void handleWords() {
		printStatement(WORDS_MESSAGE);
		}
	//6.
	public static void handlePunctuation() {
		printStatement(BREAK + "\n" + PUNCTUATION);
		}
	//7.
	public static int countVowels(String userInput) {
		int count = 0; 
		for (int i = 0; i < userInput.length(); i++) {
			if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'o' ||userInput.charAt(i) == 'u') {
				count++;
			}
		return count;
		}
	//8.
	public static int countWords(String x) {
			
		}
	//9.
	public static int countPunctuation(String x) {
		
		}
	}
	
	
}
