/**
 * 
 */

/**
 * @author nickcody
 *
 */
import java.util.Scanner;
public class arrayNotes {
	public static final int DEFAULT_INT_VALUE = -999;
	public static final String DEFAULT_STRING_VALUE = "poop";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner kb = new Scanner(System.in);
		
		int[] iArray = new int[25];
		initArray(iArray);
		printArray(iArray); 
		
		String[] sArray = new String[5];// prints empy value
		initArray(sArray, kb, 0);
		printArray(sArray);
		
		//char[] cArray = new char[5];
		//printArray(cArray);
		
		
	}
	public static void printArray(int[] aArray) 
	{
		for(int i = 0; i < aArray.length; i++) {
			System.out.println("aArray[" + i + "] is " + aArray[i]);
		}
	}

public static void printArray(String[] aArray) 
{
	for(int i = 0; i < aArray.length; i++) {
		System.out.println("aArray[" + i + "] is " + aArray[i]);
	}
}
/*public static void printArray(char[] aArray) 
{
	for(int i = 0; i < aArray.length; i++) {
		System.out.println("aArray[" + i + "] is " +aArray[i];
	}
}
*/
	/**
	 * initializes all indices of aArray 
	 * @param aArray is NOT null 
	 */
	public static void initArray(int[] aArray) 
	{
		for(int i = 0; i < aArray.length; i++) 
		{
			aArray[i] = DEFAULT_INT_VALUE + i * 100 - 1;
		}
	}
	/*
	public static void initArray(String[] aArray) 
	{
		for(int i = 0; i < aArray.length; i++) 
		{
			aArray[i] = DEFAULT_STRING_VALUE;
		}
	
	}
	*/
	public static void initArray(String[] aArray, Scanner input, int index) 
	{
		if(index >= aArray.length) 
		{
		System.out.println("inititialization complete...");	
		return;
		}
		initArray(aArray, input, (index +1));
		System.out.print("Please eneter a " + (index+1) + " name: " );
		aArray[index] = input.nextLine();
	}
}
