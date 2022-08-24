/*
Multiplying a number by two and three separately, the number 
obtained by writing the results obtained with the given number will be called a fascinating number. 
If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

In other words, we can also say that a number (n) may be a fascinating number 
if it satisfies the following two conditions:

    If the given number is a 3 or more than three-digit
    If the value getting after concatenation contains 
    all digits from 1 to 9, exactly once.*/


package number.problem.solution;

public class FascinatingNumberClalss {
	static void fascinatingNumber(int num) {
		int n2 = num*2;
		int n3 = num*3;
		String concatstr = num + "" + n2 + n3;  
		boolean found = true;  
		for(char c = '1'; c <= '9'; c++)  
		{  
		int count = 0;  
		for(int i = 0; i < concatstr.length(); i++)  
		{  
		char ch = concatstr.charAt(i);  
		if(ch == c)  
		count++;  
		}  
		if(count > 1 || count == 0)  
		{  
		found = false;  
		break;  
		}  
		}  
		if(found)  
		System.out.println(num + " is a fascinating number.");  
		else  
		System.out.println(num + " is not a fascinating number.");  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fascinatingNumber(327);

	}

}
