/**
 * MoreDecisions.java - this program allows users to choose two different processes: Order or Card. Order evaluates if three intergers are in numerical order. Card converts the shorthand for a card into the long for name of that card.
 * @author NickCody
 * @email njcody@coastal.edu
 * @date 02/12/2019
 * @course csci140l
 * @lab lab06
 */

import java.util.Scanner;
public class MoreDecisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Order
			//1. assign variables
		Scanner kb = new Scanner(System.in);
		final String NAME_PROMPT = "Please enter your name: ";
		final String WELCOME = ", welcome to More Decisions.";
		final String CHOOSE = "Indicate if you would like to evaluate Order or Card (enter Order or Card) : ";
		final String INPUT_PROMPT1 = "Please enter three numbers seperated by a space: ";
		final String INPUT_PROMPT2 = "Please enter the shorthand rank and suit of a card: ";
		final String ERROR_MESSAGE_ORDER = " is not properly formatted.";
		final String ERROR_MESSAGE_CARD = " is not valid.";
		final String ERROR_MESSAGE_CHOICE = " is not a valid choice.";
		final String DETERMINED = "It has been determined: ";
		final String IN_ORDER = " is in order";
		final String OUT_OF_ORDER= " not in order";
		final String END_PROMPT1 = "Thank you ";
		final String END_PROMPT2 = ", for using the More Decisiions program!";
		final String LOADING = "Analyzing...";
		String userName = "";
		String choice = "";
		String userInput = "";
		int first = 0;
		int second = 0;
		int third = 0;
		String card = "";
		char shortRank = ' ';
		char shortSuit = ' ';
		String rank = "";
		String suit = "";
		
		
		
			//1. prompt user for name
		System.out.println(NAME_PROMPT);
		
			//2. assign user name to variable user name
		userName = kb.next();
		//System.out.println(userName);
			//3. print welcome statement
		System.out.println(userName + WELCOME);
			//4. ask user if they would like to evaluate order or card by typing Order or Card
		System.out.println(CHOOSE);
			//5. determine user input and initiate Order or Card script
		choice = kb.next();
		//System.out.println(choice);
		//Order
		if(choice.equalsIgnoreCase("Order")) 
		{
			//1. prompt user to input 3 integers
			System.out.println(INPUT_PROMPT1);
			//2. assign each integer to a value (first, second, third)
			first = kb.nextInt();
		//System.out.println(first);
			second = kb.nextInt();
		//System.out.println(second);
			third = kb.nextInt();
		//System.out.println(third);
			System.out.println(userInput);
			System.out.println(LOADING);
			//3. if first < second < third, print statement that says user input is in order
			if (!(first <= second && second <= third)) 
			{
				System.out.println(DETERMINED + first + " " + second + " " + third + OUT_OF_ORDER);
			} 
			//4. else print statement that user input is out of order
			else
			{
				System.out.println(DETERMINED + first + " " + second + " " + third + IN_ORDER);	
			}
			
		}
		else if(choice.equalsIgnoreCase("Card")) 
		{
			
		
		//Card
			//3. prompt user to input short hand of card
			System.out.println(INPUT_PROMPT2);
			//4. determine if user input is valid
			card = kb.next();
			//System.out.println(card);
			//5. assign first character to shorthand rank variable and second character to shorthand suit variable
			shortRank = card.charAt(0);
			//System.out.println(shortRank);
			shortSuit = card.charAt(1);
			//System.out.println(shortSuit);
			//6. determine the rank of card and assign full name to rank variable 
			if(Character.isDigit(shortRank) && Character.getNumericValue(shortRank) >= 2 && Character.getNumericValue(shortRank) <= 10) 
			{
				rank = Character.toString(shortRank);
				System.out.println(rank);
			} 
			else 
			{
				switch (shortRank)  
				{
				case 'A': 
					rank = "Ace";
					break;
				case 'J': 
					rank = "Jack";
					break;
				case 'Q': 
					rank = "Queen";
					break;
				case 'K': 
					rank = "King";
					break;
				default:
					System.out.println(card + ERROR_MESSAGE_CARD);
					System.out.println(END_PROMPT1 + userName + END_PROMPT2);
					return;
					
				}
				//System.out.println(rank);
			}
			//7. determine the suit and assign full name to suit variable
			switch (shortSuit) 
			{
			case 'D': 
				suit = "Diamonds";
				break;
			case 'H': 
				suit = "Hearts";
				break;
			case 'C': 
				suit = "Clubs";
				break;
			case 'S': 
				suit = "Spades";
				break;
			default:
				System.out.println(card + ERROR_MESSAGE_CARD);
				System.out.println(END_PROMPT1 + userName + END_PROMPT2);
				return;
			}
			//8. print statement with the long hand name of card
			System.out.println(DETERMINED + card + " = " + rank +  " of " + suit);
			
		} 
		else 
		// Print an error statement if choice is invalid
		{
			System.out.println( choice + ERROR_MESSAGE_CHOICE);
		}
		// Print exit statement
		System.out.println(END_PROMPT1 + userName + END_PROMPT2);

	}

}
