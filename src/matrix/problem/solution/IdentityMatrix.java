package matrix.problem.solution;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[][] = {       
                  {1, 0, 0},    
                  {0, 1, 0},    
                  {0, 0, 1}    
              };   
		  int rows =a.length;
		  int cols = a[0].length;
		  boolean flag = true;
		  if(rows != cols) {
			  System.out.println("Matrix should be squeare Matrix");
		  } else {
			  for(int i = 0; i< rows; i++) {
				  for(int j = 0; j<cols; j++) {
					  if(i==j && a[i][j] != 1) {
						  flag = false;
						  break;
					  } 
					  if(i != j && a[i][j] != 0) {
						  flag = false;
						  break;
					  }
				  }
			  }
		  }
		  
		  if(flag) {
			  System.out.println("Given matrix is an identity matrix");
		  } else {
			  System.out.println("Given matrix is not an identity matrix");
		  }

	}

}
