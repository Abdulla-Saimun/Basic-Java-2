package str.problem.solution;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kayak";
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		if(sb.toString().equals(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
