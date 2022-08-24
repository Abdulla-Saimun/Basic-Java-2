package str.problem.solution;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Saimun";
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} 
			else if(Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("new string is: "+sb);
	}

}
