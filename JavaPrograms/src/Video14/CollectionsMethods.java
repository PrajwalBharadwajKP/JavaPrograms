package Video14;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(30);
		al.add(78);
		al.add(23);
		al.add(56);
		al.add(28);
		al.add(73);
		al.add(22);
		al.add(98);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
	}
}