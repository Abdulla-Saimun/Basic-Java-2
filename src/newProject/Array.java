package newProject;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {35, 23, 232, 6, 12};
		int flag = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 232) {
				System.out.println("value found at: "+i);
				flag = 1;
			} 
		}
		
		if (flag == -1) {
			System.out.println("value not found");
		}
		
		// foreach
		for(int value: arr) {
			System.out.println(value);
		}

	}

}
