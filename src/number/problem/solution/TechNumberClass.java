
/*A number is called a tech number if the given number has
an even number of digits and the number can be divided exactly
into two parts from the middle. After equally dividing the number, 
sum up the numbers and find the square of the sum. If we get the 
number itself as square, the given number is a tech number, else, 
not a tech number. For example, 3025 is a tech number.*/

package number.problem.solution;

public class TechNumberClass {
	
	static void techNumber(int n) {
		int firstHalf, secondHalf, digits = 0, squareOfSum = 0;
		int num = n;
		while (num > 0) {
			digits++;
			num = num/10;
		}
		if(digits % 2 == 0) {
			num = n;
			firstHalf = num % (int) Math.pow(10, digits/2);
			secondHalf = num / (int) Math.pow(10, digits/2);
			int sum = firstHalf + secondHalf;
			squareOfSum = sum*sum;
		}
		if(squareOfSum == n) {
			System.out.println("It is tech number");
		} else {
			System.out.println("it is not tech number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		techNumber(2025);
		techNumber(1312);
		techNumber(3025);

	}

}
