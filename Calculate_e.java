/**
 * 
 */
package test;

/**
 * @author Sandra Johnson
 * An attempt at calculating e, based on the work from Brothers
 *
 */
public class Calculate_e {
	
	/**
	 * @param args
	 */
	// Declare static variables
	static double  e = 0;
	static float w = 1;
	public static void main(String[] args) {
	
		// Using Brothers' Formulae, which calculates e to 9 decimal place accuracy in only 6 steps! Reference below:
		// Brothers, H.J. 2004. Improving the convergence of Newton's series approximation for e. College Mathematics Journal 35(January):34-39..
		for (int i = 0; i <= 9; i++) {
			e = e + (float) (2*i + 2)/(float)factorial(2*i + 1);
			System.out.println("e = " + e);
		}
		System.out.println(e);
	}
	public static long factorial (int number) {
		long result = 1;
		for (int i = number; i > 1; i--) {
			result = result * i;
		}
		return result;
	}
//	2.718281828 (i=6)   
//  2.7182818490932767 (i=9) 
//  2.7182818490932767 (i=12)
}
