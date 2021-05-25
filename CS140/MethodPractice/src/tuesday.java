/**
 * 
 */

/**
 * @author nickcody
 *
 */

import java.util.Scanner;

public class tuesday {

	/**
	 * @param args
	 */


public static void printGreeting() 
{
	System.out.println("Welcome to meethods 101, " + 
"we are going to duplicate Math.pow");
}
public static void printGoodbye() {
	System.out.println("Goodbye");
}
public static int getUserNumber() 
{
int number = 0;

return number;
}

public static int getUserPower() 
{
	
}

public static int pow(int value, int power) {
	int answer = 0;
	
	answer = value ^ power;// is ^ a valid operator
			
	return answer;
}
public static void displayCalculatedResult(int number, int power, int answer) 
{
	System.out.println("" + number + "raised to " + powe + " power, " + "is calculated to be: " +answer);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//
	/*public static int methodName (parameters) {
		method body
	}
*/
	//1. declare variables
		int number = 0;
		int power = 0;
		int result = 0;
		 
	//2. print greeting
		printGreeting();//calling the method from up above 
	//3. prompt user to enter a value and  get value
		number = getUserNumber();
	//4. prompt user for power to raise number to and get value
		power = getUserPower();
	//5. calculate value of number raised to the power
		result = pow(number, power);
	//6. display result 
		displayCalculatedResult(number, power, result);
	//7.
		printGoodbye();
	}

}
