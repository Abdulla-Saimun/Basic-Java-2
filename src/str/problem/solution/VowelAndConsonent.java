package str.problem.solution;

public class VowelAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vCount = 0;
		int cCount = 0;
		String str = "This is a really simple sentence";   
		str = str.toLowerCase();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				vCount++;
			} else if(str.charAt(i) > 'a' && str.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("total vowel: "+vCount+" and total consonant: "+cCount);

	}

}
