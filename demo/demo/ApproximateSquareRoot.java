package demo;
import java.util.Scanner;

public class ApproximateSquareRoot {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter no: ");
		double squareRoot = sqrt(stdin.nextDouble());
		System.out.println(squareRoot);

	}
	public static double sqrt(double num){
		double nextGuess = 10;
		double lastGuess = 100;
		
		while (Math.abs(nextGuess - lastGuess) > 0.0001){
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2 ;
			
		}
		
		return nextGuess;
		
	}

}
