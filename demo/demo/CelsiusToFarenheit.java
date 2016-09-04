package demo;
import java.util.*;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		
		System.out.print("Enter temperature in celcius: ");
		Scanner input = new Scanner(System.in);
		double celcius = input.nextDouble();
		double farenheit = (9.0 / 5) * celcius + 32;
		
		System.out.println(celcius + " celcius is: "+ farenheit + " farenheit");
		
		
		// TODO Auto-generated method stub

	}

}
