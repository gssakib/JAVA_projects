package demo;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ConversionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello there! Welcome to the Conversion Calculator. Please select from one of the following option by"
				+ "typing in the letter associated with each option: ");
		System.out.println("A - convert pounds to kilos");
		System.out.println("B – convert kilos to pounds");
		System.out.println("C – convert kilometers to miles");
		System.out.println("D – convert miles to kilometers");
		System.out.println("E – Exit");
		System.out.println(" ");
		System.out.print("Your option:  ");
		String option = in.nextLine();
		
		//System.out.println(option);
		if(option.equals("A") || option.equals("a")){
			System.out.print("Enter mass(in pounds): ");
			double massLB = in.nextDouble();
			System.out.println(massLB +" pounds is " + (0.453592 * massLB) + " kilos");
			
		}else if(option.equals("B") || option.equals("b")){
			System.out.print("Enter mass(in kilos): ");
			double massKG = in.nextDouble();
			System.out.println(massKG +" kilos is " + (2.20462 * massKG) + " pounds");
			
		}else if(option.equals("C") || option.equals("c")){
			System.out.print("Enter length(in kilometers): ");
			double lengthKM = in.nextDouble();
			System.out.println(lengthKM +" kilometers is " + (0.621371 * lengthKM) + " miles");
			
		}else if(option.equals("D") || option.equals("d")){
			System.out.print("Enter length(in miles): ");
			double lengthMiles = in.nextDouble();
			System.out.println(lengthMiles +" miles is " + (1.60934 * lengthMiles) + " kilometers");
			
		}else if(option.equals("E") || option.equals("e")){
			System.out.println("Thank you! See ya later..");
			JOptionPane.showMessageDialog(null, "Thank you! See ya later..");
			
		}else{
			System.out.println("Nope, not a correct option. Try running the program again...");
			JOptionPane.showMessageDialog(null, "Nope, not a correct option. Try running the program again...");
			
		}
			
		
		
		
		
		
	}

}
