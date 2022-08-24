package basic.programmin;

public class Pattern {
	static void backSlash(int row) {
		for(int i = 1; i<=row; i++) {
			for(int j = i ; j>1; j--) {
				System.out.print(" ");
			} 
			for(int k = 1; k<=i; k++) {
				System.out.print("* ");
				break;
			}
			System.out.println();
		}
		
	}
	
	static void slashPattern(int row) {
		for(int i = 1; i<=row; i++) {
			for(int j = row; j> i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("* ");
				break;
			}
			System.out.println();
		}
	}
	
	static void xStar(int n) {
		int k = n*2 - 1;
		for(int i = 1; i<=k; i++) {
			for(int j = 1; j <=k; j++) {
				if(j==i || j==k-i+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void pyramid(int row) {
		for(int i=0; i<row; i++) {
			for(int j = row-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void diamondPattern(int row) {
		int i, j, space = 1;
		space = row - 1;
		for(j = 1; j <= row; j++) {
			for(i=1; i<=space; i++) {
				System.out.print(" ");
			}
			space--;
			for(i = 1; i <= 2*j-1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for(j = 1; j < row -1; j++) {
			for(i = 1; i<=space; i++) {
				System.out.print(" ");
			}
			space++;
			for(i = 1; i<=2*(row-j)-1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void patterOne(int row) {
		int i, j, number;
		for(i = 0; i< row; i++) {
			number = 1;
			for(j=0; j<=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		for(i = row-1; i>0; i--) {
			number = 1;
			for(j = 0; j<i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
	
	static void patterTwo(int row) {
		for(int i = 0; i< row; i++) {
			int number = 1;
			System.out.printf("%"+(row-i)*2+"s","");
			for(int j = 0; j<=i; j++) {
				System.out.printf("%4d", number);
				number = number * (i-j)/(j+1);
			}
			System.out.println();
		}
	}
	
	static void patternThree(int row) {
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
	
	static void triangleCharacterPattern(int row) {
		for(int i = 0; i<=8; i++) {
			int alphabet = 65;
			for(int j=row; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print((char)(alphabet+k)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		backSlash(7);
//		slashPattern(7);
//		xStar(5);
//		pyramid(10);
//		diamondPattern(8);
//		patterOne(8);
//		patterTwo(10);
//		patternThree(8);
		triangleCharacterPattern(8);
		System.out.println();
		System.out.println((char)(71));
		char a = 'a';
		int x = a;
		System.out.println(x);
		
	}

}
