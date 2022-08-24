package string.problem.solution;

public class CheckDoubleCharacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "loveeetlydol";
		int count;
		String chArray[] = str.split("");
		for(int i =0; i<chArray.length; i++) {
			count = 1;
			for(int j = i+1; j<chArray.length; j++) {
				if(chArray[i].equals(chArray[j]) && chArray[i] != "") {
					System.out.println(chArray[i]+" is multiple and found in "+j+" location");
				}
			}
		}

	}

}
