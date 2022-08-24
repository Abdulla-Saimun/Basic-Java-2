package SearchAndSortingAlgorithm;

public class InsertionSortExample {
	
	static void InsertionSort(int arr[]) {
		for(int j =1; j<arr.length; j++) {
			int key = arr[j];
			int i = j-1;
			while(i>-1 && (arr[i] > key)) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr1 = {9,14,3,2,43,11,58,22};    
		  InsertionSort(arr1);
		  for(int i: arr1) {
			  System.out.print(i+" ");
		  }

	}

}
