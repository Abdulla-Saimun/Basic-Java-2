package number.problem.solution;

public class FindGDC {
	static int findGDCMethod(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return findGDCMethod(b, a%b);
		}
	}
	static void GDCUsingForLoop(int a, int b) {
		int gcd = 1;
		for(int i = 1; i<=a && i<=b; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gdc = findGDCMethod(54, 24);
		System.out.println(gdc);
		
		GDCUsingForLoop(12, 8);

	}

}
