package number.problem.solution;

import java.util.ArrayList;

public class EmirpNumberClass {
	
	static boolean isPrime(int input) {
		int mid = (input / 2) +1;
		boolean flag=true;
		for(int i = 3; i<=mid; i++) {
			if(input % i == 0) {
				flag = false;
			} 
		}
		return flag;
	}
	
	static void emirpNumber(int input) {
		int temp = input;
		String revString = "";
		ArrayList<Integer> database = new ArrayList<Integer>();
		if(input % 2 == 0) {
			System.out.println("it is not prime number");
			
		} else {
			boolean prime = isPrime(input);
			if(prime) {
//				System.out.println("it is prime");
				while(temp > 0) {
					int last = temp % 10;
					database.add(last);
					temp = temp / 10;
				}
				if(database.size() > 0) {
					for(int v: database) {
						revString = revString+v;
					}
					int revData = Integer.parseInt(revString);
					boolean primeReverse = isPrime(revData);
					if(primeReverse) {
						System.out.println(input+" and "+revData+" are Emirp Number");
					} else {
						System.out.println(input+" and "+revData+" are not Emirp Number");
					}
				}
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emirpNumber(199);
		emirpNumber(23);

	}

}
