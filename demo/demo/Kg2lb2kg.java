package demo;

public class Kg2lb2kg {

	public static void main(String[] args) {
		
		int j = 20;
		System.out.println("kilograms      Pounds        Pounds       kilograms");
		
		for(int i = 1; i <= 199; i++){
			
			if((i % 2) != 0){
				if(i < 11){
					
					System.out.println("    " + i+"           " + (float)(i*2.2)+"           " + (float)j + "         " + (float)((1/2.2)*j) );
					
				}else{
					
					System.out.println("    " + i+"          " + (float)(i*2.2)+ "          "+ (float)j+"        " + (float)((1/2.2)*j));
				}
				
				j += 5;
			}
			 	
			
		}
		
		
		}

	}