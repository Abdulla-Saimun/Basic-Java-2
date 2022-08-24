package str.problem.solution;

public class TotalCharacter {
	static void totalNumberOfCharacter(String input) {
		int count = 0;
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "The best of both worlds";
		totalNumberOfCharacter(string);
		
		

	}

}
