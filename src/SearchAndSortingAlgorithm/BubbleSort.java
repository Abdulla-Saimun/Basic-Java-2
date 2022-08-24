package SearchAndSortingAlgorithm;

public class BubbleSort {
	
	static void bubbleSort(int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] ={3,60,35,2,45,320,100,21,5};  
		 
		 bubbleSort(arr);
		 for(int i = 0; i< arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
		

	}

}
