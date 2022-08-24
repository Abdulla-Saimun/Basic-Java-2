
// 25*25 = 625 is automorphic number because 625 hold 25 in the last
// 23*23 = 529 is not automorphic number;
package number.problem.solution;

public class AutoMorphicNumber {
	static void automorphic(int input) {
		int square = input*input;
		while(input > 0) {
			if(input % 10 != square % 10) {
				System.out.println("it is not automorphic number");
				return;
			} 
			input = input/10;
			square = square/10;
		}
		System.out.println(input+" is automorphic number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automorphic(25);
		automorphic(23);

	}

}
