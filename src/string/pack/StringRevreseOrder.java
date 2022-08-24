package string.pack;

public class StringRevreseOrder {
	public static void main(String[] args) {
		int i;
		String name = "saimun";
		int length = name.length();
		StringBuilder dest = new StringBuilder(length);
		
		for(i = length-1; i>=0; i--) {
			dest.append(name.charAt(i));
		}
		
		System.out.println(dest.toString());
		
		
		// another way
		String fullName = "Abdulla Al Saimun";
		String reverse = new StringBuffer(fullName).reverse().toString();
		System.out.println(reverse);
		
		// traditional way
		String strr = "Brownfox";
		String result = "";
		for(int j = strr.length()-1; j>=0; j--) {
			result = result + strr.charAt(j);
		}
		System.out.println(result);
	}
	

}
