package demo;

public class ConvertTime {

	public static void main(String[] args) {
		System.out.println(convertMillis(100000));

	}
	public static String convertMillis(long millis){
		long hours = millis / (60 * 60 * 1000);
		long rem = millis % (60 * 60 * 1000);
		
		long minutes = rem / (60 * 1000);
		rem = rem % (60 * 1000);
		
		
		long seconds = rem / (1000);
		rem = rem % 1000;
		
		return hours + ":"+ minutes + ":" + seconds;
		
	}

}
