package demo;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input distance in miles : ");
		double miles = in.nextDouble();
		
		final double KILOMETERS_PER_MILE = 1.609;
		double kilometers = miles * KILOMETERS_PER_MILE;
		System.out.println(miles + " miles is : " + kilometers + " kilometers.");
		// TODO Auto-generated method stub

	}

}