/**
 * njcodyLabTest01.java- this program is executed in two parts. 
 * The first part outputs a rank determined by a character input by the user. 
 * The second part is a dice game where the user inputs a role value for two players role for an undetermined number of rounds. 
 * Each round, the role value is added to the total score for each player. 
 * The game ends once one of the players has a score that is both greater than 15 and the other player's score.
 * Once the game has ended, the program prints the final score of each player and who the winner is. 
 * @author Nick Cody
 * @email njcody@coastal.edu
 * @date 2/28/19
 * @class csci 140L
 *
 */
import java.util.Scanner;
public class njcodyLabTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem 1:
		//1. declare variables
		Scanner kb = new Scanner(System.in);
		final String PART1_PROMPT = "Please enter your character's grade(A-D): ";
		final String PART1_WELCOME = "Part 1: Determining Rank";
		final String D = "Newbie";
		final String C = "Recruit";
		final String B = "Enlisted";
		final String A = "Officer";
		final String RESULT1 = "Your character's grade of ";
		final String RESULT2 = " translates to ";
		final String ERROR1 = "Invalid Input"; 
		final String PART2_WELCOME = "Part 2: Welcome to the Dice Game!";
		final String R = "Round ";
		final String P1 = "Player1";
		final String P2= "Player 2";
		final String FINAL = "Final scores: ";
		final String WINNER = "The winner is: ";
		final String EXIT = "Thank you for using the program. Goodbye.";
		final String IR = "Invalid role";
		String userChar = "";
		String rank = "";
		int round = 1;
		int p1Role = 0;
		int p2Role = 0;
		int p1Score = 0;
		int p2Score = 0;
		
		
		//2. prompt user for character
		System.out.println(PART1_WELCOME);
		System.out.println(PART1_PROMPT);
		//3. get character
		userChar = kb.next();
		//System.out.println(userChar);

		//4. check character	
		switch(userChar) {
			//4a. if character is A, print "Officer"
			case "A": System.out.println(RESULT1 + userChar + RESULT2 + A + "!");
				break;
			//4b. if character is B, print "Enlisted"
			case "B": System.out.println(RESULT1 + userChar + RESULT2 + B + "!");
				break;
			//4c. if character is C, print "Recruit"
			case "C": System.out.println(RESULT1 + userChar + RESULT2 + C + "!");
				break;
			//4d. if character is D, print "Newbie"
			case "D": System.out.println(RESULT1 + userChar + RESULT2 + D + "!");
				break;
			//4e. if character is anything else, print "Invalid Input"
			default: System.out.println(ERROR1);
		}
			
		
		//Problem 2:
		//1. declare variables
		//2. print welcome statement
		System.out.println(PART2_WELCOME);
		//3. While neither player score is greater or equal to 15:
		
		while((p1Score < 15 && p2Score < 15) || p1Score == p2Score) {
			//3a. print current round number
			System.out.println(R + round);
			System.out.println(P1+ ": ");
			//3b. get player 1 role
			p1Role = kb.nextInt();
			System.out.println(P2 + ": ");
			//3c. get player 2 role
			p2Role = kb.nextInt();
			//3d. check is roles are valid
			if(!(p1Role > 6 || p1Role < 0) && !(p2Role > 6 || p2Role < 0)) {
				//3da. sum player 1 role to player 1 score
				p1Score = p1Score + p1Role;
				//3db. sum player 2 role to player 2 score
				p2Score = p2Score + p2Role;
				//3dc. increment round number
				round++;
			} else {
				//3dd. print error statement
				System.out.println(IR);
			}
			
			//System.out.println(P1 + p1Score);
			//System.out.println(P2 + p2Score);
				
		}
		//4. print final scores
		System.out.println(FINAL + P1 + " = " + p1Score + " " + P2 + " = " + p2Score);
		//5. print winner
		if(p1Score > p2Score) {
			//5a. if player 1 score is greater than player 2 score, print player 1
			System.out.println(WINNER + P1);
		} else {
			//5b. if player 1 score is less than player 2 score, print player 2
			System.out.println(WINNER + P2);
		}
		//6. print thanks statement
		System.out.println(EXIT);
		//7. exit 
		return;
					
	}

}
