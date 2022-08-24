package array.problem.solution;

public class SumAndProduct {
	
	static void sum(int arr[]) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum: "+sum);
	}
	
	static void product(int arr[]) {
		int product = 1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				product = product * arr[i];
			}
		}
		System.out.println("Product: "+product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 11, 7, 75, 56};
		
		sum(arr);
		product(arr);
	}

}
