package demo;
import javax.swing.JOptionPane;

public class TipsAndChange {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null,"Please enter an integer:","ShowLogicErrors", JOptionPane.QUESTION_MESSAGE);
		double price = Double.parseDouble(input);
		double tip = 0.0;
		
		if(price < 30.0){
			tip = 5.0;
			
			double total = price + tip;
			System.out.println("The total amount to be paid is: " + total);
			
			
			input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","ShowLogicErrors", JOptionPane.QUESTION_MESSAGE);
			double payment = Double.parseDouble(input);
			double computedChange = 0.0;
			while(payment < total){
				
				input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","ShowLogicErrors", JOptionPane.QUESTION_MESSAGE);
				payment = Double.parseDouble(input);
				
			
			}
			
			computedChange = payment - total;
			System.out.println(computedChange);
			double totalCents = Math.round(computedChange * 100.0);
			
			
			
			
			
			
			
			
			
			
		}else{
			
			tip = 0.15 * price;
			double total = price + tip;
			System.out.println("The total amount to be paid is: " + total);
			
			
			input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","ShowLogicErrors", JOptionPane.QUESTION_MESSAGE);
			double payment = Double.parseDouble(input);
			double computedChange = 0.0;
			while(payment < total){
				
				input = JOptionPane.showInputDialog(null,"Please enter the amount you wish to pay: ","ShowLogicErrors", JOptionPane.QUESTION_MESSAGE);
				payment = Double.parseDouble(input);
			
			
			}
			computedChange = payment - total;
			System.out.println(computedChange);
		
			}
			
		
		
	}
	
}
			
			
		
		
		
	
		
		
		// TODO Auto-generated method stub