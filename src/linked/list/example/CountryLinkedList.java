package linked.list.example;

import java.util.LinkedList;

public class CountryLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> countryName = new LinkedList<>();
		countryName.add("Bangladesh");
		countryName.add("India");
		countryName.add("Sri lanka");
		countryName.addFirst("Myanmar");
		countryName.addLast("Nepal");

		
		System.out.println(countryName.getFirst());
		System.out.println(countryName.getLast());
		System.out.println(countryName.get(3));
		System.out.println("---------------------");
		for(int i = 0; i<countryName.size(); i++) {
			System.out.println(countryName.get(i));
		}
		System.out.println("_--------------------_");
		System.out.println(countryName);

	}

}
