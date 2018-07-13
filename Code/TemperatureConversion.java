import java.util.Scanner;

/**
 * Exercise 2
 * Using / and %
 * CST105
 * @author Lydia.Fritz
 *
 */

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double f_temp, c_temp;
		
		System.out.print("Enter a Fahrenheit temperature: ");
		f_temp = kb.nextDouble();
		
		//calculate Celsius
		c_temp = (f_temp - 32) * 5/9;
		
		//output
		System.out.printf("%.2fF is equivalent to %.2fC.\n", f_temp, c_temp);
		
		System.out.println("Enter a Celsius temperature: ");
		c_temp = kb.nextDouble();
		
		//calculate Fahrenheit
		f_temp = c_temp * 9/5 + 32;
		
		//output
		System.out.printf("%.2fC is equivalent to %.2fF.\n", c_temp, f_temp);
	}
}
