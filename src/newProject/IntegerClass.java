package newProject;

public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstValue = 235252;
		int secondvalue = 6231;
		System.out.println("firstValue is "+firstValue+", and second is "+secondvalue);
		// int array
		int firstArray[] = {234, 632, 22, 62, 2};
		for(int value: firstArray) {
			System.out.println(value);
		}
		
		// string to number
		
		String numberString = "4523";
		int StringToNumber = Integer.parseInt(numberString);
		System.out.println(StringToNumber);
		
		// number to string
		
		int newNumber = 3434626;
		String stnumber = Integer.toString(newNumber);
		System.out.println(stnumber);
		System.out.println(((Object)stnumber).getClass().getSimpleName());
		System.out.println(((Object)StringToNumber).getClass().getSimpleName());
		
		// compare to
		// if return 0 then equal
		
		Integer one = 32;
		int two = 32;
		int three = 10;
		int four = 40;
		System.out.println(one.compareTo(two));//0
		System.out.println(one.compareTo(three));//1
		System.out.println(one.compareTo(four));//-1
		
		//equals()
		
		int x = 5;
		Integer ab = x;
		System.out.println(ab.equals(8));
		
		System.out.println(Math.max(345, 345));
		
		

	}

}
