package demo;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double principal = input.nextDouble();
		
		System.out.print("Enter the annual interest rate(in percentage): ");
		double monthlyInterest = (input.nextDouble()) / (12.0 * 100);
		System.out.println(monthlyInterest);
		System.out.print("Enter the month after which you want to see the account value: ");
		double noMonth = input.nextDouble();
		double accountVal = principal;
		
		for (int i = 1; i < noMonth; i ++){
			accountVal = (principal + accountVal) * (1 + monthlyInterest);
			
		}
		
		
		
		//double accountVal = principal * Math.pow((1 + monthlyInterest),6);
		
		System.out.println("After " + noMonth + " month, the account value is: $" + accountVal);
		

	}

}
