package Video10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(40);
		al.add(10);
		al.add(50);
		al.add(30);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
}