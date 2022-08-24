package string.problem.solution;

import java.util.Arrays;

public class AnagramString {
	
	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		} else {
			char arrayS1[] = s1.toLowerCase().toCharArray();
			char arrays2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrays2);
			status = Arrays.equals(arrayS1, arrays2);
		}
		if(status) {
			System.out.println(s1 +" and "+ s2 +" are anagram");
		} else {
			System.out.println(s1 +" and "+ s2 +" are not anagram");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// anagram means have same character set
		isAnagram("keep", "peek");
		isAnagram("rahime", "karim");
		

	}

}
