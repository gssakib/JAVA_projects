package demo;

public class ReverseInt {

	public static void main(String[] args) {
		
		
		
		reverse(125678);
		
		
		
		
	}
	
	
	
	
	public static void reverse(int number){
		String numString = Integer.toString(number);
		String revString = "";
		for(int i = 0; i < (numString.length()); i++){
			revString = revString + numString.substring((numString.length() -(1 + i)), (numString.length() - i)); 
			
		}
		
		System.out.println(revString);
		
		
	}

}
