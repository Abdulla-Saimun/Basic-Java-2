package str.problem.solution;

public class SeparateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = "CHARACTERS";
		String newCh = "";
		for(int i = 0; i<ch.length(); i++) {
//			System.out.print(ch.charAt(i)+" ");
			newCh = newCh + ch.charAt(i)+" ";
		}
		System.out.println(newCh);

	}

}
