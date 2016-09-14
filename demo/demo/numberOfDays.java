package demo;
import java.util.Scanner;

public class numberOfDays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the year(in the format DDDD): ");
		int year = in.nextInt();
		
		System.out.print("Enter the month number(in the format DD): ");
		int monthNo = in.nextInt();
		
		String month = "";
		int noDays = 0;
		
		//if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0){
			
		if (monthNo == 1){
			month = "January";
			noDays =  31;
		}else if ((monthNo == 2) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
			month = "February";
			noDays =  29;
			
		}else if ((monthNo == 2) && !((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
			month = "February";
			noDays =  28;
			
		}else if(monthNo == 3){
			month = "March";
			noDays =  31;
			
		}else if(monthNo == 4){
			month = "April";
			noDays =  30;
			
		}else if(monthNo == 5){
			month = "May";
			noDays =  31;
			
		}else if(monthNo == 6){
			month = "June";
			noDays =  30;
			
		}else if(monthNo == 7){
			month = "July";
			noDays =  31;
			
		}else if(monthNo == 8){
			month = "August";
			noDays =  31;
			
		}else if(monthNo == 9){
			month = "September";
			noDays =  30;
			
		}else if(monthNo == 10){
			month = "October";
			noDays =  31;
			
		}else if(monthNo ==11){
			month = "November";
			noDays =  30;
			
		}else{
			month = "December";
			noDays =  30;
			
		}
			
		System.out.println(month + " " + year + " has " + noDays);	
		
		

	}

}
