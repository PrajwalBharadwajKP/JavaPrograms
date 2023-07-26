package Video18;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListToTreeSet {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(234);
		al.add(567);
		al.add(345);
		al.add(867);
		al.add(632);
		al.add(865);
		al.add(596);
		al.add(356);
		al.add(256);
		System.out.println(al);
		TreeSet ts=new TreeSet(al);
		System.out.println(ts);
	}
}