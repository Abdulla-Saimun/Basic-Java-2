package newProject;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("hello"); Scanner sc = new Scanner(System.in);
		 * System.out.println("enter first value:"); int newValue = sc.nextInt();
		 * System.out.println("enter second value:"); int secondValue = sc.nextInt();
		 * System.out.println(newValue + secondValue); System.out.println("hey there");
		 */
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		if(name.contains("saimun")) {
			System.out.println("saimun exists");
		} else {
			System.out.println("saimun do not exist");
		}
		
		sc.close();
		

	}

}
