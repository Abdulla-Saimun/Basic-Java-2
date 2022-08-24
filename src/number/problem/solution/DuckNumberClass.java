/*Duck number is another special positive non-zero number 
that contains zero in it. The digit zero should not 
be presented at the starting of the number. Zero can be 
present at any of the positions except the beginning of the number.
*/
package number.problem.solution;

public class DuckNumberClass {
	
	static boolean checkDuck(int number) {
		while(number != 0) {
			if(number % 10 == 0) {
				return true;
			}
			number = number / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkDuck(Integer.parseInt("001254")));
		System.out.println(checkDuck(340240));

	}

}
