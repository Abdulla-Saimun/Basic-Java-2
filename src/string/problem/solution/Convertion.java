package string.problem.solution;

public class Convertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// string to int
		String stringValue  = "463636";
		int integerValue = Integer.parseInt(stringValue);
		System.out.println(integerValue+10);
		
		// int to String
		int value = 5623623;
		String strval = Integer.toString(value);
		System.out.println(strval+10);
		String anex = String.valueOf(value);
		System.out.println(anex+49);

	}

}
