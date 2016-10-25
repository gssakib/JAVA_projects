package demo;


public class SortAndSearch {

	public static void main(String[] args) {
		int[] arry = {3,55,78,3,2,6,-778};
		System.out.println((sortSearch(arry, 6)));
	}
	public static int sortSearch(int[] arry,int num){
		return binarySearch.binary(binarySearch.selectionSort(arry), num);
		
	}

}
