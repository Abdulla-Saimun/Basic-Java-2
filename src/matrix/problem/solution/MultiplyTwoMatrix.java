package matrix.problem.solution;

public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1, 3, 2},{3, 1, 1}, {1, 2, 2}};
		int b[][] = {{2, 1, 1},{1, 0, 1}, {1, 3, 1}};
		
		int c[][] = new int[3][3];
		int length = 3;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j< length; j++) {
				c[i][j] = 0;
				for(int k = 0; k<length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
