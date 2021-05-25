/**
 * DateValidater.java - this program determines whether a date input by the user is valid or not.
 * Name: Nick Cody
 * Course: CSCI 140 Lab
 * Email: njcody@coastal.edu
 *  Date: 02/05/2019
 */
package csci140;

/**
 * @author nickcody
 *
 */
import java.util.Scanner;

public class DateValidater 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 1. Declare variables
			//a. keyboard scanner
		Scanner kb = new Scanner(System.in);
			//b.date entered by user
		String userDate = "";
			//b. month
		int mm = 0;
			//c. day
		int dd = 0;
			//d. year
		int yyyy = 0;
			//e. error message
		final String ERROR_MESSAGE = " is invalid.";
			//f. success message
		final String SUCCESS_MESSAGE = " is valid.";
			//g. welcome message
		final String WELCOME_MESSAGE = "Welcome to the Validater! \n Please enter a date [mm/dd/yyyy]: ";
			//h. goodbye message
		final String GOODBYE_MESSAGE = "Thank you for using the Validater!";
		
			
		//2. Prompt user to input date
		System.out.println(WELCOME_MESSAGE);
		//3. assign sub strings of user input to user date variables
		userDate = kb.next();
		
		System.out.println("Analyzing...");
		//System.out.println(userDate);
		//4. confirm user input is formated properly (size 10)
			//a. check size 10
			//b. check charAt(2) && charAt(5) 
		if (!(userDate.length() == 10 && userDate.charAt(2) == '/' && userDate.charAt(5) == '/')) 
		{
			System.out.println(userDate + ERROR_MESSAGE + "\n" + GOODBYE_MESSAGE);
			System.exit(1);
			
		}else 
		{
			//System.out.println("Valid format");
			
		//5. assign sub strings from user date to separate variables
			//monthInt = Integer.parseInt(month) converts string to integer
			//a. month
			mm = Integer.parseInt(userDate.substring(0,2));
			//System.out.println(mm);
			
			//b. day
			dd = Integer.parseInt(userDate.substring(3,5));
			//System.out.println(dd);
			//c. year
			yyyy = Integer.parseInt(userDate.substring(6,10));
			//System.out.println(yyyy);
		
		//5. confirm month value is 1-12
			//a. Print error message if month value invalid
			if(!(mm >= 1 && mm <=12)) 
			{
				System.out.println(userDate + ERROR_MESSAGE + "\n" + GOODBYE_MESSAGE);
				System.exit(2);
			
			//6.  confirm days are valid
				//a. if days are more than 31, print error message
			
			}else if(dd > 31 || dd < 1) 
			{
				System.out.println(userDate + ERROR_MESSAGE+ "\n" + GOODBYE_MESSAGE);
				System.exit(3);
			}
			//7. determine days is <= maximum number of days in month
				//a. if month is February and year is divisible by 4, max is 29
			else if(mm == 2) 
			{
				if(dd > 29) 
				{
					System.out.println(userDate + ERROR_MESSAGE+ "\n" + GOODBYE_MESSAGE);
					System.exit(4);
				}
				else if( dd == 29 && !(yyyy % 4 == 0)) 
				{
					System.out.println(userDate + ERROR_MESSAGE + "\n" + GOODBYE_MESSAGE);
					System.exit(5);
				}
				else 
				{
					System.out.println(userDate + SUCCESS_MESSAGE + "\n" + GOODBYE_MESSAGE);
				}
			}
			//b. check if month is September, April, June, or November and day is grater than 30
				//b1. if days are greater than 30 print error message
			else if ((mm == 9 || mm == 4 || mm == 6 || mm == 11) && (dd > 30)) 
			{
				System.out.println(userDate + ERROR_MESSAGE + "\n" + GOODBYE_MESSAGE);
			}
		//8. Print input is valid if meets all conditions
			else 
			{
				System.out.println(userDate + SUCCESS_MESSAGE + "\n" + GOODBYE_MESSAGE);
			}
			
			return;
		}

	}
}
