package demo;
import javax.swing.JOptionPane;
import java.util.*;
 

public class Test {

	public static void main(String[] args) {
		
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("Please input distance in miles : ");
		double miles = in.nextDouble();
		
		final double KILOMETERS_PER_MILE = 1.609;
		double kilometers = miles * KILOMETERS_PER_MILE;
		System.out.println(miles + " miles is : " + kilometers + " kilometers.");
		*/
		// TODO Auto-generated method stub
		
		//System.out.println(Math.pow(4,3));

		/*
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for a:  ");
		double a = input.nextDouble();
		
		System.out.print("Enter value for b:  ");
		double b = input.nextDouble();
		
		System.out.print("Enter value for c:  ");
		double c = input.nextDouble();
		
		System.out.print("Enter value for d:  ");
		double d = input.nextDouble();
		
		System.out.print("Enter value for r:  ");
		double r = input.nextDouble();
		
		double exp = (4 / (3*(r + 34))) - (9*(a + b * c)) + (3 + d * (2 + a)) / (a + b * d);
		System.out.println("The value of the epxression is: " + exp);
		
		
		

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for r: ");
		
		double r = input.nextDouble();
		
		
		System.out.print("Enter value for t: ");
		double t = input.nextDouble();
		
		double exp = 5.5 * (Math.pow((r + 2.5),(2.5 + t)));
		System.out.println("The value of the expression is: " + exp);
		
		
		*/
		
		/*
		double  x = 2;
		x += 2;
		System.out.println(x += 2);
		*/
		
		/*
		double a = 6.5;
		a += a + 1;
		
		System.out.print(a);
		
		double b = 6;
		b /= 2;
		System.out.println(b);
		
		
		int i = 2;
		int k = ++i + i ;
		
	System.out.println("k:" + k);
		*/
		/*
		
		int x = 0;
		int y = 0;
		x = y = x = 1;
		System.out.println("x :" + x);
		System.out.println("y :" + y);
	
	
		int a = 6;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		
	
		
		int sum = 0;
		sum = (int)(sum + 4.5);
		System.out.println(sum);
		
	
		
		float f = 12.5F;
		int i = (int)f;
		System.out.println("f is " + f);
		System.out.println("i is " + i);
		
	*/
		//double amount = 5;
		//System.out.println(amount / 2);
		
		//float x = 9.0;
		
		//char letter  = 'A';
		//char numChar = '4';
		
		
		//char letter = 'u0041';
		//char numChar = '\u0034';
		//char ch = 'a';
		//System.out.println(++ch);
		/*
		int i = 'a';
		char c = 97;
	    System.out.println(i);
	    System.out.println(c);
	*/
		
		// Prompt the user to enter a number
		 //String input = JOptionPane.showInputDialog(null,"Please enter an integer:","ShowLogicErrors", JOptionPane.QUESTION_MESSAGE);
		 //int number = Integer.parseInt(input);
		 // Display the result
		 //System.out.println("The number is between 1 and 100, inclusively? " + ((1 < number) && (number < 100)));
		 
		 //System.exit(0);
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input score: ");
		double score = in.nextDouble();
		
		System.out.print("Input pay: ");
		double pay = in.nextDouble();
		
		 if (score > 90){
			 pay = 1.03 * pay ;
		 }else{
			 pay = 1.01 *  pay;
		 }
		
		System.out.println("pay: " + pay);
		System.out.println("score: " + score);

		 
		 
		 
		 
		
		
		
	}

}
