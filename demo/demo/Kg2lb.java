package demo;

public class Kg2lb {

	public static void main(String[] args) {
		
		System.out.println("kilograms      Pounds");
		for(int i = 1; i <= 199; i++){
			
			if((i % 2) != 0){
				if(i < 5){
					System.out.println("      " + i+"           " + (float)(i*2.2));
				}else if(i < 11){
					System.out.println("      " + i+"          " + (float)(i*2.2));
				}else if (i < 101){
					System.out.println("     " + i+"          " + (float)(i*2.2));
				}else{
					System.out.println("    " + i+"          " + (float)(i*2.2));
				}
				
					
				
				
				
			}
			
			
		}

	}

}
