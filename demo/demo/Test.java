package demo;

import javax.swing.JOptionPane;

import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		double[] myList = {1,2,3,4,5,6};
for(int j = 0; j < 2; j++){
		
		
		
		/*
		double temp = myList[0]; // Retain the first element
		// Shift elements left
		for (int i = 1; i < myList.length; i++) {
		 myList[i - 1] = myList[i];
		}
		// Move the first element to fill in the last position
		myList[myList.length - 1] = temp;
*/
}
		for(int rows = 1; rows<=9; rows++){
			
			for(int columns = 1; columns < rows; columns++){
				
				System.out.print(" ");
				
				
			}
			
			for(int columns = rows; columns <=9; columns++){
				
				System.out.print(columns);
			}
			
			for(int columns = 8; columns >= rows; columns--){
				System.out.print(columns);
				
				
			}
			
			System.out.println("");
		}
	
	

	}

}
