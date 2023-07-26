package Video14;

import java.util.ArrayList;

public class ArrayListMethodsDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(70);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.add(1,30);
		al.add(2,60);
		System.out.println(al);
		al.remove(4);
		al.remove(0);
		System.out.println(al);
		al.set(0, 10);
		al.set(2, 30);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.size());
		ArrayList al1=new ArrayList();
		al1.add(98);
		al1.add(43);
		al1.add(23);
		al1.add(45);
		al.addAll(al1);
		System.out.println(al);
		al.addAll(2, al1);
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
	}
}