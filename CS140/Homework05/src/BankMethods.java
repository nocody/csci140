/**
 * 
 */

/**
 * @author clintf
 *
 */
//Insert file I/O
//Similar to car inventory, but need to create initial file write to file from array

import java.util.Scanner;
import java.io.*;
public class BankMethods {
	public static final String fileName = "Accounts.dat";
	
	public static void displayAllAccounts(String[] aName, 
				double[] aBalance, int currentNumberOfAccounts) {
		if(aName == null || aBalance == null) {
			System.out.println("ERROR: invalid accounts..");
			return;
		}
		
		if(currentNumberOfAccounts == 0) {
			System.out.println("No accounts are currently held....");
			return;
		}
		
		for(int index=0; index<currentNumberOfAccounts; index++) {
			displayAccount(aName, aBalance, index);
		}
		
		
	}
	
	
	
	/**
	 * showMenu: this method will display a menu 
	 * to the user with all of the available options 
	 * and return the user’s selection.
	 * @return
	 */
	public static String showMenu(String aMenu, Scanner input) {
		String response = "no response yet";
		
		System.out.print(aMenu);
		response = input.nextLine();
		
		return response;
		
	}
	
	/**
	 * addAccount: requires an array of user names, an array of 
	 * balances, and the currentNumberOfAccounts as parameters, 
	 * and proceeds to prompt the user for their name and starting 
	 * balance, which are then added to the respective arrays at the 
	 * next available index. The new number of accounts is returned 
	 * from this method. Of course, if the arrays are already full, 
	 * this method should print the appropriate message to the console 
	 * and NOT add a new account to the arrays. You must also ensure 
	 * that the names remain unique in the array, so if “John Smith” 
	 * already has an account, another “John Smith” would NOT be 
	 * allowed to create an account (I know, but this is not a real bank).
	 * @param aName is intialized array of Strings
	 * @param aBalance is an initialized array of double values
	 */
	public static int addAccount(String[] aName, double[] aBalance, 
			int currentNumberOfAccounts, Scanner input) {
		int numberAdded = 0;
		int testIndex = 0;
		String name = "no name yet";
		double balance = 0.0;
		
		
		//checking we have valid arrays
		if(aName == null || aBalance == null) {
			System.out.println("ERROR: invalid data structure - is null");
			return currentNumberOfAccounts;
		}
		
		//checking to make sure not full
		if(aName.length == currentNumberOfAccounts) {
			System.out.println("Sorry the Bank is not accepting new accounts at this time.");
			return currentNumberOfAccounts;
		}
		
		//new account info
		name = promptForName(input);
		balance = promptForAmount(input);
		
		testIndex = findAccount(aName,
				currentNumberOfAccounts, name);
		
		//checking to make sure name doesn't already exist
		if(testIndex >= 0) {
			System.out.println("Sorry, " + name + " already" +
						" has an account with us.");
			return currentNumberOfAccounts;
		}
		
		//add new account to arrays
		aName[currentNumberOfAccounts] = name;
		aBalance[currentNumberOfAccounts] = balance;
		numberAdded++;
		
		return currentNumberOfAccounts + numberAdded;
	}
	
	
	/**
	 * deposit: this method requires both arrays 
	 * (names and balances), name, amount, and the 
	 * numberOfAccounts, and proceeds to add to the 
	 * user’s balance.
	 */
	public static void deposit(String [] aName, double [] aBalance) {
		
	}
	
	/**
	 * withdraw: this method requires both arrays 
	 * (names and balances), name, amount, and the 
	 * numberOfAccounts, and proceeds to subtract 
	 * from the user’s balance.
	 * @param aName
	 * @param aBalance
	 */
	public static void withdraw(String [] aName, double[] aBalance) {
		
	}
	
	/**
	 * displayAccount: requires the name array, the balance 
	 * array, and an index, and displays the account info 
	 * (name and balance) nicely formatted.
	 */
	public static void displayAccount(String[] aName, 
			double[] aBalance, int aIndex){
		
		if(aIndex < 0) {
			System.out.println("ERROR: index is not positive");
			return;
		}
	
		System.out.println(aName[aIndex] + 
				" has balance of: " + aBalance[aIndex]);
		
	}
	
	/**
	 * promptForName: asks the user to enter a name and returns this value.
	 */
	public static String promptForName(Scanner input) {
		String name = "no name yet";
		
		System.out.print("Please enter account name: ");
		name = input.nextLine();
		
		return name;
	}
			
	/**
	 * promptForAmount: asks the user to enter an amount  and returns this value.
	 * @return
	 */
	public static double promptForAmount(Scanner input){
		double amount = 0.0;
		
		System.out.print("Please enter the account value: ");
		amount = input.nextDouble();
		input.nextLine();
		
		return amount;
	}
	/**
	 * averageHoldings: determines the total value of all of 
	 * the accounts, calculates the average, and  print the 
	 * average to the console. What parameters will this 
	 * method require?
	 * @param aBalance
	 * @return
	 */
	public static void averageHoldings(double[] aBalance) {
		double average = 0.0;
		
		
		
	}
	/**
	 * totalHoldings: determines the total value of all of 
	 * the accounts and print this value to the console. 
	 * What parameters will this method require?
	 * @param aName
	 * @param aBalance
	 */
	public static void totalHoldings(String aName, double[] aBalance) {
		
	}
	/**
	 * findAccount: this method requires the name array, 
	 * the numberOfAccounts, and a searchName, and then 
	 * it scans the name array for the corresponding name 
	 * and returns the index where the searchName appears 
	 * in the name array. If the name is NOT found, a -1 
	 * should be returned.
	 * @param aName
	 * @return
	 */
	public static int findAccount(String [] aName, 
			int numberOfAccounts, String searchName) {
		int foundIndex = -1;
		
		for(int index=0; index<numberOfAccounts; index++) {
			if(aName[index]!= null && 
					aName[index].equalsIgnoreCase(searchName)) {
				foundIndex = index;
				break;
			}
		}
		
		
		return foundIndex;
	}
	
	//showLowestBalance: determines the index of the balance array with the lowest value and displays that value to the screen. What parameters will this method require?
			
	//showHighestBalance: determines the index of the balance array with the highest value and displays that value to the screen. What parameters will this method require?
			
	//removeAll: this method removes all bank account information from both arrays (you could set everything to a default value). What parameters will this method require?
	public static void removeAll(String[] aName, double [] aBalance) {
		
	}
	//remove: this method requires both arrays (user names and balances), the numberOfAccounts, as well as the name of the user to be removed, and proceeds to remove the user name and balance from the respective arrays and returns the new number of accounts. (this may require compacting of the array). If the user name can NOT be found, an appropriate message should be displayed to the console.
	public static void remove(String[] aName, double [] aBalance) {
		
	}
	//save: requires an array of user names, an array of balances, and the currentNumberOfAccounts as parameters, and proceeds to write all of the account information that is present in the two arrays(name and balance pairs). The program will automatically use the filename Accounts.dat for saving and loading account info. Note that you should create a constant for the filename, unless you choose to let the user choose.
	public static void save(String[] aName, double[] aBalance, int numberOfAccounts) {
		
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName);
			for (int i = 0; i <= numberOfAccounts; i++) {
				writer.print(aName[i] + ": " + aBalance[i]);
			}
				writer.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println(fileName + " was not found!");
		}
	}
	//load: requires an array of user names, an array of balances, and the currentNumberOfAccounts as parameters, and proceeds to read all of the account information that is present and ‘reloads’ the two arrays(name and balance pairs). The program will automatically use the filename Accounts.dat for saving and loading account info. Note that you should create a constant for the filename, unless you choose to let the user choose. Finally, this method will return the number of accounts loaded into the two arrays.
		public static void load(String[] aName, double[] aBalance, int numberOfAccounts) {
			
			Scanner input = null;
			File fileToRead = new File(fileName);
			
			
			try {
				input = new Scanner(fileToRead);
				fillArray(input, aName, numberOfAccounts);
				fillArray(input, aBalance, numberOfAccounts);
				//System.out.println();	
				input.close();
			}
			
			
			catch(FileNotFoundException fnfe) {
				System.out.println(fileName +" was not found!");
			}
			
		}
		
		public static void fillArray(Scanner fileScanner, String[] aName, int numberOfAccounts) {
			for(int i =0; i < numberOfAccounts; i++) {
				aName[i] = fileScanner.next();
				//aBalance[i] = fileScanner.nextDouble();
				//System.out.println("Name: " + aName[i] + "/n Balance: " + aBalance[i]);
			}
		}
			public static void fillArray(Scanner fileScanner, double[] aBalance, int numberOfAccounts) {
				for(int i =0; i < numberOfAccounts; i++) {
					//aName[i] = fileScanner.next();
					aBalance[i] = fileScanner.nextDouble();
					//System.out.println("Name: " + aName[i] + "/n Balance: " + aBalance[i]);
				}
		}
			
	
		}

