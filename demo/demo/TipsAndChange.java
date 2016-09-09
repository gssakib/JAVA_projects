package demo;
import javax.swing.JOptionPane;

public class TipsAndChange {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null,"Please enter the price:","Input Box", JOptionPane.QUESTION_MESSAGE);
		double price = Double.parseDouble(input);
		double tip = 0.0;
		
		if(price < 30.0){
			tip = 5.0;
			
			double total = price + tip;
			//System.out.println("The total amount to be paid is: " + total + " dollars");
			JOptionPane.showMessageDialog(null, "The total amount to be paid is: $" + total );
			
			input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","Input Box", JOptionPane.QUESTION_MESSAGE);
			double payment = Double.parseDouble(input);
			System.out.println("The user paid: " +  payment + " dollars" );
			double computedChange = 0.0;
			
			while(payment < total){
				
				input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","Input Box", JOptionPane.QUESTION_MESSAGE);
				payment = Double.parseDouble(input);
				
			
			}
			
			computedChange = payment - total;
			System.out.println("The computed change is: " + computedChange + " dollars");
			//System.out.println(computedChange);
			double totalCents = Math.round(computedChange * 100.0);
			
			// calculating no. of twenty dollar bills 
			double twenties = totalCents / (20 * 100);
			double remainingCents = totalCents % (20 * 100);
			
			//calculating no. of ten dollar bills
			double tens = remainingCents / (10 * 100);
			remainingCents = remainingCents % (10 * 100);
			
			//calculating no. of five dollar bills
			//System.out.println(remainingCents);
			double fives = remainingCents / (5 * 100);
			//System.out.println(fives);
			remainingCents = remainingCents % (5 * 100);
			
			//calculating no. of one dollar bills
			double ones = remainingCents / (1 * 100);
			remainingCents = remainingCents % (1 * 100);
			
			////calculating no. of quarters
			double quarters = remainingCents / (25);
			remainingCents = remainingCents % (25);
			
			//calculating no. of dimes
			double dimes = remainingCents / (10);
			remainingCents = remainingCents % (10);

			///calculating no. of nickels
			double nickels = remainingCents / (5);
			remainingCents = remainingCents % (5);
			
			//calculating no. of pennies
			double pennies = remainingCents;
			
			
			if ((int)twenties != 0){
				System.out.println("twenties: " + (int)twenties);
			}
			if ((int)tens != 0){
				System.out.println("tens: " + (int)tens);
			}
			if((int)fives !=0){
				System.out.println("fives: " + (int)fives);
			}
			if((int)ones != 0){
				System.out.println("ones: " + (int)ones);
			}
			if((int)quarters != 0){
				System.out.println("quarters: " + (int)quarters);
			}
			if((int)dimes != 0){
				System.out.println("dimes: " + (int)dimes);
			}
			if((int)nickels != 0){
				System.out.println("nickels: " + (int)nickels);
			}
			if((int)pennies != 0){
				System.out.println("pennies: " + (int)pennies);
			}
			
			
			
			
			
		}else{
			
			tip = 0.15 * price;
			double total = price + tip;
			//System.out.println("The total amount to be paid is: " + total);
			JOptionPane.showMessageDialog(null, "The total amount to be paid is: $" + total);
			
			input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","Input Box", JOptionPane.QUESTION_MESSAGE);
			double payment = Double.parseDouble(input);
			System.out.println("The user paid: " +  payment + " dollars" );
			double computedChange = 0.0;
			while(payment < total){
				
				input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","Input Box", JOptionPane.QUESTION_MESSAGE);
				payment = Double.parseDouble(input);
			
			
			}
			computedChange = payment - total;
			System.out.println("The computed change is: " + computedChange + " dollars");
			double totalCents = Math.round(computedChange * 100.0);
			
			// calculating no. of twenty dollar bills 
			double twenties = totalCents / (20 * 100);
			double remainingCents = totalCents % (20 * 100);
			
			//calculating no. of ten dollar bills
			double tens = remainingCents / (10 * 100);
			remainingCents = remainingCents % (10 * 100);
			
			//calculating no. of five dollar bills
			//System.out.println(remainingCents);
			double fives = remainingCents / (5 * 100);
			//System.out.println(fives);
			remainingCents = remainingCents % (5 * 100);
			
			//calculating no. of one dollar bills
			double ones = remainingCents / (1 * 100);
			remainingCents = remainingCents % (1 * 100);
			
			////calculating no. of quarters
			double quarters = remainingCents / (25);
			remainingCents = remainingCents % (25);
			
			//calculating no. of dimes
			double dimes = remainingCents / (10);
			remainingCents = remainingCents % (10);

			///calculating no. of nickels
			double nickels = remainingCents / (5);
			remainingCents = remainingCents % (5);
			
			//calculating no. of pennies
			double pennies = remainingCents;
		
			
			if ((int)twenties != 0){
				System.out.println("twenties: " + (int)twenties);
			}
			if ((int)tens != 0){
				System.out.println("tens: " + (int)tens);
			}
			if((int)fives !=0){
				System.out.println("fives: " + (int)fives);
			}
			if((int)ones != 0){
				System.out.println("ones: " + (int)ones);
			}
			if((int)quarters != 0){
				System.out.println("quarters: " + (int)quarters);
			}
			if((int)dimes != 0){
				System.out.println("dimes: " + (int)dimes);
			}
			if((int)nickels != 0){
				System.out.println("nickels: " + (int)nickels);
			}
			if((int)pennies != 0){
				System.out.println("pennies: " + (int)pennies);
			}
			
		
		
		
		
		}
			
		
		
	}
	
}
			
			
		
		
		
	
		
		
		// TODO Auto-generated method stub
