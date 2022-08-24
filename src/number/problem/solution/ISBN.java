package number.problem.solution;

public class ISBN {
	static void isbnChecker(long number) {
		int sum = 0;
		boolean flag = false;
		long temp = number;
		String strNumber = ""+number;
		if(strNumber.length() != 10) {
			flag = false;
		} else {
			for(int i = 1; i<=strNumber.length(); i++) {
				int last = (int)(temp % 10);
				int mul = i * (int)last;
				sum = sum + mul;
				temp = temp / 10;
			}
			flag = true;
		}
		
		if(flag == true && sum % 11 == 0) {
			System.out.println("This number is legal ISBN");
		} else {
			System.out.println("This number is not legal isbn");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isbnChecker(8147852369L);
		isbnChecker(1259060977);
		isbnChecker(8175257660L);

	}

}
