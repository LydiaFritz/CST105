import java.util.Scanner;

/**
 * Exercise 2
 * Using / and %
 * CST105
 * @author Lydia.Fritz
 *
 */

public class ExtractingDigits {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a 5 digit integer:  ");
		int inputVal = kb.nextInt();
		
		//calculate each digit
		int ones = inputVal%10;
		int tens = inputVal%100/10;
		int hundreds = inputVal%1000/100;
		int thousands = inputVal%10000/1000;
		int h_thousands = inputVal/10000;
		
		//calculate sum
		int sum = ones + tens + hundreds + thousands + h_thousands;
		
		//output result
		System.out.printf("The sum of the digits is %d + %d + %d + %d + %d = %d\n", 
				h_thousands, thousands, hundreds, tens, ones, sum);
		
	}
}