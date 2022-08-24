package number.problem.solution;

public class SquareRoot {
	static void squareRootManually(int input) {
		double t;
		double sqrtroot = input / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t+(input/t))/2;
		} while((t - sqrtroot) != 0);
		
		System.out.println(sqrtroot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareRootManually(81);
		squareRootManually(12);
		
	}

}
