/**
 * Looping101.java - this program takes two integers as inputs and adds every even number between them(inclusive) and prints the result.
 * @author NickCody
 * @email njcody@coastal.edu
 * @course csci140l
 * @lab lab07
 * @date 02/14/2019
 *
 */
import java.util.Scanner;

public class Looping101 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1. declare variables
		final String WELCOME = ", welcome to Looping 101";
		final String NAME_PROMPT = "Please enter your name: ";
		final String VALUE_PROMPT = "Please enter a two values separated by a space, and I will sum all even values between (inclusive): ";
		final String VAL_ERROR = "Error: first value is greater than second value";
		final String CALC = "Calculating...";
		final String RESULT1 = "It has been determined that the sum of all values between ";
		final String RESULT2 = " and ";
		final String RESULT3 = " is: "; 
		final String EXIT1 = "Thank you ";
		final String EXIT2 = ", for using Looping 101!";
		Scanner kb = new Scanner(System.in);
		String userName = "";
		int val1 = 0;
		int val2 = 0;
		int counter = 0;
		int sum = 0;
		
		//2. get user name
		System.out.println(NAME_PROMPT);
		userName = kb.next();
		//System.out.println(userName);
		//3. Welcome statement
		System.out.println(userName + WELCOME);
		//4. get 2 integers from user
		System.out.println(VALUE_PROMPT);
		val1 = kb.nextInt();
		val2 = kb.nextInt();
		//5. check if first value is less than second  value
		if(val1 > val2) 
		{
			//6. if no, print error statement
			System.out.println(VAL_ERROR);
			System.exit(1);
		}
		else
		{
		//7.set counter to first value
			counter = val1;
			System.out.println(CALC); 
			//8. loop while counter is less than or equal to value 2
			while (counter <= val2) 
			{
				//8a. if counter is divisible by 2 add to sum
				if(counter % 2 == 0) 
				{
					sum = sum + counter;
				}
				//8b. increment counter
				++counter;
				//System.out.println(sum);
			}
			//10. print sum
			System.out.println(RESULT1 + val1 + RESULT2 + val2 + RESULT3 + sum);
			//11. print exit statement	
			System.out.println(EXIT1 + userName + EXIT2);
		}
		//12. exit program
		return;
	}

}
