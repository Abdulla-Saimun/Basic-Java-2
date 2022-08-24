// if most of the element in matrix are 0 then it called sparse matrix;
// to find it we need to count 0 and divided by 2;
// if greater than half it called sparse matrix;
package matrix.problem.solution;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] = {       
                 {4, 0, 0},    
                 {0, 5, 0},    
                 {0, 0, 6}    
             };  
		 int count = 0;
		 
		 for(int i = 0; i<a.length; i++) {
			 for(int j = 0; j<a[0].length; j++) {
				 if(a[i][j] == 0) {
					 count++;
				 }
			 }
		 }
		 
		 int totalElement = a.length * a[0].length;
		 int elementHalf = totalElement/2;
		 if(count > elementHalf) {
			 System.out.println("It is sparse matrix");
		 } else {
			 System.out.println("it is not sparse matrix");
		 }
	}

}
