package demo;
import java.util.Scanner;


public class Tax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Employee’s name (e.g., Smith): ");
		String name = in.nextLine();
		
		System.out.print("Number of hours worked in a week (e.g., 10): ");
		double hoursWorked = in.nextDouble();
		
		System.out.print("Hourly pay rate (e.g., 9.75): ");
		double hourlyRate = in.nextDouble();
		
		
		double grossSalary = hoursWorked * hourlyRate;
		double fedTax = 0.2 * grossSalary;
		double stateTax = 0.09 * grossSalary;
		double netSalary = grossSalary - (fedTax + stateTax);

		System.out.println("Gross Salary = " + grossSalary);
		System.out.println("Federal Tax = " + fedTax);
		System.out.println("State Tax = " + stateTax);
		System.out.println("Net Salary = " + netSalary);
		
	}

}
