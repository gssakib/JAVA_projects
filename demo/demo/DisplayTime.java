package demo;
import java.util.*;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter time in seconds:    ");
		int seconds = in.nextInt();
		
		int minutes = seconds / 60;
		int rem_sec = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + rem_sec + " seconds.");
		
		
		
		// TODO Auto-generated method stub

	}

}
