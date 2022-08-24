package basic.programmin;

import java.util.ArrayList;


public class greater {
	static boolean isUpto(int arr[], int k) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == k) {
					return true;
				} 
				
			}
			
		}
		return false;
	}
	
	static boolean bigONotation(int arr[], int k) {
		if(arr.length == 0) {
			return false;
		}
		
		ArrayList<Integer> diff_list = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			int difference = k - arr[i];
			if(diff_list.contains(arr[i])) {
				return true;
			} 
			diff_list.add(difference);
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = {10, 15, 3, 7};
		int k = 17;
		
//		System.out.println(isUpto(list, k));
		System.out.println(bigONotation(list, k));

	}

}
