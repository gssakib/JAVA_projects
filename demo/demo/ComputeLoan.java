package demo;
import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Loan Amount:  ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter Annual Interest Rate in percentage:  ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Number of years:  ");
		double numberOfYears = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate),(numberOfYears * 12))));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("Monthly payment : " + (int)(monthlyPayment * 1) / 1.0);
		System.out.println("Total payment : " + (int)(totalPayment * 1) / 1.0);
		// TODO Auto-generated method stub

	}

}
