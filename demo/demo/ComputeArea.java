package demo;
import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		
		final double gazi = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:  ");
		
		double radius = input.nextDouble();
		
		//double area = radius * radius * Math.PI;  
		double area = radius * radius * gazi;
		
		System.out.println("The area of the circle of radius" + radius + "is : " + area);
		
		
		
		// TODO Auto-generated method stub

	}

}
