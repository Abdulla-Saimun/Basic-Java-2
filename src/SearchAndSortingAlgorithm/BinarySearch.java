package SearchAndSortingAlgorithm;

import java.util.Arrays;

public class BinarySearch {
	static void binarySearchAlgo(int arr[], int data, int low, int high) {
		
		if(high >= low) {

			int mid = (low + high) /2;
			if(arr[mid] == data) {
				System.out.println(data+" found");
			} else if(data > arr[mid]) {
				binarySearchAlgo(arr, data, mid+1, high);
			} else if(data < arr[mid]) {
				binarySearchAlgo(arr, data, low, mid-1);
			} 
		} else {
			System.out.println("data not found");
		}
	}
	
	static void binaryBuiltIn(int arr[], int key) {
		int result = Arrays.binarySearch(arr, key);
		if(result > 0) {
			System.out.println("element found at index: "+result);
		} else {
			System.out.println("data not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {34, 52, 1, 33, 5, 74, 12, 6};
		Arrays.sort(arr);
		int search = 333;
		binarySearchAlgo(arr, search, 0, arr.length-1);
		
		binaryBuiltIn(arr, search);
		

	}

}
