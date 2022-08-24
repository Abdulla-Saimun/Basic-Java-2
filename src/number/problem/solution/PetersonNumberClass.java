// A number is said to be Peterson if the sum of 
// factorials of each digit is equal to the sum of the number itself.
package number.problem.solution;

public class PetersonNumberClass {
	
	static boolean isPeterson(int input) {
		int temp = input;
		int sum = 0;
		boolean flag = false;
		while(input > 0) {
			int lastdigit = input%10;
			int factorialValue = factorial(lastdigit);
			sum = sum + factorialValue;
			input = input/10;
		}
		if(sum == temp) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	static int factorial(int value) {
		int fact = 1;
		for(int i = value; i>=1; i--) {
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPeterson(145)) {
			System.out.println("it is peterson number");
		} else {
			System.out.println("it is not peterson number");
		}
		
		if(isPeterson(773)) {
			System.out.println("it is peterson number");
		} else {
			System.out.println("it is not peterson number");
		}

	}

}
