package basic.programmin;
import java.util.Scanner;
import java.lang.Math;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// generate number 1 to 10
		int max = 400, min = 200;
		System.out.println(Math.random()*(max - min + 1)+min);
		
		int getInt = (int)(Math.random()*(max - min +1)+min);
		System.out.println(getInt);
	}

}
