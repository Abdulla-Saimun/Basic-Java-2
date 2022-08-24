package number.problem.solution;

public class SmallestOfThreeClass {
	
	static void smallestOne(int a, int b, int c) {
		int temp = a < b ? a : b;
		int finalvalue = temp < c ? temp : c;
		System.out.println(finalvalue);
	}
	
	static void largestNumber(int a, int b, int c) {
		int temp = a > b ? a : b;
		int finalvalue = temp > c ? temp : c;
		System.out.println(finalvalue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallestOne(12, 2, 1);
		largestNumber(12, 2, 456);
	}

}
