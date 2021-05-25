
/**
 * @author Nick Cody
 * @course csci140l
 * @date 04/09/2019
 * @lab 13
 *
 */
public class Lab13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//printArrat(testArray);
		//method1(testArray);
		//method2(testArray);
		//method3(testArray);
		//method4(testArray);
		method5(testArray);
		
	}



//Method 1
/**
 * Replaces all even elements in an array of integers with 0, then prints result
 * @param intArray
 */
public static void method1(int[] intArray) 
{
	for(int i = 0; i < intArray.length; i++) 
	{
		if(intArray[i] % 2 == 0) 
		{
			intArray[i] = 0;
		}
	}
	printArrat(intArray);
}
//Method 2
/**
* Shifts  all elements with 0, then prints result
* @param intArray
*/
public static void method2(int[] intArray) 
{
	int[] newArray = new int[intArray.length];
	newArray[0] = intArray[intArray.length - 1];
	for(int i = 0; i < intArray.length - 1 ; i++) 
	{
		newArray[i +1] = intArray[i];
	}
	printArrat(newArray);
}
//Method 3
/**
* Returns true if inArray is currently sorted in increasing order, then prints the result
* @param intArray
*/
public static boolean method3(int[] intArray) 
{
	boolean sorted= false;
	int check = 0;
	for(int i = 0; i < intArray.length; i++) 
	{
		
		if(intArray[i] > check) 
		{
			check = intArray[i];
		}
		else 
		{

			sorted = false;
			break;
		}
		
		sorted = true;
		}
	if(sorted) 
	{
		System.out.println("This array is sorted");
	}
	else 
	{
		System.out.println("This array is not sorted");
	}
	return sorted;
	
}
//Method 4
/**
* Returns true is intArray contains two adjacent duplicate elements, then prints results
* @param intArray
*/
public static boolean method4(int[] intArray) 
{
	boolean duplicates= false;
	
	for(int i = 0; i < intArray.length - 1; i++) 
	{
		
		if(intArray[i] == intArray[i+1]) 
		{
			duplicates = true;
			break;
		}
	}
	if(duplicates) 
	{
		System.out.println("This array contains duplicate adjacent values");
	}
	else 
	{
		System.out.println("This array does not contain duplicate adjacent values");
	}
	
	return duplicates;
}
//Method 5
/**
* Returns true if intArray contains any duplicate values, then prints results
* @param intArray
*/
public static boolean method5(int[] intArray) 
{
boolean duplicates= false;
	
	for(int i = 0; i < intArray.length; i++) 
	{
		for(int col = 0; col < intArray.length && col != i; col++)
		if(intArray[i] == intArray[col]) 
		{
			duplicates = true;
			break;
		}
	}
	if(duplicates) 
	{
		System.out.println("This array contains duplicate values");
	}
	else 
	{
		System.out.println("This array does not contain duplicate values");
	}
	
	return duplicates;
}
//printArrat 
public static void printArrat(int[] intArray) 
{
	for(int number: intArray) 
	{
		System.out.println(number);
	}
}
}