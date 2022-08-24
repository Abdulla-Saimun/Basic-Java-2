package array.problem.solution;

public class LargestAndSmallestElement {
	
	static void largestElement(int arr[]) {
		int largest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] >= largest) {
				largest = arr[i];
			}
		}
		System.out.println("largest value: "+largest);
	}
	static void smallestElement(int arr[]) {
		int smallest = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] <= smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest value: "+smallest);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 11, 7, 75, 56};
		largestElement(arr);
		smallestElement(arr);

	}

}
