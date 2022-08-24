package matrix.problem.solution;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};  
		int c[][] = new int[3][3];
		int length = 3;
		// int length = a.length;
		for(int i = 0; i< length; i++) {
			for(int j = 0; j < length; j++ ) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
