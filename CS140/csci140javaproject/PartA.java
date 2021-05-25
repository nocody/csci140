/**
 * PartA.java - this program is a password protected menu system that allows users to either calculate their weekly earnings or their GPA.
 * @author nickcody
 * @email njcody@coastal.edu
 * @date 02/21/19
 * @course csci140
 */
import java.util.Scanner;
//import java.text.DecimalFormat;

public class PartA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//DecimalFormat df = new DecimalFormat("#.00");
		//Scanner kb2 = new Scanner(System.in).useDelimiter("\\s* \n \\s*");
		final int PIN = 9999;
		int i = 0;
		int userPin = 0000;
		int userChoice = 0;
		String userName = "";
		double totalHours = 0.00;
		double regHours = 0.00;
		double otHours = 0.00;
		double wage = 0.00;
		double regPay = 0.00;
		double otPay = 0.00;
		double totalPay = 0.00;
		String regPayStr = "";
		String otPayStr = "";
		String totalPayStr = "";
		String letterGrades = "";
		/*
		char firstLetterGrade = ' ';
		char secondLetterGrade = ' ';
		char thirdLetterGrade = ' ';
		char fourthLetterGrade = ' ';
		char fifthLetterGrade = ' ';
		double firstGrade = 0.0;
		double secondGrade = 0.0;
		double thirdGrade = 0.0;
		double fourthGrade = 0.0;
		double fifthGrade = 0.0;
		*/
		double totalGrade = 0.0;
		double gpa = 0.0;
		String gpaNote = "";
		int gradeCounter = 0;
		final String PIN_PROMPT = "Please enter pin number: ";
		final String NAME_PROMPT = "Please enter your name: ";
		final String WAGE_PROMPT = "Please enter your hourly wage: ";
		final String HOURS_PROMPT = "Please enter your hours worked: ";
		final String PIN_ERROR = "Invalid pin number";
		final String MENU = "Calculator Menu\n" + "1) Wage Calculator\n" + "2) GPA Calculator\n" + "3) Exit\n" + "Please enter your choice: ";
		final String REG_HOURS = "Your regular hours worked are ";
		final String OT_HOURS = "Your overtime hours worked are ";
		final String REG_PAY = "Your regular pay: $";
		final String OT_PAY = "Your overtime pay: $";
		final String TOTAL_PAY = "Your total pay: $";
		final String GRADE_PROMPT = "Please enter 5 grades separated by a space (A, B, C, D, or F): ";
		final String GPA = "Your GPA is: ";
		final String SCL = " (Summa Cum Laude).";
		final String MCL = " (Magna Cum Laude).";
		final String CL = " (Cum Laude).";
		final String B = " (The world needs B students).";
		final String C = " (C's get Degrees!).";
		final String D = " (You've got a bright future working in the White House).";
		final String F = " (Better invest in a shovel).";
		final String EXIT_PROMPT = "Thank you for using our menu system.";
		final String EXIT_WAGE = "Thank you for using the Wage Calculator ";
		final String EXIT_GPA = "Thank you for using the GPA Calculator.";
		
		
		//Password Access
			//1. declare variables
			//2. prompt user for a 4 digit pin number
		System.out.println(PIN_PROMPT);
		
			//3. assign user input to password variable
		userPin = kb.nextInt();
		//System.out.println(userPin);
			//4. if the user input does not match 9999, display exit message and end program
			//5. If matches, display menu system
		if( userPin == PIN) 
		{
			System.out.println(MENU);
		}
		else 
		{
			System.out.println(PIN_ERROR);
			System.exit(1);
		}
		userChoice = kb.nextInt();
		if(userChoice == 1) 
		{
			//6. Prompt user to select wage or gpa calculator
		//Wage Calculator
			//1.Prompt user for the name of an employee
			System.out.println(NAME_PROMPT);
			//2. assign user input to employee name variable
			userName = kb.next();		
			//3. prompt user to input hourly wage of employee
			System.out.println(WAGE_PROMPT);
			//4. assign user input to wage value
			wage = kb.nextDouble();
			//5. prompt user to input how many hours worked in past week
			System.out.println(HOURS_PROMPT);
			//6. assign input to hours variable
			totalHours = kb.nextDouble();
			//7.if hours is greater than 40, assign hours - 40 to overtime variable
			if(totalHours > 40) 
			{
				otHours = totalHours - 40; 
				regHours = 40; 
			}
			else 
			{
				regHours = totalHours;
			}
			//8. calculate pay( 1.5wage(overtime) + 40wage) and assign result to pay variable
			regPay = wage * regHours;
			otPay = 1.5 * wage * otHours;
			totalPay = otPay + regPay;
			//df.format(regPay);
			//df.format(otPay);
			//df.format(totalPay);
			regPayStr = String.format("%.2f", regPay);
			otPayStr = String.format("%.2f", otPay);
			totalPayStr = String.format("%.2f", totalPay);
			//FIXME convert pay values to xxxx.xx format
			//9. print regular hours worked, overtime hours worked, regular pay, overtime pay, and total pay
			System.out.println(REG_HOURS + regHours);
			System.out.println(OT_HOURS + otHours);
			System.out.println(REG_PAY + regPayStr);
			System.out.println(OT_PAY + otPayStr);
			System.out.println(TOTAL_PAY + totalPayStr);
			//10. Prompt user thanking them for using Wage Calculator
			System.out.println(EXIT_WAGE + userName + "!");
			
			
		}
		else if(userChoice == 2) 
		{
		//GPA Calculator
			//1. Prompt user for 5 letter grades
			System.out.println(GRADE_PROMPT);
			//2. assign input to a variable
			//firstLetterGrade = kb.nextChar();
			//secondLetterGrade = kb.nextChar();
			//thirdLetterGrade = kb.nextChar();
			//fourthLetterGrade = kb.nextChar();
			//fifthLetterGrade = kb.nextChar();
			letterGrades = kb.next();
			letterGrades = letterGrades + kb.next();
			letterGrades = letterGrades + kb.next();
			letterGrades = letterGrades + kb.next();
			letterGrades = letterGrades + kb.next();
			//letterGrades = letterGrades.replaceAll("\\s","");
			//System.out.println(letterGrades);
			//3. add the 4.0 scale value for each grade entered
		for(i = 0; i < letterGrades.length(); ++i) 
			//for(gradeCounter = 0; gradeCounter <= 5; gradeCounter++) 
			{
				//letterGrades = kb.next();

				switch(letterGrades.charAt(i)) 
				{
				case 'A': totalGrade = totalGrade + 4.0;
							break;
				case 'B': totalGrade = totalGrade + 3.0;
							break;
				case 'C': totalGrade = totalGrade + 2.0;
							break;
				case 'D': totalGrade = totalGrade + 1.0;
							break;
				case 'F': totalGrade = totalGrade + 0.0;
							break;
				default: break;
				}
				//gradeCounter = gradeCounter + 1;
				
				//System.out.println(totalGrade);
				//System.out.println(gradeCounter);
			}
		//4. find average of entries
			gpa = totalGrade / 5;
		//5.assign descriptor variable to each grade level (Summa Cum Laude, etc...)
			if(gpa >= 3.9) 
			{
				gpaNote = SCL;
			}
			else if(gpa >= 3.7) 
			{
				gpaNote = MCL;
			}
			else if(gpa >= 3.5) 
			{
				gpaNote = CL;
			}
			else if(gpa >= 3.0) 
			{
				gpaNote = B;
			}
			else if(gpa >= 2.0) 
			{
				gpaNote = C;
			}
			else if(gpa >= 1.0) 
			{
				gpaNote = D;
			}
			else if(gpa >= 0.0) 
			{
				gpaNote = B;
			}
			
			//6. Print GPA with descriptive note 
			System.out.println(GPA + gpa + gpaNote);
			//7. Prompt user thanking them for using GPA Calculator
			System.out.println(EXIT_GPA);
			//System.out.println(gpa);
			
			
			
			
		} else if(userChoice == 3) 
		{
			System.out.println(EXIT_PROMPT);
			System.exit(0);
		}
		
			
		//Exit

	}

}
