/**
 *
 * Lydia Fritz CST105 Exercise 7
 *
 **/

public class PalindromicPrime {
	
	public static void main(String[] args) {
		
		//for formatting
		int count = 0;
		
		//loop over numbers 1 - 100000
		for(int i = 1; i <= 100000; i++){
			
			if(isPrime(i) && isPalindrome(i)){
				count++;
				System.out.printf("%7d", i);
				if(count == 6)
				{
					count = 0;
					System.out.println();
				}
			}
		}
	}

	// Testing for Prime Number
	public static boolean isPrime(int val) {
		if(val == 1)
			return false;
		for(int i = 2; i <= Math.sqrt(val); i++){
			if(val % i == 0)
				return false;
		}
		return true;
	}

	// Testing for Palindromic Number
	public static boolean isPalindrome(int val) {
		int copy = val;
		int reverse = 0;
		while(copy != 0){
			//get 1's digit
			int rem = copy % 10;
			//'shift' digits in reverse and add rem
			reverse = reverse * 10 + rem;
			//'remove' one's digit from copy
			copy/=10;
		}
		return reverse == val;
		
	}
}
