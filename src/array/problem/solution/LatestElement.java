package array.problem.solution;

public class LatestElement {
	
	static void latestElm(int arr[]) {
		int pos = arr.length - 1;
		System.out.println(arr[pos]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6};
		latestElm(arr);

	}

}
