package basic.programmin;

import java.util.Scanner;
// it can receive both string and integer
public class PalidromeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value to check palindrome: ");
		String input = sc.next();
		
		String reverse = "";
		int length = input.length()	;
		sc.close();
		for(int i = length-1; i>=0; i --) {
			reverse += input.charAt(i);
		}
		
		if (input.equals(reverse)) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
		
	}

}
