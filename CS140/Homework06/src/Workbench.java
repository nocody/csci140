
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
public class Workbench {
	public static final String FIVE = "five of a kind";
	public static final String FOUR = "four of a kind";
	public static final String STRAIGHT = "straight";
	public static final String FULL = "full house";
	public static final String THREE = "three of a kind";
	public static final String TWOTWO = "two pair";
	public static final String TWO = "two of a kind";
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test ={1, 2, 4, 5, 2};
		int[] test2 = {6, 6, 6, 6, 6};
		int[] match = new int[5];
		String n = "Shithead";
		
		match = checkRoll(test, n);
		
	}
	
	
	public static int[] checkRoll(int[] playerRoll, String userName) 
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
						if(playerRoll[i] == playerRoll[i - 1]) //FIXME - get first matching value to begin filling in at match[0]
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
		displayResults(matches, userName);
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
	public static void displayResults(int[] playerRoll, String userName) 
	{	
		System.out.print(userName + " has rolled: [" + playerRoll[0]);
		for(int i = 1; i < playerRoll.length; i++) 
		{
			System.out.print( ", " + playerRoll[i]);
		}
		System.out.println("]");
	}
	public static void displayBreak() {
		System.out.println(BREAK);
		
	}
}
