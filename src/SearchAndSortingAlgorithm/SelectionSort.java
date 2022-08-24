package SearchAndSortingAlgorithm;

public class SelectionSort {
	static void selctionSorting(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			int index = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallestNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallestNumber;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        selctionSorting(arr1);
        System.out.println("sorted array");
        for(int i = 0; i<arr1.length; i++) {
        	System.out.print(arr1[i]+" ");
        }
	}

}
