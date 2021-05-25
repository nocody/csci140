/**
 * lab10 - This program executes a series of user defined methods.
 * @author Nick Cody
 * @date 3/21/2019
 * @email njcody@coastal.edu
 * @class csci140l
 * @lab 10
 */

import java.util.Scanner;

public class lab10 {
	
	public static Scanner keyboard = new Scanner(System.in);
	public static final String ENTER_VAL = "Enter a double value: "; 
	public static final String BREAK = "+========================================================+\n" +
									   "|                                                   |\n" +
									   "+========================================================+\n"; 
	
	public static void main(String[] args) {
		double x = 0.0;
		double y = 0.0;
		double z = 0.0;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		
		printDescription();
		
		displayBreak();
		
		//x = getInput();
		//printMessage("" + x);
		x = getInput();
		y = getInput();
		z = sum( x, y);
		printMessage("The sum of " + x + " and " + y + " is: " + z);
		
		displayBreak();
		x = getInput();
		y = getInput();
		z = diff(x, y);
		printMessage("The difference between " + x + " and " + y + " is: " + z);
		
		displayBreak();
		a = getInput();
		b = getInput();
		c = getInput();
		z = smallest(a, b, c);
		printMessage("The smallest of " + a + ", " + b + ", and " + c + " is: " + z);
		
	}
	/**
	 * Prints a statement describing the program.
	 * 
	 */
	
	public static void printDescription() {
		printMessage("Lab09: this program continues to focus on methods.");
	}
	/**
	 * Prompt user for a double value and retrieve it.
	 * @param userInput - 
	 * @return
	 */
	public static double getInput () {
		printMessage(ENTER_VAL);
		double userInput = 0.0;
		userInput = keyboard.nextDouble();
		return userInput; 
	}
	
	/**
	 * Prints a visual break.
	 */
	public static void displayBreak() {
		printMessage(BREAK);
		
	}
	/**
	 * Sums the two double values input by the user
	 * @param x - first double input by the user
	 * @param y - second double input by the user
	 * @return - sum of parameters x and y
	 */
	public static double sum(double x, double y) {
		double z = 0.0;
		z = x + y;
		//printMessage("The sum of " + x + " and " + y + "is: " + z);
		return z;
	}
	/**
	 * Computes the difference between two double values.
	 * @param x - first double input by the user
	 * @param y - second double input by the user
	 * @return - difference of x and y
	 */
	public static double diff(double x, double y) {
		double z = 0.0;
		z = x - y;
		return z;
	}
	/**
	 * Finds the smallest of three double values.
	 * @param a - first double input by the user
	 * @param b - second double input by the user
	 * @param c - third double input by the user
	 * @return - smallest value
	 */
	public static double smallest(double a, double b, double c) {
		double d = 0.0;
		
		if(a < b && a < c) {
			d = a;
		}
		else if(b < a && b < c) {
			d = b;
		}
		else if(c < a && c < b) {
			d = c;
		}
		return d;
	}
	 /**
	  * Prints a string.
	  * @param x
	  */
	public static void printMessage(String x) {
		System.out.println(x);
	}
	
	
	
}
