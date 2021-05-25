
/**
 * njcodyLabTest02.java - this program executes a series of methods.
 * @author Nick Cody
 * @email njcody@coastal.edu
 * @class csci140l
 * @date 04/25/2019
 *
 */
import java.util.Scanner;
public class njcodyLabTest02 {

	public static final String NAME_WELCOME= "Welcome to Name Maker!"; //FIXME add description of program
	public static final String NAME_PROMPT1 = "Please enter a name: ";
	public static final String NAME_PROMPT2 = "Please enter a second name: ";
	public static final String NAME_EXIT = "Thank you for using Name Maker! \n Goodbye!";
	public static final String ARRAY_PROMPT = "Please enter a number(999 when done): ";
	public static final String LOAD_WELCOME = "Welcome to Array Loader!";
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes = 30;
		int[] intArray = new int[50];
		int count =0;
		int numberOfOdds= 0;
		int numberReplaced = 0;
		double hours = 0.0;
		
		System.out.println("~~~~~~~~~Problem 1~~~~~~~~~ \n \n");
		nameMaker();
		System.out.println("Finished problem 1 \n \n");
		System.out.println("~~~~~~~~~Problem 2~~~~~~~~~ \n \n");
		System.out.println("Please enter the number of minutes: ");
		minutes = keyboard.nextInt();
		hours = minutesToHours(minutes);
		System.out.println( minutes + " minutes is equal to " + hours + " hours." );
		System.out.println("Finished problem 2 \n \n");
		System.out.println("~~~~~~~~~Problem 3~~~~~~~~~ \n \n");
		count = loadArray(intArray);
		System.out.println("Finished problem 3 \n \n");
		System.out.println("~~~~~~~~~Problem 4~~~~~~~~~ \n \n");
		printArray(intArray, count);
		System.out.println("Finished problem 4 \n \n");
		System.out.println("~~~~~~~~~Problem 5~~~~~~~~~ \n \n");
		middle100(intArray, count);
		printArray(intArray, count);
		System.out.println("Finished problem 5 \n \n");
		System.out.println("~~~~~~~~~Problem 6~~~~~~~~~ \n \n");
		numberOfOdds = tripleOdds(intArray, count);
		printArray(intArray, count);
		System.out.println("This array contains " + numberOfOdds + " odd number(s).");
		System.out.println("Finished problem 6 \n \n");
		System.out.println("~~~~~~~~~Problem 7~~~~~~~~~ \n \n");
		numberReplaced = replaceElements(intArray, count);
		System.out.println(numberReplaced +  " elements were replaced in this array.");
		printArray(intArray, count);
		
	}
	
	
	
//1. nameMaker
	/**
	 * This method prompts the user to enter two names, combines the names based on the length of the first name, then prints the new combined name to the console.
	 */
	public static void nameMaker() 
	{
		String name1 = "";
		String name2 = "";
		String newName = "";
		
		while(!(name1.equalsIgnoreCase("quit") || name2.equalsIgnoreCase("quit"))) 
		{
			System.out.println(NAME_PROMPT1);
			name1 = keyboard.next();
			if(name1.equalsIgnoreCase("quit")) {
				//System.out.println(NAME_EXIT);
				return;
					}
			System.out.println(NAME_PROMPT2);
			name2 = keyboard.next();
			if(name2.equalsIgnoreCase("quit")) {
				//System.out.println(NAME_EXIT);
				return;
					}
			if(3 < name1.length()) {
				newName = name1.replace(name1.subSequence(2, name1.length()), name2);
				
			} else {
				newName = name1 + name2;
			}
			System.out.println(newName);
		
		}
	}
//2. minutesToHours 
	/**
	 * calculates the number of hours equal a specified number of minutes
	 * @param minutes - number of minutes
	 * @return - number of hours equal to the parameter value of minutes.
	 */
	public static double minutesToHours(int minutes) 
	{
		double hours = minutes / 60.0;
		return hours;
	}
	
//3. loadArray
	/**
	 * Loads an array of integers with values input by the user until the user enter 999 or the array is filled.
	 * @param intArray - an empty array of integers
	 * @return count - the number of values entered by the user
	 */
	public static int loadArray(int[] intArray) 
	{
		//System.out.println(LOAD_WELCOME);
		int count = 0;
		int buffer = 0;
		for(int i = 0; i < 50; i++) 
			{
				System.out.println(ARRAY_PROMPT);
				buffer = keyboard.nextInt();
				if(buffer == 999) 
				{
					break;
				} 
				else 
				{
					intArray[i] = buffer;
				}
				count++;
				//System.out.println(count);
			}
		return count; 
		
	}
//4. printArray
	/**
	 * Prints the values in an array of integers indicating which value is in each index
	 * @param intArray - an array of integers.
	 * @param numVals - number of values present in the array.
	 */
	public static void printArray(int[] intArray, int numVals) 
	{
		for(int i = 0; i < numVals; i++) 
		{
			System.out.println("The value at index " + i + " is " + intArray[i]);
		}
		System.out.println();
	}
//5. middle100
/**
 * takes an array of integers and replaces the middle value with 100 if the number of values in the array is odd, or replaces the middle two values in the array with 50 if the number of values in the array is even.
 * @param intArray - an array of integers.
 * @param numVals - number of values present in the array.
 */
public static void middle100(int[] intArray, int numVals) 
{
	if( (numVals % 2) == 0) 
	{
		intArray[numVals / 2] = 50;
		intArray[(numVals / 2) - 1] = 50;
	}
	else 
	{
		intArray[numVals / 2] = 100;
	}
}

//6. tripleOdds
/**
 * Triples any odd value in an array of integers and counts the total number of odd values in the array.
 * @param intArray - an array of integers.
 * @param numVals - number of values present in the array.
 * @return count - number of odd values in the array
 */
public static int tripleOdds(int[] intArray, int numVals) 
{
	int count = 0;
	
	for(int i = 0; i < numVals; i++) 
	{
		if((intArray[i] % 2) != 0) 
		{
			intArray[i] = intArray[i] * 3;
			count++;
		}
		
	}
	return count;
}

//7.replaceElements
/**
 * Replaces each element except the first and last by the larger of its two neighbors and counts the number of times this occurs. 
 * @param intArray - an array of integers.
 * @param numVals - number of values present in the array.
 * @return count - number of elements replaced by this method.
 */
public static int replaceElements(int[] intArray, int numVals) 
{
int count = 0;
	
	for(int i = 1; i < (numVals - 1); i++) 
	{
		if(intArray[i] < intArray[i - 1]) 
		{
			intArray[i] = intArray[i -1];
			count++;
		} else if (intArray[i] < intArray[i + 1]) 
		{
			intArray[i] = intArray[i + 1];
			count++;
		}
		
	}
	return count;
}

}
