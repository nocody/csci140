/**
 * 
 */

/**
 * DiceGame.java - this program allows users to play a simulated dice game against the computer.
 * @author Nick Cody
 * @email njcody@coastal.edu
 * @course csci140
 * @date 04/29/2019
 *
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
public class DiceGame {
	public static final String COMP = "Computer";
	public static Scanner kb = new Scanner(System.in);
	public static Random rando = new Random();
	public static String playerName = "";
	public static final String TWO = "two of a kind";
	public static final String THREE = "three of a kind";
	public static final String FOUR = "four of a kind";
	public static final String FIVE = "five of a kind";
	public static final String TWOTWO = "two pair";
	public static final String FULL = "full house";
	public static final String STRAIGHT = "straight";
	public static final String TIE = "We have a tie!";
	public static final String BREAK = "+========================================================+\n"; 
	public static final String GOODBYE = "Thanks for playing the Dice game, have a nice day!\n";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1.declare variables 
		
		boolean wantsToPlay = true;
		//public static Random toss = new Random();
		boolean tossResult= true;
		int[] userRoll = new int[5];
		int[] computerRoll = new int[5];
		int[] userMatches = new int[5];
		int[] computerMatches = new int[5];
		String userHand;
		String compHand;
		int gameCount = 0;
		int userWins = 0;
		int compWins = 0;
		int ties = 0;
		
		
	//2. Print welcome statement
	//3. Get user name
		playerName = welcomeUser();
		displayBreak();
		//System.out.println(playerName);
	//4. check if user wants to play dice
		wantsToPlay = promptUser();
		//System.out.println(wantsToPlay);
				
	//5. while the user wants to play
		while(wantsToPlay)
		
		{
			gameCount++;
			//5a. prompt user to choose heads or tails
			//5b. simulate coin toss and check result against user choice
			tossResult = coinToss();
			//5c. process and display roll for winner of coin toss
			//5d. process and display roll for loser of coin toss
			if(tossResult) 
			{
				
				rollDie(userRoll, playerName);
				displayResults(userRoll, playerName);
				
				rollDie(computerRoll, COMP);
				displayResults(computerRoll, COMP);
				
				userMatches = checkRoll(userRoll);
				computerMatches = checkRoll(computerRoll);
				
				if(computerMatches == userMatches) 
				{
					System.out.println(TIE);
					ties++;
				}
				
				userHand = checkHand(userMatches);
				compHand = checkHand(computerMatches);
				
				if(checkWin(userMatches, computerMatches, userHand, compHand)) 
				{
					userWins++;
				}
				else
				{
					compWins++;
					
				}
				
			} 
			else 
			{
				
				rollDie(computerRoll, COMP);
				displayResults(computerRoll, COMP);
				
				rollDie(userRoll, playerName);
				displayResults(userRoll, playerName);
				
				
				computerMatches = checkRoll(computerRoll);
				userMatches = checkRoll(userRoll);
				
				if(computerMatches == userMatches) 
				{
					System.out.println(TIE);
					ties++;
					//continue;
				}
				else 
				{
					compHand = checkHand(computerMatches);
					userHand = checkHand(userMatches);
					if(checkWin(userMatches, computerMatches, userHand, compHand)) 
					{
						userWins++;
						
					}
					else
					{
						compWins++;
					}
					
				}
				
				//continue;
			}
			displayBreak();
			wantsToPlay = promptUser();
			
			//5e. check each roll for matches and compare results
			//5f. print winner and roll they won with
			//wantsToPlay = promptUser();
		}
		System.out.println(GOODBYE);
		
	//6. print total number of games played and percentage of wins for each player
	//7. print goodbye statement
	//8. exit program.
	}
	
/**
 * welcomeUser- prints a welcome statement and gets user name
 * @return - String userName
 */
	public static String welcomeUser() 
	{
		String userName;
		
		System.out.println("Welcome to the Dice Game!\nPlease enter your name: ");
		userName = kb.next();
		return userName;
	}
/**
 * promptUser - prompts user if they wish to role or retire and returns their choice
 *
 * @return - boolean choice
 */
	public static boolean promptUser() 
	{
		String userChoice;
		boolean choice = true;
		System.out.println("Would you like to play a game of dice? (enter yes or no): ");
		userChoice = kb.next();
		if(!(userChoice.equalsIgnoreCase("no") || userChoice.equalsIgnoreCase("yes"))) 
		{
			System.out.println("Invalid input.");
			choice = promptUser();
		} else 
		{
			choice = userChoice.equalsIgnoreCase("yes");
		}
		return choice;
	}
	
/**
 * coinToss - Prompts user to choose heads or tails, randomly selects heads or tails, then returns the result
 * @return boolean choice == result
 * 
 */
	public static boolean coinToss() 
	{
		String userChoice;
		String tossName;
		boolean result = true; 
		boolean tossChance = rando.nextBoolean();
		String winner = "";
		if(tossChance) {
			tossName = "Tails";
		} else {
			tossName = "Heads";
		}
		//System.out.println(tossChance);
		System.out.println("Heads or Tails?");
		userChoice = kb.next();
		System.out.println("Flipping coin...");
		if(!(userChoice.equalsIgnoreCase("tails") || userChoice.equalsIgnoreCase("heads"))) 
		{
			System.out.println("Invalid input.");
			result = coinToss();
		} else  {
			result = userChoice.equalsIgnoreCase(tossName);
			
			if(result) 
			{
				winner = playerName;
			}
			else 
			{
				winner = COMP;
			}
			System.out.println(tossName + ", " + winner + " has won the coin toss!");
			System.out.println();
		}
		
		return result;
		
	}
/**
 * rollDie- randomly generates 5 integers between 1-6 and stores them in an array
 * @param - playerRolls either the human or computer player's rolls
 * 
 */
	public static void rollDie(int[] playerRoll, String userName) 
	{
		System.out.println(userName + " is rolling dice...");
		for(int i = 0; i < 5; i++) 
		{
			playerRoll[i] = rando.nextInt(6) + 1;
			//System.out.println(playerRoll[i]);
		}
		
		
	}
public static void printArray(int[] arr) 
{
	System.out.print("[" + arr[0]);
	for(int i = 1; i < arr.length; i++) 
	{
		System.out.print( ", " + arr[i]);
	}
	System.out.println("]");
}
public static void printWinningRoll(int[] arr) 
{
	System.out.print("[");
	for(int i = 0; i < arr.length; i++) 
	{
		if(arr[i] != 0)
		{
			System.out.print(" " + arr[i] + " ");
		}
	}
	System.out.println("]");
}
/**
 * displayResults - displays the role of each player
 * @param - playerRolls either the human or computer player's rolls
 */	
	public static void displayResults(int[] playerRoll, String userName) 
	{	
		
		System.out.print(userName + " has rolled: ");
		printArray(playerRoll);
		System.out.println();
		
		
	}
	
/**
 * checkRole - scans an array of 5 integers and fills a new array with either the matching values from the original array, or all of the values in acending order if they are sequential. 
 * @param playerRolls either the human or computer player's rolls
 * @return int[] matches the matching or sequential values from the parameter array.
 */
	public static int[] checkRoll(int[] playerRoll) 
	{
		/*Potential solutions:
		 * sort playerRoll, then create a new array for matches, check player roll for consecutive numbers then populate array/s(?) with results, 
		*/
		//int maxMatch = 0;
		int[] matches = new int[5];
		Arrays.sort(playerRoll);
		for(int i = 1; i < 5; i++) 
		{
			//System.out.println(playerRoll[i]);
						if(playerRoll[i] == playerRoll[i - 1]) 
						{
							//System.out.println(playerRoll[i]);
							matches[i] = playerRoll[i];
							matches[i - 1] = playerRoll[i -1];
						}
		}
		
		/*
		for(int i = 0; i < 5; i++) 
		{
			for(int col = 0; col < 5 && col != i; col++)
			if(playerRoll[i] == playerRoll[col]) 
			{
				for(int j = 0; j < 4; j++) 
				{
					if(matches[j] == 0) 
					{
						matches[j] = playerRoll[i];
						matches[j + 1] = playerRoll[i];
						break;
					}
				}
			}
		
		}
		*/
		if(matches[0] == 0) 
		{
			if(((playerRoll[0] == 1) && (playerRoll[1] == 2) && (playerRoll[2] == 3) && (playerRoll[3] == 4) && (playerRoll[4] == 5)) || ((playerRoll[0] == 2) && (playerRoll[1] == 3) && (playerRoll[2] == 4) && (playerRoll[3] == 5) && (playerRoll[4] == 6)))
					{
					matches = playerRoll;
					}
		}
		//printArray(matches);
		/*
		int[] rollMatches = new int[6];
		int matched = 0;
		
		/*
		int oneMatches =0;
		int twoMatches =0;
		int threeMatches =0;
		int fourMatches =0;
		int fiveMatches =0;
		int sixMatches =0;
		int checkRoll = 0; 
		int matches = -1;
		System.out.println(userName + " results: ");
		for(int i = 0; i < 5; i++) 
		{
			for(int j = 0; j < 5; j++) 
			{
				
				if(playerRoll[i] == playerRoll[j]) 
				{
					matches++;
				}
				
			}
			System.out.println(playerRoll[i] + " has " + matches + "matches");
			System.out.println();
			matches = -1;
		}
		return checkRoll;
		
		for(int i = 0; i < 5; i++) 
		{
			switch(playerRoll[i]) {
			
			case 1:
				rollMatches[0]++;
				break;
			case 2:
				rollMatches[1]++;
				break;
			case 3:
				rollMatches[2]++;
				break;
			case 4:
				rollMatches[3]++;
				break;
			case 5:
				rollMatches[4]++;
				break;
			case 6:
				rollMatches[5]++;
				break;
			}
		}
		
		System.out.println(userName + "roll count: ");
		System.out.println("1: " + oneMatches);
		System.out.println("2: " + twoMatches);
		System.out.println("3: " + threeMatches);
		System.out.println("4: " + fourMatches);
		System.out.println("5: " + fiveMatches);
		System.out.println("6: " + sixMatches);
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			if(rollMatches[i] > maxMatch) {
				maxMatch = rollMatches[i];
				matched = i + 1;
			}
		}
		System.out.println(matched + ": " + maxMatch); 
		
		*/
		return matches;
		}
	public static boolean checkWin(int[] playerMatches, int[] compMatches , String playerHand, String compHand) 
	{
		int compRank = 0;
		int userRank = 0;
		int compSum = 0;
		int userSum = 0;
		boolean userWins = false;
		
		switch(compHand) 
		{
			case FIVE:
				compRank = 7;
				break;
			case FOUR:
				compRank = 6;
				break;
			case FULL:
				compRank = 5;
				break;
			case STRAIGHT:
				compRank = 4;
				break;
			case THREE:
				compRank = 3;
				break;
			case TWOTWO:
				compRank = 2;
				break;
			case TWO:
				compRank = 1;
				break;
				
		}
		switch(playerHand) 
		{
			case FIVE:
				userRank = 7;
				break;
			case FOUR:
				userRank = 6;
				break;
			case FULL:
				userRank = 5;
				break;
			case STRAIGHT:
				userRank = 4;
				break;
			case THREE:
				userRank = 3;
				break;
			case TWOTWO:
				userRank = 2;
				break;
			case TWO:
				userRank = 1;
				break;
				
		}
		if(compRank < userRank) 
		{
			userWins = true;
			//return userWins;
		}
		else if(compRank == userRank) 
		{
			for(int i : compMatches) 
			{
				compSum += i;
			}
			for(int i : playerMatches) 
			{
				userSum += i;
			}
			System.out.println("User score: " + userSum);
			System.out.println("Computer score: " + compSum);
			
			if(compSum < userSum) 
			{
				userWins = true;
				//return userWins; 
			}
		}
		if(userWins)
		{
			System.out.print(playerName + " wins: " + playerHand + " ");
			printWinningRoll(playerMatches);
			System.out.println();
		}
		else
		{
			System.out.print("The Computer wins: " + compHand + " ");
			printWinningRoll(compMatches);
			System.out.println();
		}
		return userWins;
	}
	
	public static String checkHand(int[] playerMatches) 
	{
		String playerHand = "";
		
		boolean hasZeroes = false;
		int zeroCount = 0;
		int count = 0;
		
		if (playerMatches[0] != playerMatches[1] && playerMatches[0] != 0)
		{
			playerHand = STRAIGHT; 
		}
		else {
	
			
			for(int i : playerMatches) 
			{	
				if(i == 0) 
				{
					zeroCount++;
					hasZeroes = true;
				}
				if(playerMatches[0] == i && playerMatches[0] != 0) {
					count++;
					//System.out.println(count);
				}
			}
			if(count == 5) 
			{
				playerHand = FIVE; 	
			} 
			else if(count == 4) 
			{
				playerHand = FOUR;
			}
			else if(hasZeroes)
			{
				if(count == 3) 
				{
					playerHand = THREE;
				}
				else if(zeroCount == 3)
				{
					playerHand = TWO;
				}
				else if(zeroCount == 1) 
				{
					playerHand = TWOTWO;
				}
				
			}
			else 
			{
				playerHand = FULL;
			}
		}
			
		
		
		
		//System.out.println(playerHand);
		//System.out.println(playerMatches[0]);
		return playerHand;
	}
	
	public static void displayBreak() {
		System.out.println(BREAK);
		
	}
}

