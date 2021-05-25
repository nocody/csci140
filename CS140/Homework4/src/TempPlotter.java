
/**
 * Description- This program creates an array of temperature values based on user input, finds the average of the temperatures, prints how much each temperature deviates from the average, then prints a graph that represents those numbers.
 * @author Nick Cody
 * @date 04/18/19
 * @email njcody@coastal.edu
 * @class csci 140
 *
 */

import java.util.Scanner;

public class TempPlotter {

	public static Scanner in = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. create variables
		double average =0;
		//Homework04Library lib = new Homework04Library();
	//2. Prompt user to enter the number of temperatures they want and create an array for them 
		int[] temps = Homework04Library.makeArray();
		
		//Homework04Library.printArray(temps);
	//3. Prompt user to enter temperature values and populate temperature array with user input
		temps = Homework04Library.getTemps(temps, temps.length);
		//Homework04Library.printArray(temps);
	//4. calculate average of temperature values and print result
		average = Homework04Library.calculateAverage(temps);
	//5. calculate the absolute difference between each temperature value and the average 
		double[] distanceFromAvg = Homework04Library.calculateDistanceFromAverage(temps, average);
	//6. then print the results from the last method	
		Homework04Library.displayDistanceFromAverage(distanceFromAvg);
	//7. plot the results from the distance from average method
		Homework04Library.plotDistanceFromAverage(distanceFromAvg);
	//8. Print goodbye statement and exit program
		Homework04Library.goodbye();
	}

}
