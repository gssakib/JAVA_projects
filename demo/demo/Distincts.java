package demo;
import java.util.Scanner;


public class Distincts {

	public static void main(String[] args) {
		int count = 0;
		
		double[] numArray = new double[10];
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter no: ");
		double num = stdin.nextDouble();
		
		numArray[0] = num;
		
		
		
		System.out.print("Enter no: ");
		num = stdin.nextDouble();
		
		
		for(int j = 1; j <= 10; j++ ){
			
			int i = 0;
			for (i = 0; i< j; i++){
				
				if(numArray[i] == num){
					count++;
				
				}
			
			}
			//System.out.println(count);
			//System.out.println(j);
			
			if(count == 0){
				
				numArray[j] = num;
				
			}else{
				j--;
			}
			
			
			if(j == 9){
				System.out.println("Array is filled!");
				break;
			}
			
			count = 0;
			
			System.out.print("Enter no: ");
			num = stdin.nextDouble();
			
		}
	
		for(int i = 0; i < numArray.length; i++){
			System.out.println(numArray[i]);
		}
		
		
		
		
		//System.out.println(count);
		
		
		}
		
		
		

}


