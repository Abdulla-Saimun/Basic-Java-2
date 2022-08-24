package str.problem.solution;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Dream big";
		String revStr = "";
		for(int i = str.length() - 1; i>=0; i--) {
			revStr = revStr+str.charAt(i);
		}
		
		System.out.println(revStr);
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}

}
