package Video11;

import java.util.ArrayList;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		System.out.println(al);
		for(Object i:al) {
			System.out.println(i);
		}
		System.out.println("============================================");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}