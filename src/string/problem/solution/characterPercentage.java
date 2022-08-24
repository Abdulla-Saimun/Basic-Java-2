package string.problem.solution;

public class characterPercentage {
	
	 static void charPercentage(String str) {
		 int length = str.length();
		 int upperCase = 0;
		 int lowerCase = 0;
		 int digit = 0;
		 int others = 0;
		 
		 for (int i = 0; i<str.length(); i++) {
			 char ch = str.charAt(i);
			 if(Character.isUpperCase(ch)) {
				 upperCase++;
			 }
			 else if(Character.isLowerCase(ch)) {
				 lowerCase++;
			 }
			 else if (Character.isDigit(ch)) {
				 digit++;
			 }
			 else {
				 others++;
			 }
		 }
		 
		 System.out.println("length is: "+length+", uppercase: "+upperCase+", lowercase: "+ lowerCase+", digit: "+digit+", others: "+others);
		 
	 }
	public static void main(String[] args) {
		charPercentage("This is Saimun and my roll in 1921 %");
		
	}

}
