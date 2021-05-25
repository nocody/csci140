/**
 * Looping102.java - this program analyzes a series of positive integers and outputs the largest number input, smallest number input, total odd inputs, and total even inputs. Program stiops accepting inputs once a negative integer is input.  
 * @author Nick Cody
 * @course csci140l
 * @email njcody@coastal.edu
 * @date 02/19/19
 */
import java.util.Scanner;

public class Looping102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. declare variables
		final String NAME_PROMPT = "Please enter your name: ";
		final String WELCOME = ", welcome to Looping 102.";
		final String INPUT_PROMPT = "Please enter positive values for analysis (negative to quit): ";
		final String LARGE = "Largest: ";
		final String SMALL = "Smallest: ";
		final String ODD = "Number of Odd: ";
		final String EVEN = "Number of Even: ";
		final String EXIT1 = "Your analysis is complete ";
		final String EXIT2 = ", have a nice day!";
		Scanner kb = new Scanner(System.in); 
		String userName = "";
		int min = 0;
		int max = 0;
		int userInput = 0; 
		int even = 0;
		int odd = 0;
		//2. prompt user for name
		System.out.println(NAME_PROMPT);
		//3. assign input to user name variable
		userName = kb.next();
		//4. print welcome statement
		System.out.println(userName + WELCOME);
		//5. prompt user to input positive integers
		System.out.println(INPUT_PROMPT);
		userInput = kb.nextInt();
		//6. check input, if positive
		if(userInput >= 0) 
		{
			min = userInput;
			max = userInput;
			while (userInput >= 0) 
			{
				if(userInput % 2 == 0) //6a. if even, add 1 to even variable
				{
					++even;
					//System.out.println(even);
				}
				else 
				{
					++odd; //6b. if odd. add 1 to odd variable 
					//System.out.println(odd);
				}
				if(userInput > max) //6c. if input is the largest value so far, assign to max variable
				{
					max = userInput;
					//System.out.println(max);
				}
				if(userInput < min) //6d. if input is smallest value so far, assign to min variable
				{
					min = userInput;
					//System.out.println(min);
				}
				userInput = kb.nextInt();
			}
			//7. if negative, exit loop
			//8.print min, max, even, odd variables
			System.out.println(SMALL + min);
			System.out.println(LARGE + max);
			System.out.println(ODD + odd);
			System.out.println(EVEN + even);
		}
		System.out.println(EXIT1 + userName + EXIT2);
		//System.out.println(userInput);
		 
		//9. print exit statement
	}

}
