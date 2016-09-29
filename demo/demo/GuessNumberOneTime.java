package demo;
import java.util.Scanner;


public class GuessNumberOneTime {

	public static void main(String[] args) {
		double number = (int)(Math.random()*101);
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Guess number: ");
		int guess = stdin.nextInt();
		
		while(number != guess){
			if(number > guess){
				System.out.println("Too Low, guess again..");
				System.out.print("Guess number: ");
				guess = stdin.nextInt();
			}else{
				System.out.println("Too High, guess again..");
				System.out.print("Guess number: ");
				guess = stdin.nextInt();
				
			}
			
			
		}
		
		System.out.println("Yes, you guessed it...you beautiful bastard...");

	}

}
