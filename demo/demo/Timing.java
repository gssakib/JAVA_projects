package demo;

import java.util.Arrays;

public class Timing {

	public static void main(String[] args) {
		int[] num = {3,2,1};
		/*
		for(int i = 0; i < num.length; i++){
			num[i] = (int) (Math.random()*1000000000);
		
		}
		
		int key = (int) (Math.random()*1000000000);
		*/
		//System.out.println(key);
		//System.out.println(Arrays.toString(num));
		//System.out.println(linearSearch(num, key));

		System.out.println(Arrays.toString(selectionSort(num)));
	}
	
	
	public static long linearSearch(int[] num, int key){
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0;
		
		for(int i = 0; i < num.length; i++){
			if(num[i] == key ){
				//
				System.out.println(num[i]);
				System.out.println(key);
				elapsedTime = System.currentTimeMillis() - startTime;
				return elapsedTime;
				
			}
			
		}
		 
		//System.out.println("ffobar");
		
		System.out.println(key);
			 elapsedTime = System.currentTimeMillis() - startTime;
			 return elapsedTime;
			
			
		}
	
	
	
	
	
	public static int[] selectionSort(int num[]){
		int temp =0;
		int base = 1;
		int lowest = num[0];
		for(int i = base; i < num.length; i++){
			
			if(num[i]<lowest){
				temp = num[base];
				num[base] = lowest;
				num[i] = temp;
				base++;
				lowest = num[base];
				
				
			}
			
			
			
		}
		return num;
		
		
	}
	
	
	
	
	
	
	
	

}
