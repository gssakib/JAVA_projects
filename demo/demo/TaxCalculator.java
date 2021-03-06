package demo;
import java.util.Scanner;


public class TaxCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The filing statuses are: (0-single filer, 1-married jointly or "
				+ "qualifying widow(er),2-married separately, 3-head of household)");
		System.out.print("Enter the number associated with the filing status: ");
		double status = in.nextDouble();
		
		System.out.print("Enter taxable income: ");
		double taxIncome = in.nextDouble();
		double taxAmount = 0;
		
		if(status == 0 ){
			if(taxIncome <= 8350){
				taxAmount = 	taxIncome * (0.1);
				
				
			}else if(taxIncome <= 33950){
				taxAmount = 	(taxIncome - 8350) * (0.15) + 8350 * 0.1 ;
				
				
			}else if(taxIncome <= 82250){
				taxAmount = 	(taxIncome - 33950) * (0.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}else if(taxIncome <= 171550){
				taxAmount = 	(taxIncome - 82250) * (0.28) + 48299 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}else if(taxIncome <= 372950){
				taxAmount = 	(taxIncome - 171550 ) * .33 + (89299) * (0.28) + 48299 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}else{
				taxAmount = 	(taxIncome - 372950) * .35 + (201399) * .33 + (89299) * (0.28) + 48299 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}
			
			System.out.println("Total Tax: " + taxAmount);
		}else if(status == 1 ){
			if(taxIncome <= 16700){
				taxAmount = 	taxIncome * (0.1);
				
				
			}else if(taxIncome <= 67900){
				taxAmount = 	(taxIncome - 8350) * (0.15) + 16700 * 0.1 ;
				
				
			}else if(taxIncome <= 137050){
				taxAmount = 	(taxIncome - 33950) * (0.25) + 51199 * .15 + 16700 * 0.1 ;
				
			}else if(taxIncome <= 208850){
				taxAmount = 	(taxIncome - 82250) * (0.28) + 69149 * (.25) + 51199 * .15 + 16700 * 0.1 ;
				
			}else if(taxIncome <= 372950){
				taxAmount = 	(taxIncome - 171550 ) * .33 + (71799) * (0.28) + 69149 * (.25) + 51199 * .15 + 16700 * 0.1 ;
				
			}else{
				taxAmount = 	(taxIncome - 372950) * .35 + (164099) * .33 + (89299) * (0.28) + 48299 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}
			System.out.println("Total Tax: " + taxAmount);
		}else if(status == 2 ){
			if(taxIncome <= 8350){
				taxAmount = 	taxIncome * (0.1);
				
				
			}else if(taxIncome <= 33950){
				taxAmount = 	(taxIncome - 8350) * (0.15) + 8350 * 0.1 ;
				
				
			}else if(taxIncome <= 68525){
				taxAmount = 	(taxIncome - 33950) * (0.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}else if(taxIncome <= 104425){
				taxAmount = 	(taxIncome - 82250) * (0.28) + 34574 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}else if(taxIncome <= 186475){
				taxAmount = 	(taxIncome - 171551 ) * .33 + (35899) * (0.28) + 34574 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}else{
				taxAmount = 	(taxIncome - 372951) * .35 + (82049) * .33 + (35899) * (0.28) + 34574 * (.25) + 25599 * .15 + 8350 * 0.1 ;
				
			}
			System.out.println("Total Tax: " + taxAmount);
		}else if(status == 3 ){
			if(taxIncome <= 11950){
				taxAmount = 	taxIncome * (0.1);
				
				
			}else if(taxIncome <= 45500){
				taxAmount = 	(taxIncome - 11950) * (0.15) + 11950 * 0.1 ;
				
				
			}else if(taxIncome <= 117450){
				taxAmount = 	(taxIncome - 45500) * (0.25) + 33549 * .15 + 11950 * 0.1 ;
				
			}else if(taxIncome <= 190200){
				taxAmount = 	(taxIncome - 117450) * (0.28) + 71949 * (.25) + 33549 * .15 + 11950 * 0.1 ;
				
			}else if(taxIncome <= 372950){
				taxAmount = 	(taxIncome - 190200 ) * .33 + (72749) * (0.28) + 71949 * (.25) + 33549 * .15 + 11950 * 0.1 ;
				
			}else{
				taxAmount = 	(taxIncome - 372950) * .35 + (182749) * .33 + (72749) * (0.28) + 71949 * (.25) + 33549 * .15 + 11950 * 0.1 ;
				
			}
			System.out.println("Total Tax: " + taxAmount);
		}else{
			System.out.println("Invalid Input.Please try again.");
			System.exit(1);
		}
		
	}
	

}
