/**
* TipCalculator.java - this program determines the appropriate tip and total cost of a meal based on the meal cost and the customer's satisfaction level * **
* Equivalences classes:
* Name: Nick Cody
* Course: CSCI 140 Lab
* Email: njcody@coastal.edu
* Date: 2/5/2019
 */
package csci140;

/**
 * @author nickcody
 *
 */
import java.util.Scanner;


public class TipCalculator {

	private static final String FINAL = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. initialize variables
			//a. user name
		String userName = "";
		
			//b. user satisfaction
		int userSat = 0;
	
			//c. meal price
		double mealPrice = 0.00;
			//d. tip
		double tip = 0.0; 
			//e. total meal cost after tip
		double totalPrice = 0.0;
			//f. scanner
		Scanner keyboard = new Scanner(System.in);
			//g. great tip
		final double TIP1 = 0.2;
			//h. good tip
		final double TIP2 = 0.15;
			//i. bad tip
		final double TIP3 = 0.1;
		
		//2. Prompt user to enter name
		
		System.out.println("Welcome to The Tip Calculator! \n Please enter your name: ");
		
		userName = keyboard.next();
		
		//System.out.println(userName);
		//3. Prompt user to enter 1, 2, or 3 based on level of meal satisfaction
		System.out.println("Please enter your dining satisfaction \n Enter 1 if you were totally satisfied \n Enter 2 if you were satisfied \n Enter 3 if you were dissatisfied: ");
		
		userSat = keyboard.nextInt();
		
		if(userSat >= 1 && userSat <= 3) {
			
		
		//4. Prompt user to enter meal cost
		System.out.println("Please enter the amount of your meal: ");
		
		mealPrice = keyboard.nextDouble();
		//System.out.println(mealPrice);
		//5. calculate tip based on level of user satisfaction by multiplying meal price by the tip value determined by user satisfaction
		switch(userSat) {
		case 1:  // if user satisfaction is 1, tip is equal to the meal price * 0.2
			tip = mealPrice * TIP1;
			break;
			
		case 2: // if user satisfaction is 2, tip is equal to the meal price * 0.15
			tip = mealPrice * TIP2;
			break;
			
		case 3: // if user satisfaction is 2, tip is equal to the meal price * 0.1
			tip = mealPrice * TIP1;
			break;
		}
		System.out.println(tip);
		//6. Calculate total price by adding tip to meal price
		totalPrice = tip + mealPrice;
		
		
		//System.out.println(tip);
		//System.out.println(totalPrice);
		
		//7. Print tip and total price
		System.out.println("The Tip Calculator has calculated a tip of $" + tip + ", which totals $" + totalPrice + ". \n Thank you " + userName + ", for using the Tip Calculator!");
		}
		else {
			System.out.println("Error: input must be 1, 2, or 3");
		}
		
	
	}

}
