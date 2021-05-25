/**
 * 
 */

/**
 * 
 * Gaussian.java - this program takes a positive integer and prints every integer between 1 and the user input followed by a + with final output being the sum of all the values printed
 * @author nickcody
 * @email njcody@coastal.edu
 * @course csci140l
 * @lab lab0-
 * @date 02/21/19
 */
import java.util.Scanner;
public class Gaussian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. declare variables
		int totalSum = 0;
		Scanner kb = new Scanner(System.in);
		int i;
		int userInput = 0;
		/* 
		//first iteration:
		//2. loop through all positive integers between 0 and 100
		
		for(i = 1; i < 100; i++) 
		{
			//2a. with each iteration, print each number in the sequence followed by " + "
			System.out.print("" + i + " + ");
			//2b. with each iteration, add curre3nt value to total sum 
			totalSum = totalSum + i;
		
				
		}
		//3. add final value to total sum
		totalSum = totalSum + 100;
		//4. Print total sum
		System.out.print("" + "100" + " = ");
		System.out.print(totalSum);
		}
		*/
		
	//second iteration:	
	//2. get positive integer from user
	System.out.println("Please enter a positive integer: ");
	userInput = kb.nextInt();
	if(userInput <= 0) 
	{
		System.out.println("Error: your input is not a positive integer.");
		System.exit(1);
	}
	//System.out.println(userInput);
	
	//3. loop through all positive integers between 0 and user input
	for(i = 1; i < userInput; i++) 
	{
		//3a. print current value followed by " + "
		System.out.print(i + " + ");
		//3b. add current value to total sum
		totalSum = totalSum + i;
	}
	//4. add user input to total sum
	totalSum = totalSum + userInput;
	//5. print user input followed by " = " followed by total sum
	System.out.println("" + userInput + " = " + totalSum);
	}
}

