package demo;

public class pyramid {

	public static void main(String[] args) {
		
		Pyramid(20, '#', -1);
		
	}
	
	public static void Pyramid(int base, char sym, int direc){
		if(direc == 1){
			int space = 0;
			
			for(int j = 0; j < base; j+=2){
				
				for(int k = 0; k< space; k++){
					System.out.print(' ');
				}
				space++;
				for(int i = 0; i < (base - j); i++){
					
					System.out.print(sym);
				}
				
				System.out.println();
			
			}
			
			
		}else if (direc == -1){
			int space = base / 2;
			for(int j = base; j > 0; j-=2){
				
				for(int k = 0; k< space; k++){
					System.out.print(' ');
				}
				space--;
				for(int i = (base+1 - j); i > 0 ; i--){
					
					System.out.print(sym);
				}
				
				System.out.println();
			
			}
			
			
		}else{
			
			System.out.println("bad input bitch");
		}
		
		
		
		
		
		
		
		
		
	}

}