package demo;
import java.util.*;

import javax.swing.JOptionPane;

public class Sum {

	public static void main(String[] args) {
		
		
		
		Scanner in =  new Scanner(System.in);
		System.out.print("Enter any number between 0-1000:  ");
		int num = in.nextInt();
		int num_1 = num;
		
		
		
		while(num_1 < 0 || num_1 > 1000){
			
			// wtf why wont this work ?!!!//JOptionPane.showMessageDialog(null, "That is an invalid number. Please try again.");
			System.out.println("That is an invalid number. Please try again.");
			System.out.print("Enter any number between 0-1000:  ");
		    num = in.nextInt();
		    num_1 = num;
			
		}
			
		
		
		
		if(num_1 == 1000){
			System.out.print("The sum of the digits in the number, "+ num + " is: 1 " );
		
		}else{
		
			int third = num_1 % 10;
			num_1 = num_1 / 10;
			int second = num_1 % 10;
			num_1 = num_1 / 10;
			
			System.out.print("The sum of the digits in the number, "+ num + " is: "+ (third + second + num_1) );
		}
		
		
		 
		
		// TODO Auto-generated method stub

	}

}
