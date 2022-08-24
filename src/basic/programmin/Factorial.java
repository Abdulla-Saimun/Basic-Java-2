package basic.programmin;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		int newData=1;
		for(int i = value; i>=1; i--) {
			newData = newData*i;
		}
		System.out.println(newData);

	}

}
