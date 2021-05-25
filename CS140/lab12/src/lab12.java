/**
 * 
 */

/**
 * Description - this program contains two methods. The first method computes the the factorial of an integer. The second method counts how many digits are in a positive integer.
 * @author Nick Cody
 *@date
 *@class csci140l
 *@lab lab12
 *
 */
public class lab12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println("The factorial of " + num + " is: " + factorial(num));
		digitCounter(12345, 0);
		//System.out.println(dCount(123456));
	}
	//Part 1: factorial method
	/**
	 * 
	 * @param num (positive integers)
	 * @return answer (factorial of num)
	 */
	public static int factorial(int num) 
	{
		int answer;
		if (num <= 0) {
			answer = 0;
		}
		
		else if(num == 1) 
		{
			answer = 1;
		} 
		else 
		{ 
		answer = num * factorial(num - 1);
		//System.out.println(answer);
		
		}
		return answer;
	
	}
	//Part 2: digit counter
	/**
	 * 
	 * @param originalNumber
	 * @param count (number of digits in original number)
	 */
	public static void digitCounter(int originalNumber, int count) 
	{
		
		
		//int newNum = originalNumber / 10;
		//System.out.println(count);
		if(originalNumber != 0)
		{	
			digitCounter(originalNumber / 10, count + 1);
		} 
		else 
		{
			System.out.println(count);
			return;
		}
		
		/*if (originalNumber < 10) 
		{
			count = 1;
		}
		else 
		{
			count = digitCounter((originalNumber / 10), count);
		}*/
		
		
	}
	/*
	public static int dCount(int num) {
		int count = 0;
		int newNum;
		newNum = num / 10;
		while(newNum > 0) {
		count++;
		newNum = newNum / 10;
		}
		return count;
	}
	*/
}
