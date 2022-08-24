package tree;

public class stairCase {
	static int stairCasee(int n) {
		if(n <= 1) {
			return 1;
		}
		return stairCasee(n-1) + stairCasee(n-1);
	}
	public static void main(String[] args) {
		System.out.println(stairCasee(5));
	}

}
