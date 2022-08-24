package number.problem.solution;

import java.util.ArrayList;

public class AutobiographicalNumber {
	static void autobiographicalNumber(int data) {
		int temp = data;
		int quantity = 0;
		ArrayList<Integer>database = new ArrayList<Integer>();
		while(temp > 0) {
			int last = temp % 10;
			database.add(last);
			quantity++;
			temp = temp / 10;
		}
		int sum = 0;
		for(int i: database) {
			sum = sum + i;
		}
		if(sum == quantity) {
			System.out.println(data+" is Autobiographical Number");
		} else {
			System.out.println(data+" is not Autobiographical Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		autobiographicalNumber(21200);
		autobiographicalNumber(212075470);
		autobiographicalNumber(3211000);

	}

}
