import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 
 * 2-D array problem
 * Lydia Fritz
 * 
 */



public class CodeBlock {

	public static void main(String[] args) {
		
		try {
			Scanner fin = new Scanner(new File("sample.in"));
			
						
			//make a 6 * 7 char array
			char [][] block = new char[6][7];
			
			//read all text from the file
			String input = "";
			while(fin.hasNextLine()){
				//add space to retain spacing at line breaks
				input += fin.nextLine() + " ";
			}
			
			//make sure string is at least 42 chars long
			while(input.length() < 42){
				input += "*";
			}
			
			//show the input string (optional)
			System.out.println("Input string:\n" + input);
			
			//fill the block
			int strIndex = 0;
			for(int row = 0; row < block.length; row++){
				for(int col = 0; col < block[row].length; col++){
					block[row][col] = input.charAt(strIndex++);
				}
			}
			
			//extract and build new string
			String result = "";
			for(int col = 0; col < block[0].length; col++){
				for(int row = 0; row < block.length; row++){
					result += block[row][col];
				}
			}
			
			//display the result
			System.out.println("Result:\n" + result);
			
			
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}
}