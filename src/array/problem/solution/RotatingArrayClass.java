package array.problem.solution;

public class RotatingArrayClass {
	static void rotatingArrayleft(int arr[], int n) {
		for(int i = 0; i< n; i++) {
			int j, first;
			first = arr[0];
			for(j = 0; j<arr.length - 1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void rotatingArrayRight(int arr[], int n) {
		for(int i = 0; i< n; i++) {
			int j, last;
			last = arr[arr.length - 1];
			for(j = arr.length -1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = last;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = new int [] {1, 2, 3, 4, 5};  
//        rotatingArrayleft(arr, 3);
        rotatingArrayRight(arr, 3);

	}

}
