/**
 * Description- This program gets exam grades from user and returns the total number of grades, average grade, highest grade, lowest grade, number of failing grades, and percent of grades that are failing.
 * @author Nick Cody
 * @date 03/26/19
 * @email njcody@coastal.edu
 * @class csci 140
 * 
 *
 */
import java.util.Scanner;
public class GradeAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. declare variables
		Scanner kb = new Scanner(System.in);
		final String WELCOME = "Welcome to the PC Grade Analyzer!\n" + 
							   "\n Please enter grades, input negative number to signal that you are ready to analyze: ";
		final String LOAD = "Printing results... \n";
		final String HIGH = "Highest Grade: ";
		final String TOTAL = "Total number of grades: ";
		final String LOW = "Lowest Grade: ";
		final String AVERAGE = "Average Score: ";
		final String FAIL = "Number of students who did not pass the exam: ";
		final String FAIL_PERCENT = "Percentage of studets who did not pass the exam: ";
		final String GOODBYE = "Thank you for using the program. Have a nice day!";
		final String INPUT_ERROR = " is not a valid input";
		
		int userInput = 0;
		double totCount = 0;
		double totSum = 0;
		double failCount = 0;
		int lowestGrade = 100;
		int highestGrade = 0;
		double averageGrade = 0.0;
		double percentFailed = 0.0;
		
		
		//2. print welcome statement
		System.out.println(WELCOME);
		
		//3. get grades (loop)
		//4. While user input is positive
		while(userInput >= 0) 
		{
			userInput = kb.nextInt();
			if(userInput < 0) 
			{
				break;
			} 
			else if(userInput > 100) 
				//4a. if user input is greater than 100 print error statement
			{
				System.out.println( userInput + INPUT_ERROR);	
			} 
			else 
				//4b. if user input 0-100 increment count, add input to total sum	
			{
				totCount ++;
				totSum = totSum + userInput;
				System.out.println(totSum);
				if(userInput < 70)
				//4c. if user input is less than 70 increment fail count,
				{
					failCount++;
					if(userInput < lowestGrade)
					//4c1.if grade is less than lowest grade, update lowest grade
					{
						lowestGrade = userInput;
					}
				}
				else if(userInput > highestGrade)
				//4d. else if grade is greater than highest grade, update highest grade
				{
					highestGrade = userInput;
				}
			}
			
		}
		//System.out.println(totSum);
		//6. Calculate average and percent failed
		averageGrade = totSum / totCount;
		percentFailed = (failCount / totCount) * 100;
		//7. print results
		System.out.println(LOAD);
		System.out.printf(TOTAL + "%.0f \n \n", totCount);
		System.out.println(HIGH + highestGrade);
		System.out.println(LOW + lowestGrade);
		System.out.printf(AVERAGE + "%.1f \n \n", averageGrade);
		System.out.printf(FAIL + "%.0f \n", failCount);
		System.out.printf(FAIL_PERCENT + "%.1f", percentFailed );
		System.out.println("% \n");
		System.out.println(GOODBYE);
		//8. exit program
		return;
				
				
			
		

	}
}
