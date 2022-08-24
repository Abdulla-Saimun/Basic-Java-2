package str.problem.solution;

public class SmallestAndLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string = "Hardships often prepare ordinary people for an extraordinary destiny";
		 String word = "", small = "", large = "";
		 String words[] = new String[100];
		 int length = 0;
		 for(int i = 0; i <string.length(); i++) {
			 if(string.charAt(i) != ' ') {
				 word = word+string.charAt(i);
			 } else {
				 words[length] = word;
				 length++;
				 word="";
			 }
		 }
		 
		 small=large=words[0];
		 for(int j = 0; j<length; j++) {
			 if(small.length() > words[j].length()) {
				 small = words[j];
			 }
			 
			 if(large.length() < words[j].length()) {
				 large = words[j];
			 }
		 }
		 
		 System.out.println("smallest word: "+small);
		 System.out.println("largest word: "+large);

	}

}
