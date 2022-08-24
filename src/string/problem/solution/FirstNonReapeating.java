package string.problem.solution;

public class FirstNonReapeating {
	
	static void One() {
		String inputStr = "teaerter";
		for(char i: inputStr.toCharArray()) {
			/*
			 * System.out.println(inputStr.indexOf(i));
			 * System.out.println(inputStr.lastIndexOf(i)); System.out.println("------");
			 */
			if(inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("first non repeating character is: "+i);
				break;
			}
		}
	}
	
	static void two(String inp) {
		System.out.println("string value is "+inp);
		for(int i =0; i < inp.length(); i++) {
			boolean unique = true;
			for(int j = 0; j < inp.length(); j++) {
				if(i != j && inp.charAt(i) == inp.charAt(j)) {
					unique = false;
				}
			}
			
			if(unique) {
				System.out.println("first non repeated character is: "+inp.charAt(i)+" and location is "+i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two("teeter");
		

	}

}
