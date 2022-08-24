package basic.programmin;

public class PatternOne {
	
	class LeftTriganglePatter1 {
		static void drawTriangle() {
			for(int i = 0; i< 4; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
	
	class RightTrianglePattern {
		static void rightTriangle(int row) {
			for(int i = 0; i<row; i++) {
				for(int j = 2*(row-i); j>=0; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		static void downwardTriangle(int row) {
			for(int i = row ; i>=0; i--) {
				for( int j = 0; j < i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	}
	
	class pyramidPatter {
		static void pyramidBottom(int row) {
			for(int i = 0; i<row; i++) {
				for(int j = row-i; j>1; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LeftTriganglePatter1.drawTriangle();
		
//		RightTrianglePattern.rightTriangle(6);
		
//		pyramidPatter.pyramidBottom(6);
		RightTrianglePattern.downwardTriangle(7);

	}

}
