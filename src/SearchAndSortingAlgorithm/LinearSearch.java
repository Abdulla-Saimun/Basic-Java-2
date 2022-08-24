package SearchAndSortingAlgorithm;

public class LinearSearch {
	static void linearSearch(int arr[], int search) {
		boolean flag = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == search) {
				System.out.println(search+" found at location "+i);
				flag = true;
				break;
			} 
		}
		if(flag == false) {
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {10,20,30,50,70,90};    
        int key = 50;   
        linearSearch(a1, key);
        
        
	}

}
