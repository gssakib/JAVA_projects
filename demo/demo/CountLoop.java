package demo;
import java.util.Scanner;

public class CountLoop {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double total = 0 ;
		double pos = 0;
		double neg = 0;
		double avg = 0;
		
		System.out.print("Enter number(enter 0 to terminate): ");
		double num = stdin.nextDouble();
		
		while(num != 0){
			total = total + num;
			if(num > 0){
				pos++;
			}else{
				neg++;
			}
			System.out.print("Enter number(enter 0 to terminate): ");
			num = stdin.nextDouble();
		}
		
		avg = total / (pos + neg);
		
		System.out.println("No. of positive numbers: " + pos);
		System.out.println("No. of negative numbers: " + neg);
		System.out.printf("Average: %.2f%n", avg);
	}

}
