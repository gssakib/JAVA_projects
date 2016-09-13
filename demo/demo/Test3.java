package demo;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.print("Enter employee's name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();
		
		
		
	
		double grossPay =  (hours * payRate);
		double federalWidth = grossPay * federalRate;
		
		
		
		double stateWidth = grossPay * stateRate;
		double totalDeductions = federalWidth + stateWidth;
		double netPay = grossPay - totalDeductions;
		
		System.out.println("Employee Name: "+ name);
		System.out.println("");
		System.out.println("Hours Worked:  " + hours);
		System.out.println("Pay Rate:  $" + payRate);
		System.out.println("Gross Pay:  $" + grossPay  );
		System.out.println("Deductions:");
		
		//System.out.println("  Federal Withholding ("+ (float)(federalRate*100.0)  + "%):  $" + (float)federalWidth );
		System.out.printf("  Federal Withholding (%.1f%%):  $%.2f%n", (federalRate*100),federalWidth);
		//System.out.println("  State Withholding ("+ (float)(stateRate*100.0)  + "%):  $" + (float)stateWidth );
		System.out.printf("  State Withholding (%.1f%%):  $%.2f%n",(stateRate*100.0),stateWidth);
		//System.out.println("  Total Deduction:  $" + (float)totalDeductions); 			   
		System.out.printf("  Total Deduction:  $%.2f%n", totalDeductions);
		//System.out.println("Net Pay:   $" + (float)netPay);
		System.out.printf("  Net Pay:  $%.2f%n", netPay);
	}

}
