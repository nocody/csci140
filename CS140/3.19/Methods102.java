/**
 * 
 */

/**
 * @author clintf
 *
 */
public class Methods102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int[] c = new int[2];
		c[0] = 5;
		c[1] = 10;
		
		//primitives are all 'pass by value'
		add(a, b);
		System.out.println("In main, a is: " + a + ", and b is: " + b);
	
		//objects and arrays are 'pass by reference' (memory reference)
		add(c);
		System.out.println("In main, c[0] is: " + c[0] + 
				", and c[1] is: " + c[1]);
	}
	
	public static void add(int[] v) {
		v[0]++;
		v[1] = v[1] - v[0];
		System.out.println("In add, v[0] is: " + v[0] + 
				", and v[1] is: " + v[1]);
	}
	
	public static void add(int a, int b) {
		a++;
		b = b - a;
		System.out.println("In add, a is: " + a + ", and b is: " + b);
	}
	

}
