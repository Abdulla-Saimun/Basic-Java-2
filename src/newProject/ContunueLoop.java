package newProject;

import java.util.Scanner;

public class ContunueLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int count = 0;
		while(true) {
			System.out.print("enter value: ");
			input = sc.nextInt();
			if(input == 100) {
				System.out.println("system shut down");
				break;
			} else {
				count++;
			}
			
		}
		
		System.out.println("you tried "+ count +" times");
		sc.close();
	}

}
