package number.problem.solution;

public class SwapTwoNumberBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 45;
		
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a+", "+b);

	}

}
