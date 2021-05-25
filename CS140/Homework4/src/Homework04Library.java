
/**
 * Description- this class contains the methods called in the TempPlotter class.
 * @author Nick Cody
 * @date 04/18/19
 * @email njcody@coastal.edu
 * @class csci 140
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class Homework04Library {

	
	public static final String WELCOME ="Welcome to the Absolute Temp Distance from Average Plotter.";
	public static final String NUM_TEMPS ="Please enter the number of temperatures to record: ";
	public static final String TEMPS ="Enter temperature ";
	public static final String AVG_TEMPS1 ="The average of ";
	public static final String AVG_TEMPS2 =" temperatures = ";
	public static final String DISTANCE ="Absolute Distance from Average: ";
	public static final String PLOT ="Plot: ";
	public static final String GOODBYE ="Thank you for using the program!";
	public static Scanner in = new Scanner(System.in);
	
	/**
	 * prints a welcome statement, prompts user to enter an integer, then creates an empty array of integers based on the user's input. 
	 * @return- an empty arry of integers that is as long as the user's input
	 */
	public static int[] makeArray() {
		System.out.println(WELCOME);
		System.out.println(NUM_TEMPS);
		int num = in.nextInt();
		int[] temps = new int[num];
		return temps;
	}
	/**
	 * prompts user to input integers to populate an array
	 * @param temps - the empty array of integers
	 * @param tempNumber- length of the array
	 * @return - an array populated with the values input by the user
	 */
	public static int[] getTemps(int[] temps, int tempNumber) {
		for (int i = 0; i < tempNumber; i++) {
			System.out.println(TEMPS + (i + 1) + ": ");
			temps[i] = in.nextInt();
		}
		return temps;
	
	}
	/**
	 * Calculates the average of an array of integers
	 * @param temps - an array of integers
	 * @return - the average of the values in the array as a double variable type
	 */
	public static double calculateAverage(int[] temps) {
		double average = 0;
		double total = 0;
		for(int i = 0; i < temps.length; i++) {
			total = total + temps[i];
		}
		average = total / (temps.length);
		System.out.println(AVG_TEMPS1 + temps.length + AVG_TEMPS2 + average);
		return average;
		
	}
	/**
	 * Calculates the absolute difference between each value in  an array and their average, populating an array with the results
	 * @param temps - an array of integers
	 * @param average - the average of those integers
	 * @return- an array populated with the results
	 * 
	 */
	public static double[] calculateDistanceFromAverage(int[] temps, double average){
		double[] distance = new double[temps.length];
		for(int i = 0; i < temps.length; i++) {
			distance[i] = Math.abs( average - temps[i]);
		}
		return distance;
	}
	/**
	 * Prints a explainer message and the results from the calculate distance from average method
	 * @param temps- the array resulting from the calculate distance from average method
	 */
	public static void displayDistanceFromAverage(double[] temps) {
		System.out.print(DISTANCE);
		printArray(temps);
	}
	/**
	 * Prints a simple horizontal bar graph representing the results from the calculate distance from average method
	 * @param temps - results from the calculate distance from average method
	 */
	public static void plotDistanceFromAverage(double[] temps) {
		System.out.println(PLOT);
		for(int i = 0; i < temps.length; i++) {
			System.out.print(temps[i] + ":");
			for(int col = 1; col <= temps[i]; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * Prints the contents of an array of integers or double types
	 * @param temps - an array of integers  or doubles
	 */
	public static void printArray(int[] temps) {
		for(int i = 0; i < temps.length; i++) {
			System.out.print(temps[i] +" ");
		}
		System.out.println();
	}
	public static void printArray(double[] temps) {
		for(int i = 0; i < temps.length; i++) {
			System.out.print(temps[i] +" ");
		}
		System.out.println();
	}
	/**
	 * prints a goodbye statement and exits the program
	 */
	public static void goodbye() {
		System.out.println(GOODBYE);
		System.exit(0);
	}
	
}
