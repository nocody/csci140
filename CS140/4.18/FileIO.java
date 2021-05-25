/**
 * 
 */

/**
 * @author clintf
 *
 */

import java.io.PrintWriter;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 1) {
			
			System.out.println("Did not supply the filename to read/write, " + 
						"shutting down!");
			return;
		}
		
		//recurse();
		PrintWriter writer = null;
		Scanner keyboard = new Scanner(System.in);
		
		FIleIOLIbrrary.writeToFile(keyboard, writer, args[0]);
		
		
		FIleIOLIbrrary.readFromFile(args[0]);
		
		
		System.out.println("Goodbye");

	}

	public static void recurse() {
		try {
			
			recurse();
			
		}catch(StackOverflowError soe) {
			System.out.println("Stack Over FLow!!!");
		}
	}
	
	
}
