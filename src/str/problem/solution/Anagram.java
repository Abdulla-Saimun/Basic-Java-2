package str.problem.solution;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// different word but same character is called anagram;
		String str1 = "Brag";
		String str2 = "Grab";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()) {
			System.out.println("It is not anagram");
		} else {
			char stringOne[] = str1.toCharArray();
			char stringTwo[] = str2.toCharArray();
			Arrays.sort(stringOne);
			Arrays.sort(stringTwo);
			
			if(Arrays.equals(stringOne, stringTwo)) {
				System.out.println("Both are anagram");
			} else {
				System.out.println("Both string are not anagram");
			}
		}

	}

}
