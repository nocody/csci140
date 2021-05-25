import java.io.FileNotFoundException;


import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author clintf
 *
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Scanner;

public class FIleIOLIbrrary {

	
	public static void readFromFile(String fileName) {
		
		Scanner input = null;
		File fileToRead = new File(fileName);
		
		String firstName = "no first name yet";
		String lastName = "no last name yet";
		int age = 0;
		int counter = 0;
		
		
		try {
		
			input = new Scanner(fileToRead);
			
			
			while(input.hasNext()) {
				
				firstName = input.next();
				lastName = input.next();
				age = input.nextInt();
				System.out.println("" +counter +": " + firstName + 
						" " + lastName + " is " + age + " years old.");
				
				counter++;
			}
			
			input.close();
			
		}catch(FileNotFoundException fnfe) {
			System.out.println(fileName +" was not found!");
		}
		
	}
	
	
	
	public static void writeToFile(Scanner input, 
			PrintWriter writer, String fileName) {
		String name = "no name yet";
		int age = 0;
		
		try {
			writer = new PrintWriter(fileName);
		
			
			while(!name.equalsIgnoreCase("quit")) {
				System.out.print("Please enter a name to store or quit: ");
				name = input.nextLine();
				if(!name.equalsIgnoreCase("quit")) {
					System.out.println("How old is " + name + ": ");
					age = input.nextInt();
					input.nextLine();//just to clear the newline char
					
					writer.println(name + " " + age);
				}
			}
			
			writer.close();
			
		 }catch(FileNotFoundException fnfe) {
			System.out.println("FileNotFoundException Caught: " + fnfe.getMessage());
			//fnfe.printStackTrace();
		}finally {
			if(writer != null) {
				writer.close();
			}
		}
	}

}
