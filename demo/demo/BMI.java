package demo;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		final double KILOGRAMSPERPOUND = 0.45359237; 
		final double METERSPERINCH = 0.0254; 
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter weight(in lbm): ");
		double weight = in.nextDouble();
		
		System.out.print("Please enter height(in inches): ");
		double height = in.nextDouble();
		
		double BMI = (weight * KILOGRAMSPERPOUND ) / Math.pow((height*METERSPERINCH),2);
		
		System.out.println("BMI: " + (float)BMI);
		
		

	}

}
