package demo;
import java.util.*;
import javax.swing.JOptionPane;

public class Tips {

	public static void main(String[] args) {
		
		//String input = JOptionPane.showInputDialog(null,"Please enter the price:","Input Box", JOptionPane.QUESTION_MESSAGE);
		//double price = Double.parseDouble(input);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the subtotal: $");
		double subTotal = in.nextDouble();
		//System.out.print("Enter the gratuity rate(in percentage): ");
		//double gratuity = (in.nextDouble()) / 100.0 ;
		double gratuity = 0.15;
		
		if (subTotal > 30){
			double total = subTotal + (subTotal * gratuity);
			System.out.println("The total value including gratuity is: $"+ (float)total );
		}else{
			double total = subTotal + 5.0;
			System.out.println("The total value including gratuity is: $"+ (float)total );
		}
		
		
		// TODO Auto-generated method stub

	}

}
