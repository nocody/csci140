/**
 * 
 */

/**
 * @author nickcody
 *
 */
public class recursionPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = calculateArea(5);
	
	}
	public static int calculateArea(int value) {
		int calculated = 0;
		if (value <= 0) {
			return value;
		} else {
			//System.out.println(calculated);
			calculated = value + calculateArea(value - 1);
			
			System.out.println(calculated);
			return calculated;
		}
	
		}
	
	}

