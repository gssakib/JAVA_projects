package demo;
import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number1 < number2){
			int temp  = number2;
			number2 = number1;
			number1 = temp;
		}
		System.out.print(number1 + " - " + number2 +  " = ");
		Scanner input = new Scanner(System.in);
		int ansInput = input.nextInt();
		int ansReal = number1 - number2 ;
		if (ansInput == ansReal){
			System.out.println("Yes that answer is correct!");
		}else{
			System.out.println("Nope you suck, your answer is not right..");
					
		}
		
	}

}