import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 
 * Pig Latin Conversion
 * Lydia Fritz
 * 
 */



public class PigLatin {

	public static void main(String[] args) {
		
		try {
			Scanner fin = new Scanner(new File("sample.in"));
			
			String input;
			while(fin.hasNext()){
				input = fin.next();
				
				//see if it is empty
				if(input.length() > 0){
					
					//get upper case equivalent
					String pigLatin = input.toUpperCase();
					
					//move leading consonants to the end
					while(pigLatin.length() > 0 && 
							!pigLatin.startsWith("A") &&
							!pigLatin.startsWith("E") &&
							!pigLatin.startsWith("I") &&
							!pigLatin.startsWith("O") &&
							!pigLatin.startsWith("U") &&
							!pigLatin.startsWith("Y"))
						pigLatin = pigLatin.substring(1) + pigLatin.charAt(0);
					
					//add "AY"
					pigLatin += "AY";
					
					//output in tabular format
					System.out.printf("%-20s%-20s\n", input, pigLatin);
									
				}
			}
			
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}
}