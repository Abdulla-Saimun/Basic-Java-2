package number.problem.solution;

public class OddEven {
	
	static void Even (int start, int finish) {
		System.out.print("Even: ");
		for(int i = start; i<=finish; i++) {
			if(i % 2 == 0) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
	}
	static void Odd (int start, int finish) {
		System.out.print("Odd: ");
		for(int i = start; i<=finish; i++) {
			if(i % 2 != 0) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even(10, 50);
		Odd(11, 51);
	}

}
