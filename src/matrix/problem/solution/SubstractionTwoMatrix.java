package matrix.problem.solution;

public class SubstractionTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] = {  
                 {4, 5, 6},  
                 {3, 4, 1},  
                 {1, 2, 3}  
              };  

		 int b[][] = {  
		                 {2, 0, 3},  
		                {2, 3, 1},  
		                {1, 1, 1}  
		            };  
		 
		 int diff[][] = new int[3][3];
		
		 int row = a.length;
		 int col = a[0].length;
		 
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				 diff[i][j] = a[i][j] - b[i][j];
				 System.out.print(diff[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
	}

}
