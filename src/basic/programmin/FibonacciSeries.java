package basic.programmin;

public class FibonacciSeries {
	static int n1 =0, n2 = 1, n3 = 0;
	
	static void fibonacci(int count) {
		if(count > 0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			fibonacci(count-1);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1000;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" "+n2);
		fibonacci(count-2);
		
		

	}

}
