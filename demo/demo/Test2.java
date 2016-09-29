package demo;
import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		Scanner stdin  = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = stdin.nextLine();
		int landCount = 0;
		int airCount = 0;
		int waterCount = 0;
		
		//System.out.println(str.length());
		if(str.contains("land")){
			landCount ++;
			
		}else if (str.contains("air")){
		
			airCount++;
		}else if(str.contains("water")){
			
			waterCount++;
		}
		while(!(str.contains("xxxxx")) ){

			if(str.contains("land")){
				landCount ++;
				
			}else if (str.contains("air")){
			
				airCount++;
			}else if(str.contains("water")){
				
				waterCount++;
			}
			

		//System.out.println("foodsf");
		System.out.print("Enter string: ");
		str = stdin.nextLine();


		}

		System.out.println("land" +landCount );
		System.out.println("air" +airCount );
		System.out.println("water" +waterCount );
			


		}
		   
		}
		
		
	
	


