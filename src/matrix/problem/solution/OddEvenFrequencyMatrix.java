package matrix.problem.solution;

public class OddEvenFrequencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {       
                {4, 1, 3},    
                {3, 5, 7},    
                {8, 2, 6}    
            };  
		
		int row = a.length;
		int col = a[0].length;
		int evenCount = 0, oddCount = 0;
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j] % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("total even: "+evenCount+" and total odd: "+oddCount);

	}

}
