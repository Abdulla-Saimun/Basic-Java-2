package array.problem.solution;

public class EvenPositionClass {
	
	static void oddPosition(int arr[]) {
		for(int i = 0; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	static void EvenPosition(int arr[]) {
		for(int i = 1; i< arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6};
		
		EvenPosition(arr);
		oddPosition(arr);
	}

}
