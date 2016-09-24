package demo;
import java.util.*;
//import java.swing;

public class Test2 {

	public static void main(String[] args) {
		/*
		System.out.println("56 % 6: "+ (56 % 6));
		System.out.println("78 % -4: "+ (78 % -4));
		System.out.println("-34 % 5: "+ (-34 % 5));
		System.out.println("-34 % -5: "+ (-34 % -5));
		System.out.println("5 % 1: "+ (5 % 1));
		System.out.println("1 % 5: "+ (1 % 5));
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number representing current day: ");
		double curnt_day_num = input.nextDouble();
		String curnt_day = "";
		
		if(curnt_day_num== 0){
			 curnt_day = "Sunday";
		}else if(curnt_day_num == 1){
			curnt_day = "Monday";
		}else if (curnt_day_num == 2){
			curnt_day = "Tuesday";
		}else if (curnt_day_num == 3){
			curnt_day = "Wednesday";
		}else if (curnt_day_num == 4){
			curnt_day = "Thursday";
		}else if (curnt_day_num == 5){
			curnt_day = "Friday";
		}else if (curnt_day_num == 6){
			
			curnt_day = "Saturday";
		}
		
		
		
		
		System.out.print("Enter the interval days: ");
		double interval = input.nextDouble();
		
		double latr_day_num = (curnt_day_num + interval) % 7;
		
		String latr_day = "";
		
		if(latr_day_num == 0){
			 latr_day = "Sunday";
		}else if(latr_day_num == 1){
			 latr_day = "Monday";
		}else if (latr_day_num == 2){
			latr_day = "Tuesday";
		}else if (latr_day_num == 3){
			latr_day = "Wednesday";
		}else if (latr_day_num == 4){
			latr_day = "Thursday";
		}else if (latr_day_num == 5){
			latr_day = "Friday";
		}else if (latr_day_num == 6){
			
			 latr_day = "Saturday";
		}
		
		System.out.println("If the current day is: " + curnt_day +" then after " + interval + " days it would be: " + latr_day );
		
		
		// TODO Auto-generated method stub

	}

}
