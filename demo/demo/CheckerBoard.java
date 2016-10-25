package demo;
import java.util.Arrays;
public class CheckerBoard {

	public static void main(String[] args) {
		//filling in
		int zeroes = 0, ones = 0;
		int[][] arry = new int[8][8];
		
		for(int row = 0; row < arry.length; row++){
			for(int column = 0; column < arry[row].length; column++){
				arry[row][column] = (int)(Math.random()*2);
			}
		}
		
		//checking rows
		for(int row = 0; row < arry.length; row++){
			for(int column = 0; column < arry[row].length; column++){
				if(arry[row][column] == 0){
					zeroes++;
				}else if(arry[row][column] == 1){
					ones++;
				}
			}
			if(zeroes == 8){
				System.out.println("rows of zeroes: " + row);
			}else if(ones == 8){
				System.out.println("rows of ones: " + row);
			}
			ones = 0;
			zeroes = 0;
		}
	
		
		
		//checking columns
				zeroes = 0;
				ones = 0;
				for(int column = 0; column < arry.length; column++){
					for(int row = 0; row < arry.length; row++){
						if(arry[row][column] == 0){
							zeroes++;
						}else if(arry[row][column] == 1){
							ones++;
						}
					}
					if(zeroes == 8){
						System.out.println("columns of zeroes: " + column);
					}else if(ones == 8){
						System.out.println("column of ones: " + column);
					}
					ones = 0;
					zeroes = 0;
				}
				
				ones =0;
				zeroes = 0;
				//checking main diag
				
				for(int row = 0, column = 0; row < arry.length; row++, column++){
					if(arry[row][column] == 0){
						zeroes++;
					}else if(arry[row][column] == 1){
						ones++;
					}
				}
				
				if(zeroes == 8){
					System.out.println("Main Diagonal is zeroes"  );
				}else if(ones == 8){
					System.out.println("Main Diagonal is ones" );
				}
				
				//checking minor diagonal
				ones =0;
				zeroes = 0;
				for(int row = 0, column = 7; row < arry.length; row++, column--){
					if(arry[row][column] == 0){
						zeroes++;
					}else if(arry[row][column] == 1){
						ones++;
					}
				}
				
				if(zeroes == 8){
					System.out.println("Minor Diagonal is zeroes"  );
				}else if(ones == 8){
					System.out.println("Minor Diagonal is ones" );
				}
				
				
				
				for(int i = 0; i < arry.length; i++){
					System.out.println(Arrays.toString(arry[i]));
					System.out.println("");
				}
		
				
		
	
	
	}
	
	

}
