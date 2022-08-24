package array.problem.solution;

public class LargestElementWithPosition {
	static void LargestWithPos(int arr[], int position) {
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(position+" number largest value is "+arr[position-1]);
	}
	
	static void smallestWithPos(int arr[], int position) {
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(position+" number smallest value is "+arr[position-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={44,66,99,77,33,22,55}; 
		LargestWithPos(b, 3);
		LargestWithPos(b, 2);
		LargestWithPos(b, 1);
		
		smallestWithPos(b, 2);

	}

}
