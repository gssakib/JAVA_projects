package demo;
import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string:");
		String line = stdin.nextLine();
		
		System.out.print(" Enter a character:");
		String letter = stdin.nextLine();
		int count = 0;
		
		for(int i = 1; i <= (line.length());i++ ){
			if((line.substring(i-1,i)).equals(letter.substring(0,1))){
				count++;
				
			}
		
		
		}
		System.out.println(" " +letter + "occurs " + count + " times in the string");


	}

}
