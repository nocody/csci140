/**
 * 
 */

/**
 * @author clintf
 *
 */


import java.util.Scanner;

public class Methods101 {

	public static void printGoodbye() {
		System.out.println("Goodbye...");
	}
	
	public static void printGreeting() {
		
		System.out.println("Welcome to methods 101, "+
				"we are going to duplicate Math.pow");

		
	}
	

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. declare variables
		int number = 0;
		int power = 0;
		int result = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		//2. print greeting
		printGreeting(); //calling the method up above
		
		//3. prompt user for number and get value from user
		number = getUserNumber(keyboard);
		
		//4. prompt user for the power to raise the number
		//		to and get value from user
		power = getUserPower(keyboard);
		
		//5. calculate the value of the number raised to the given power
		result = pow(number, power);//number and power are called arguments
		//6. display the calculated value
		displayCalculatedResult(number, power, result);
		
		//7. print goodbye message
		printGoodbye();
		
	}
	
	
	public static void displayCalculatedResult(int number, 
				int power, int answer) {
		
		System.out.println("" + number + " raised to the power " 
				+ power +", " +
				"is calculated to be: " + answer);
	}
	
	//over here, value and power are called parameters
	public static int pow(int value, int power) {
		int answer = 1;
		
		for(int count=0; count<power; count++) {
			answer = answer * value;
		}
		
		return answer;
	}
	

	public static int getUserNumber(Scanner input) {
		int number = 0;
		
		System.out.print("Please enter a number: ");
		number = input.nextInt();
		
		return number;
	}
	
	public static int getUserPower(Scanner input) {
		int pow = 0;
		
		System.out.print("Please enter the power: ");
		pow = input.nextInt();
		
		return pow;
	}
	
	
	
}
