package number.problem.solution;

public class ReverseNumber {
	
	static void reverseOne(int input) {
		int reverse = 0;
		while(input != 0) {
			int reminder = input % 10;
			reverse = reverse * 10 + reminder;
			input = input/10;
		}
		System.out.println(reverse);
		
	}
	
	public static void main(String[] args) {
		reverseOne(125);
		
		
	}

}
