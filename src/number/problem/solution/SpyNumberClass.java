package number.problem.solution;

import java.util.ArrayList;

public class SpyNumberClass {
	static void spyNumber(int input) {
		ArrayList<Integer> database = new ArrayList<Integer>();
		int temp = input;
		while(temp > 0) {
			int last = temp % 10;
			database.add(last);
			temp = temp/10;
		}
		int sum = 0, product = 1;
		for(int e: database) {
			sum = sum+e;
		}
		for(int e: database) {
			product = product*e;
		}
		if(sum == product) {
			System.out.println(input+" is spy number");
		} else {
			System.out.println(input+" is not spy number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spyNumber(132);
		spyNumber(217);

	}

}
