/**
 * 
 */
package csci140;

/**
 * TemperatureConverter.java - this program converts numerical inputs from their value in Fahrenheit to their value in Celcius and prints the result.
 * @author Nick Cody
 * Course: CSCI 140
 * Homework 1 TemperatureConverter
 * Email: njcody@coastal.edu
 * @date 1/28/19
 */
import java.util.Scanner; 
import java.text.DecimalFormat;

public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. define variables
		double tempInFahrenheit = 0.0; //
		double tempInCelcius = 0.0;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.#");//allows resulting value to go to only one decimal place
		
		//2. print request for input
		System.out.print("Please enter temperature you wish to convert: ");
		//3. assign input to first variable
		tempInFahrenheit = keyboard.nextDouble();
		
		//4. process input and assign result to second variable
		tempInCelcius = (tempInFahrenheit - 32.0) * (5.0 / 9.0);
		
		//5. print result
		System.out.println("The tempurature " + tempInFahrenheit + " degrees Fahrenheit converts to " + df.format(tempInCelcius) + " degrees Celsius.");
		System.out.println("Thank you for using the temperature converter.");
		
	}

}
