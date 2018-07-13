import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/*
 * 
 * Guessing Game program
 * Practice with loops
 * Lydia Fritz
 * 
 */



public class GuessingGame {

	public static void main(String[] args) {
		
		//create a random integer between 1 and 10000, inclusive
		Random rnd = new Random();
		int randomNum = rnd.nextInt(10000) + 1;
		
		Scanner kb = new Scanner(System.in);
		
		//set low and high end of active range
		int lowEnd = 1, hiEnd = 10000;
		
		//get a guess
		System.out.printf("Guess a number between %d and %d:  ", lowEnd, hiEnd);
		int guess = kb.nextInt();
		
		while(guess != randomNum){
			
			//see if guess is too high
			if(guess > randomNum){
				//reset high end of range
				hiEnd = guess-1;
				System.out.printf("LOWER!\n");
			}
			
			//see if guess is too low
			else{
				lowEnd = guess + 1;
				System.out.print("HIGHER!\n");
			}
			
			//get another guess
			System.out.printf("Guess a number between %d and %d:  ", lowEnd, hiEnd);
			guess = kb.nextInt();
		}
		
		System.out.println("WINNER!  The random number is " + randomNum);
		
		kb.close();
		
	}
}