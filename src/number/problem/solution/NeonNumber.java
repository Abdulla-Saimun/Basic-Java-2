package number.problem.solution;

import java.util.ArrayList;
import java.util.Collections;

public class NeonNumber {
	static void isNeon(int input) {
		int temp = input;
		int square = input*input;
		ArrayList<Integer> database = new ArrayList<Integer>();
		while(square > 0) {
			int lastValue = square % 10;
			database.add(lastValue);
			square = square / 10;
		}
		Collections.reverse(database);
		System.out.println(database.toString());
		int count = 0;
		for(int e: database) {
			count = count+e;
		}
		if(input == count) {
			System.out.println(input+" is neonNumber");
		} else {
			System.out.println(input+" is not neonNumber");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isNeon(9);
	}

}
