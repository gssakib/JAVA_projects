package demo;
import java.util.*;

public class Cylinder {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = in.nextDouble();
		System.out.print("Enter length: ");
		double length = in.nextDouble();
		
		double area = (Math.pow(radius, 2)) * Math.PI;
		double volume = area*length;
		System.out.println("The area is: "+ (float)area + " The volume is: " + (float)volume);
		// TODO Auto-generated method stub

	}

}
