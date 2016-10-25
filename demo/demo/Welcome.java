package demo;
import java.util.Arrays;

import javax.swing.*;
public class Welcome {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(rotateRight(nums, 2) ));

	}
	public static int[] rotateRight(int[] nums, int n){
		for(int j =0; j<n;j++ ){
			int last = nums[nums.length -1];
			
			for(int i = nums.length ; i > 1; i--){
				nums[i-1] = nums[i-2];
			}
				nums[0] = last;
		
		
		
		}
		return nums;
	}
	
}
