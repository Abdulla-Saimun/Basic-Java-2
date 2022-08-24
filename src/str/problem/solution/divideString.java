package str.problem.solution;

public class divideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbbbcccc";
		int part = 3;
		int length = str.length();
		int temp = 0;
		int chars = length/part;
		String equalArray[] = new String[part];
		if(length % part != 0) {
			System.out.println("this string can not divided into equals");
		} else {
			for(int i = 0; i<length; i=i+chars) {
				String dive = str.substring(i, i+chars);
				equalArray[temp] = dive;
				temp++;
			}
		}
		for(int i =0; i<equalArray.length; i++) {
			System.out.println(equalArray[i]);
		}

	}

}
