package matrix.problem.solution;

public class ConvertRowToColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {    
                {1, 2, 3},    
                {4, 5, 6},    
                {7, 8, 9}    
             };  
		int row = a.length;
		int col = a[0].length;
		
		int t[][] = new int[col][row];
		
		for(int i = 0; i<col; i++) {
			for(int j = 0; j<row; j++) {
				t[i][j] = a[j] [i];
			}
		}
		
		for(int i = 0; i<col; i++) {
			for(int j = 0; j<row; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}

}
