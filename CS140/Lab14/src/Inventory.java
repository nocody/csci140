/**
 * Inventory.java - takes an inventory.txt file and updates the prices based on how how old each car is.
 * 
 * @author Nick Cody
 * @Lab Lab14 File IO
 * @email njcody@coastal.edu
 * @date 04/23/2019
 *
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Inventory {

	//1. Declare variables
	public static String[] newInventory = new String[20];
	public static int year = 0;
	public static double price = 0;
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		//2. read inventory.txt and print each each word from inventory file to an array
		readFromFile("inventory.txt");
		//3. modify the price values in array according o the following criteria: 
				//if car age is between 1 and five years old, discount price by 5%
				//if car age is between 5 and 10 years old discount price by 10%
				//if car age is between 10 and 20 years old, discount 50%
				//if car age is over 20 years old, increase price by 20%
		updateArray(newInventory);
		//4.Prompt user for a file name
		System.out.println("Please enter the name of the file for the new inventory (.txt format): ");
		//5.create a new txt file with user input as name, then populate with values from array
		String userFile = keyboard.next();
		makeNewInventoryFile(userFile);
		//priceUpdate(2018, 100);
		
		
		
	}
	/**
	 * Populates an array with the values in a file.
	 * @param fileName = name of a file
	 */
	public static void readFromFile(String fileName) {
		
		Scanner input = null;
		File fileToRead = new File(fileName);
		
		
		try {
		
			input = new Scanner(fileToRead);
			fillArray(input);
			//System.out.println();
			input.close();
			
		}catch(FileNotFoundException fnfe) {
			System.out.println(fileName +" was not found!");
		}
	}
			
	/**
	 * updates the price of a car based on how old the car is
	 * @param carYear - the model year of the car
	 * @param oldPrice - the original price of the car
	 * @return -the price of the car with the appropriate discount/markup
	 */
	public static double priceUpdate( int carYear,  double oldPrice) {
		double newPrice = 0;
		if(carYear <= 2018 && carYear > 2014) {
			newPrice = oldPrice * 0.95;
		}else if(carYear < 2014 && carYear > 2009) {
			newPrice = oldPrice * 0.9;
		}else if(carYear < 2009 && carYear > 1999) {
			newPrice = oldPrice * 0.5;
		}else if(carYear < 1999) {
			newPrice = oldPrice * 1.2;
		}
		//System.out.println(newPrice);
		return newPrice;
	}
	/**
	 * populates an array using a file scanner
	 * @param fileScanner = scanner made to read a file
	 */
	public static void fillArray(Scanner fileScanner) {
		for(int i =0; i < 20; i++) {
			newInventory[i] = fileScanner.next();
		//System.out.println(newInventory[i]);
		}
	}
	
	/**
	 * updates an array by pulling out the price and year values
	 * @param oldArray- original array
	 */
	public static void updateArray(String[] oldArray) {
		for(int i = 2; i < 20; i += 4) {
			int j = i + 1;
			year = Integer.parseInt(oldArray[i]);
			//System.out.println(year);
			price = Double.parseDouble(oldArray[j]);
			//System.out.println(price);
			oldArray[j] = Double.toString(priceUpdate(year, price));
			//System.out.println(oldArray[j]);
		}
	}
	/**
	 * creates a new txt file named after a user's input and populates it with the contents of an array
	 * @param userInput - file name chosen by the user 
	 */
	public static void makeNewInventoryFile(String userInput) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(userInput);
			for (int i = 0; i < 20; i++) {
				writer.print(newInventory[i] + " ");
				if( (i == 3 || i == 7 || i == 11 || i == 15 || i == 19) && i != 0 ) {
					writer.println();
				}
			}
				writer.close();
		} catch (FileNotFoundException fnfe) { // is fnfe arbitrary? or does it have special meaning?
			System.out.println(userInput +" was not found!");
		}
	}
}

