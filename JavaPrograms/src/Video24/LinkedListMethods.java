package Video24;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(33);
		ll.add(76);
		ll.add(87);
		ll.add(56);
		ll.add(45);
		ll.add(23);
		ll.add(89);
		ll.add(99);
		ll.add(55);
		ll.add(22);
		ll.add(11);
		ll.add(88);
		System.out.println(ll);
		ll.addFirst(15);
		System.out.println(ll);
		ll.addLast(77);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
	}

}
