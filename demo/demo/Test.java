package demo;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("Please input distance in miles : ");
		double miles = in.nextDouble();
		
		final double KILOMETERS_PER_MILE = 1.609;
		double kilometers = miles * KILOMETERS_PER_MILE;
		System.out.println(miles + " miles is : " + kilometers + " kilometers.");
		*/
		// TODO Auto-generated method stub
		
		//System.out.println(Math.pow(4,3));

		/*
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for a:  ");
		double a = input.nextDouble();
		
		System.out.print("Enter value for b:  ");
		double b = input.nextDouble();
		
		System.out.print("Enter value for c:  ");
		double c = input.nextDouble();
		
		System.out.print("Enter value for d:  ");
		double d = input.nextDouble();
		
		System.out.print("Enter value for r:  ");
		double r = input.nextDouble();
		
		double exp = (4 / (3*(r + 34))) - (9*(a + b * c)) + (3 + d * (2 + a)) / (a + b * d);
		System.out.println("The value of the epxression is: " + exp);
		
		
		*/
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for r: ");
		
		double r = input.nextDouble();
		
		
		System.out.print("Enter value for t: ");
		double t = input.nextDouble();
		
		double exp = 5.5 * (Math.pow((r + 2.5),(2.5 + t)));
		System.out.println("The value of the expression is: " + exp);
		
		
		
		
	}

}
