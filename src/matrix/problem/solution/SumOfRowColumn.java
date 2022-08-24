package matrix.problem.solution;

public class SumOfRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] = {       
                 {1, 2, 3},    
                 {4, 5, 6},    
                 {7, 8, 9}    
             }; 
		 int row = a.length;
		 int cols = a[0].length;
		 int sumRow, sumCol;
		 
		 for(int i = 0; i<row; i++) {
			 sumRow = 0;
			 for(int j=0; j<cols; j++) {
				 sumRow = sumRow+a[i][j];
			 }
			 System.out.println("sum of "+ (i+1)+" row: "+sumRow);
		 }
		 for(int i = 0; i<row; i++) {
			 sumCol = 0;
			 for(int j=0; j<cols; j++) {
				 sumCol = sumCol+a[j][i];
			 }
			 System.out.println("sum of "+ (i+1)+" col: "+sumCol);
		 }
	}

}
