package string.problem.solution;

public class RemoveParticularCharacter {
	
	public static String CharRemoveAt(String str, int p) {
		return str.substring(0, p) + str.substring(p+1);
	}
	
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(CharRemoveAt(str, 7));
	}

}
