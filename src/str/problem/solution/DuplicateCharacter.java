package str.problem.solution;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Great Responsibility";
		int count;
		
		char string[] = string1.toCharArray();
		
		for(int i = 0; i<string.length; i++) {
			count = 1;
			for(int j = i+1; j<string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0') {
				System.out.println(string[i]);
			}
		}
		
		

	}

}
