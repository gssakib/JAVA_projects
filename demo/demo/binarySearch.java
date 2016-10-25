package demo;
import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		int[] arry = {7,6,5,7,7,2,1};
		
	//int key = binary( arry, 11);
		//System.out.println(key);
	 System.out.print(Arrays.toString(selectionSort(arry)));
	}
	public static int binary(int[] arry, int num){
		
		int high = arry.length - 1;
		int low = 0;
		int mid = 0;
		while(high >= low){
			mid = (low + high) / 2;
			if(num < arry[mid]){
				high = mid -1;
				
			}else if(num > arry[mid]){
				low = mid + 1;
				
			}else{
				return mid;
			}
			
			
			
			
		}
		
		return (-mid -1);
		
	}
	public static int[] selectionSort(int[] arry){
		int currentMin = 0;
		int currentMinIndex = 0;
		for(int i =0; i<arry.length; i++){
			currentMin = arry[i];
			currentMinIndex = i;
			for(int j = i +1; j<arry.length; j++){
				if(currentMin > arry[j]){
					currentMin = arry[j];
					currentMinIndex = j;
				}
				
				
			}
			if(currentMinIndex != i){
				arry[currentMinIndex] = arry[i];
				arry[i] = currentMin;
				
			}
		}
		
		return arry;
	}


}
