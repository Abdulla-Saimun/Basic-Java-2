package stringBuffer.pack;

public class ReverseEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringFormatter.reverseFormatter("hello bangladesh"));
		System.out.println(StringFormatter.reverseFormatter("the quick brown fox jumps over the lazy dog"));
		

	}

}


class StringFormatter {
	public static String reverseFormatter (String str) {
		String spitArray[] = str.split("\\s");
		String reverseWord = "";
		for(String w: spitArray) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord + sb.toString()+" ";
		}
		return reverseWord.trim();
	}
}