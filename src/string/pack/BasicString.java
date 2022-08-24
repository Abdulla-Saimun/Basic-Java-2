package string.pack;

import java.util.Arrays;
import java.util.Collections;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		String first = "theQuickBrownFoxJumpsOverTheLazyDog";
		System.out.println(first.length());
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		System.out.println(ch);
		
		/*
		 * Java String class provides a lot of methods to perform operations on strings
		 * such as compare(), concat(), equals(), split(), length(), replace(),
		 * compareTo(), intern(), substring() etc.
		 */
		
		// declare strig in different way
		String s1 = "saimun";
		char chvalue[] = {'s', 't', 'r', 'i', 'n', 'g'};
		String s2 = new String(chvalue);
		String s3 = new String("hello bangladesh");
		System.out.println(s1+", "+s2+", "+s3);
		
		// string equal * return true or false
		String s4 = "saimun";
		String s5 = "Abdulla";
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));
		
		// using compareTo() method

		/*
		 * s1 == s2 : The method returns 0. s1 > s2 : The method returns a positive
		 * value. s1 < s2 : The method returns a negative value.
		 */
		
		String s6 = new String("saimun");
		String s7 = new String("Abdullah");
		System.out.println(s4 == s6);
		System.out.println(s4.compareTo(s6));
		
		// concat
		String newStringValue = String.format("%s %s", s6, s7);
		System.out.println(newStringValue);
		System.out.println(s6.concat(s7));
		
		String s8 = String.join(" ", s6, s7);
		System.out.println(s8);
		
		// substring
		System.out.println(s8.substring(0, 6));
		System.out.println(s8.substring(7));
		
		// split
		String fullName = "AbdullahAlSaimun";
		String sentenceArray[] = fullName.split("");
		System.out.println(Arrays.toString(sentenceArray));
		Collections.reverse(Arrays.asList(sentenceArray));
		System.out.println("reversed array is: "+ Arrays.toString(sentenceArray));
		
		// string built in method
		String player = "   Mushfiqur Rahman   ";
		System.out.println(player.toUpperCase());
		System.out.println(player.toLowerCase());
		String tr = player.trim(); // Musfiquer Rahman
		//trim remove first and last white space;
		System.out.println(tr);
		
		// startsWith and endsWith
		String playerTwo = "Tamim";
		System.out.println(playerTwo.startsWith("Ta")); // true
		System.out.println(playerTwo.endsWith("im")); // true
		
		// index of String
		
		String liton = "Liton";
		System.out.println(liton.charAt(2)); //t
		
		// length
		System.out.println(liton.length());
		
		int strCount = 0;
		for(char c: liton.toCharArray()) {
			strCount++;
		}
		
		System.out.println("Manual Length is "+strCount); // 5
		
		// repace
		
		String jav = "java is programming language. Java is a island. java is a platfor";
		System.out.println(jav.replace("java", "python")); // python is programming language. Java is a island. python is a platfor
		

		
		
		
		
		

	}

}
