package demo;

import java.util.*;

public class ComputeAverage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		double no_1 = in.nextDouble();
		
		System.out.print("Enter number 2: ");
		double no_2 = in.nextDouble();
		
		System.out.print("Enter number 3: ");
		double no_3 = in.nextDouble();
		
		double avg = (no_1 + no_2 + no_3) / 3.0 ;
		
		System.out.println("The averge of the 3 input numbers are:  " + avg);
		
				
		// TODO Auto-generated method stub

	}

}
