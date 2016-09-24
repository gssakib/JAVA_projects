package demo;

public class PlateNoGenerator {

	public static void main(String[] args) {
		
		String fourNo = Integer.toString((int)(Math.random()*9001) + 1000);
		char char_1 = (char)((int)(Math.random()*26) + 65); 
		char char_2 = (char)((int)(Math.random()*26) + 65);
		char char_3 = (char)((int)(Math.random()*26) + 65);
		
		
		
		System.out.println("Plate No: " + char_1 + char_2 + char_3  + fourNo);
		
	}

}
