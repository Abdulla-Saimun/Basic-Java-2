package basic.programmin;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean checkPrime(int value) {
		int m=0;
		boolean flag=true;
		m = value/2;
		if(value == 0 || value == 1) {
			flag = false;
			
		} else {
			for(int i =2; i<=m; i++) {
				if(value%i == 0) {
					flag = false;
					break;
				} 
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data: ");
		int data = sc.nextInt();
		sc.close();
		boolean isPrime = checkPrime(data);
		if(isPrime) {
			System.out.println(data+" is prime number");
		} else {
			System.out.println(data+ " is not prime number");
		}

	}

}
