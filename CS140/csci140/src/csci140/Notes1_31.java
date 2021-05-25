/**
 * Decisions - branches in Java
 */
package csci140;

/**
 * @author nickcody
 *
 */
import java.util.Scanner;

public class Notes1_31 {

	
	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		/*
		 String name1 = "Tom"; // 
		 
		String name2 = "John";
		
		
		
		
		
		System.out.println("Please enter your name: ");
		
		name2 = kb.nextLine();
		
		if(name1.equals(name2)) { //String.equals() method 
		System.out.println("Hello " + name1);	
		
					}
					/*
		int number1 = 7;
		int number2 = 2;
		System.out.println("Please enter a number (1-10)");
		*/
		/*
		 * Drivers License - determines person's age and determines if person is old enough to drive
		 */
		String userName = "";
		int userAge = 0;
		//Constant variables
		final int LEARNERS_PERMIT_AGE = 15;
		final int
		final String TOO_YOUNG_MESSAGE = "You are too young to get a Driver's License";
		final String LEARNERS_PERMIT_MESSAGE = "You qualify for a Learner's Permit.";
		final String DRIVERS_LICENSE_MESSAGE = "You qualify for a Driver's License.";
		final String TOO_OLD_MESSAGE = "You are too old to drive";
		final String WELCOME = "Welcome to the DMV hive mind. I am the law.";
		final String PROMPT_NAME = "What are you called, mortal?";
		final String PROMPT_AGE = "How many years since you have inhabited a womb?";
		final String ERROR_MESSAGE = "ERROR: user age does not exist";
		
	
		
		System.out.println(PROMPT_NAME);
		
		userName = kb.nextLine();
		
		System.out.println(PROMPT_AGE);
		
		userAge = kb.nextInt();
		
		switch(userAge) {
		case 0:
			System.out.println(TOO_YOUNG_MESSAGE);
			
			break;
			
		case LEARNERS_PERMIT_AGE: 
			
			break;
		default:
			System.out.println(ERROR_MESSAGE);
		}
		
		/*
		if (userAge > 15 && userAge < 100) {
			System.out.println("You are " + userAge + " years old and you can legally drive"); 
		}
		else if (userAge < 15 && userAge >= 0) {
			
			System.out.println(TOO_YOUNG_MESSAGE);
		}
		else if (userAge > 101) {
			//default block
			System.out.println(TOO_OLD_MESSAGE);
		}
		else {
			System.out.println(ERROR_MESSAGE);
		}
		*/
	}
}
