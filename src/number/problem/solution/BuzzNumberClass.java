// n simple words, a number is said to be Buzz if it ends with 7 or is divisible by 7.
package number.problem.solution;

public class BuzzNumberClass {
	static void buzzNumber(int input) {
		int temp = input;
		if(input % 7 == 0) {
			System.out.println("it is buzzNumber");
		} else if (input > 0) {
			int last = temp % 10;
			if(last == 7) {
				System.out.println("it is buzz number");
			} else {
				System.out.println("it is not buzz number");
			}
		}
	}
	
	static boolean isBuzzNumber(int data) {
		if(data % 10 == 7 || data % 7 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buzzNumber(107);
		buzzNumber(49);
		buzzNumber(4572);
		System.out.println(isBuzzNumber(107));
		System.out.println(isBuzzNumber(56));

	}

}
