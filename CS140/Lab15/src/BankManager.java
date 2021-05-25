/**
 * 
 */

/**
 * @author clintf
 *
 */

import java.util.Scanner;

public class BankManager {
	
	public static final String MENU = "Type \"add\" to add an account to the bank\n" + 
			"Type “deposit” to deposit funds to an account\n" + 
			"Type “show all” to show all accounts\n" +
			"Type “withdraw” to withdraw funds from an account\n" + 
			"Type “average” to determine the average of all account balances\n" + 
			"Type \"show lowest\" to display the lowest account balance\n" + 
			"Type \"show highest\" to display the highest account balance\n" + 
			"Type \"remove\" to remove a specific account\n" + 
			"Type \"remove all\" to remove all accounts\n" + 
			"…other menu selections…\n" + 
			"Type \"quit\" to exit the program:";

	
	public static final String ADD = "Add";
	public static final String DEPOSIT = "Deposit";
	public static final String QUIT = "Quit";
	public static final String SHOW_ALL = "show all";
	
	public static final int DEFAULT_SIZE = 10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
		
		String userSelection = "no selection yet";
		
		String[] accountName = new String[DEFAULT_SIZE];
		double[] accountBalance = new double[DEFAULT_SIZE];
		
		int currentAccountCount = 0;
		
		
		while(!userSelection.equalsIgnoreCase(QUIT)) {
		
			userSelection = BankMethods.showMenu(MENU, keyboard);			
			
			if(userSelection.equalsIgnoreCase(ADD)) {
				System.out.println("Add selected...");
				currentAccountCount = BankMethods.addAccount(accountName,
						accountBalance, currentAccountCount, keyboard);
			}
			else if(userSelection.equalsIgnoreCase(SHOW_ALL)) {
				System.out.println("Show all selected...");
				BankMethods.displayAllAccounts(accountName, accountBalance, 
						currentAccountCount);
				
			}
			else if(userSelection.equalsIgnoreCase(DEPOSIT)) {
				System.out.println("Deposit selected...");
			}
			else if(userSelection.equalsIgnoreCase(QUIT)) {
				System.out.println("Quit selected...");
			}
			else {
				System.out.println("Invalid input: " + userSelection);
			}
			
			
		}//end of while
		
		System.out.println("Thanks for Banking with us, have a nice day!");
		
	}

}
