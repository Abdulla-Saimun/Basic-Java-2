package linked.list.basics;

public class RecursionFactorial {
	
	static int fact(int n) {
		if(n >=1 ) {
			return (n * fact(n-1));
		} else {
			return 1;
		}
	}
	
	static int fibonacci(int n) {
		if(n >= 3) {
			return fibonacci(n-1) + fibonacci(n-2);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(fact(0));
		System.out.println(fibonacci(3));
	}

}
