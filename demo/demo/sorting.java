package demo;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = in.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = in.nextDouble();
		
		System.out.print("Enter third number: ");
		double num3 = in.nextDouble();
	
		double min = 0;
		double max = 0;
		double mid = 0;
		
		if (num3> num1 && num2 > num1){
			
			min = num1;
		}else if (num3 > num2 && num1 > num2 ){
			min = num2;
		}else{
			min = num3;
		}
		
		if (num3> num1 && num3 > num2){
			max = num3;
		}else if (num2 > num3 && num2 > num1 ){
			max = num2;
		}else{
			max = num1;
		}
		

		if ((num3 == max && num2 == min)|| (num3 == min && num2 == max)){
			mid = num1;
		}else if ((num1 == max && num2 == min)|| (num1 == min && num2 == max)){
			mid = num3;
		}else {
			mid = num2;
		}	
			
		//if ((num1 == max && num3 == min)|| (num1 == min && num3 == max)){
		
	
		System.out.println("The maximum is: " + max);
		System.out.println("The medium is: " + mid);
		System.out.println("The minimum is: " + min);

	}

}
