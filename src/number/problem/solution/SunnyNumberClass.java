package number.problem.solution;
import java.util.*;

public class SunnyNumberClass {
	static boolean sunnyNumber(double input) {
		boolean flag = false;
		double newNumber = input + 1;
		double sqrt = Math.sqrt(newNumber);
		if((sqrt - Math.floor(sqrt) == 0)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(sunnyNumber(80)) {
			System.out.println("it is sunny");
		} else {
			System.out.println("it is not sunny");
		}
		
		if(sunnyNumber(670)) {
			System.out.println("it is sunny");
		} else {
			System.out.println("it is not sunny");
		}
		

	}

}
