//The Evil number is another special positive 
//whole number in Java that has an even number of 
//1's in its binary equivalent

package number.problem.solution;

public class EvilNumberClass {
	
	static void evilNumberCheck(int input) {
		long binaryNumber = convertToBinary(input);
		int count = 0;
		while(binaryNumber != 0) {
			if(binaryNumber % 10 == 1) {
				count++;
			}
			binaryNumber = binaryNumber / 10;
		}
		if(count % 2 == 0) {
			System.out.println("it is evil number");
		} else {
			System.out.println("it is not evil number");
		}
		
		
	}
	
	static long convertToBinary(int number) {
		long binaryNumber = 0;
		int rem = 0;
		int j = 1;
		
		while(number != 0) {
			rem = number % 2;
			binaryNumber += rem*j;
			number = number/2;
			j = j*10;
		}
		return binaryNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evilNumberCheck(15);
		evilNumberCheck(16);
		evilNumberCheck(23);
	}

}
