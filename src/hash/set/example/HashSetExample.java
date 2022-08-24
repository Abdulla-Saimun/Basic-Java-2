package hash.set.example;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> country = new HashSet<>();
		country.add("Bangladesh");
		country.add("USA");
		country.add("UK");
		country.add("Canada");
		country.add("France");
		country.add("Bangladesh");
		System.out.println(country);
		System.out.println(country.contains("UKa"));
		System.out.println("------------");
		for(String b: country) {
			System.out.println(b);
		}

	}

}
