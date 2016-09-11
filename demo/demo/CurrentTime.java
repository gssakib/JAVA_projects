package demo;
import java.util.Scanner;
public class CurrentTime {

	public static void main(String[] args) {
		System.out.print("Enter offset from GMT: ");
		Scanner input = new Scanner(System.in);
		int offset = input.nextInt(); 
		
		long totalSeconds = (System.currentTimeMillis()) / 1000 ;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHourOffset = (totalMinutes / 60) + offset;
		long currentHourOffset = totalHourOffset % 24;
		
		long totalHourGreen = (totalMinutes / 60);
		long currentHourGreen = totalHourGreen % 24;
		
		//double totalDays = totalHour / 24;
		
		
	 
		System.out.println("The current time in GMT format at Greenwich is: " + currentHourGreen+ ":" + currentMinutes+":" + currentSeconds);
		System.out.println("The current time in GMT format at offset location is: " + currentHourOffset+ ":" + currentMinutes+":" + currentSeconds);
		
		//System.out.println("Total no of days: " + totalDays);
		
		//System.out.println(System.currentTimeMillis());
		// TODO Auto-generated method stub

	}

}
