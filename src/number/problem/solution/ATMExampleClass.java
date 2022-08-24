package number.problem.solution;

import java.util.Scanner;

public class ATMExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 1000000, withdraw, deposit;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Automated teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("chosse 2 for deposit");
			System.out.println("choose 3 for check balance");
			System.out.println("Choose 4 for exit");
			System.out.print("chosse the operation you want to perform: ");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter the money to be withdrawn: ");
				withdraw = sc.nextInt();
				if(balance > withdraw) {
					balance = balance - withdraw;
					System.out.println("please collec your money");
				} else {
					System.out.println("Insufficent balance");
				}
				System.out.println("");
				
			} 
			case 2: {
				System.out.print("Enter the money to be deposited: ");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your money deposited");
				System.out.println("");
			}
			case 3: {
				System.out.println("Your current balance is "+balance);
				System.out.println();
			} 
			case 4: {
				System.exit(0);
			}
			}
			
			}

	}

}
