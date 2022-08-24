package linked.list.example;

import java.util.LinkedList;

public class IntroOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(3);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(4);
		ll.add(4);
		ll.add(4);
		ll.add(44);
		ll.add(98);
		ll.add(12);
		
		// add with postion
		ll.add(4, 90);
		ll.addFirst(100);
		ll.addLast(900);
		
		
		// remove 
		ll.remove(3); // position
		ll.removeFirst();
		ll.removeLast();
		
		
		for(int i: ll) {
			System.out.println(i);
		}

	}

}
