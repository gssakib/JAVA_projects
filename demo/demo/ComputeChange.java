package demo;
import java.util.*;

public class ComputeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the change amount as a decimal amount: ");
		double amount = input.nextDouble();
		
		double totalCents = Math.round(amount * 100.0);
		double dollars = totalCents / 100;
		//System.out.println(totalCents);
		System.out.println("The change that was entered is: " + dollars);
		
		
		double remainingCents_1 = totalCents % 100;
		double quarters = remainingCents_1 / 25;
		//System.out.println(remainingCents_1);
		//System.out.println((int)quarters);
		
		
		double remainingCents_2 = remainingCents_1 % 25;
		double dimes = remainingCents_2 / 10;
		//System.out.println(remainingCents_2);
		//System.out.println((int)dimes);
		
		double remainingCents_3 = remainingCents_2 % 10;
		double nickels = remainingCents_3 / 5;
		
		double pennies = remainingCents_3 % 5;
		
		System.out.println("The break-down of change is as follows: ");
		if( (int)dollars != 0){
			System.out.println("dollars: " + (int)dollars);
		}
		if( (int)quarters !=0){
			System.out.println("quarters: " + (int)quarters);
		}
		if((int)dimes !=0){
			System.out.println("dimes: " + (int)dimes);
		}
		if((int)nickels !=0){
			System.out.println("nickles: " + (int)nickels);
		}
		if((int)pennies !=0){
			System.out.println("pennies: " + (int)pennies);	
		}
		
		
		 
		
		
		
		
		// TODO Auto-generated method stub

	}

}
