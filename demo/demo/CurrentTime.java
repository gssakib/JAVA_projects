package demo;

public class CurrentTime {

	public static void main(String[] args) {
		
		long totalSeconds = (System.currentTimeMillis()) / 1000 ;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHour = totalMinutes / 60;
		long currentHour = totalHour % 24;
		
		double totalDays = totalHour / 24;
		
		System.out.println("The current time in GMT format is: " + currentHour+ ":" + currentMinutes+":" + currentSeconds);
		
		System.out.println("Total no of days: " + totalDays);
		
		//System.out.println(System.currentTimeMillis());
		// TODO Auto-generated method stub

	}

}