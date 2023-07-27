package Video24;

import java.util.ArrayList;

public class AddTwoCollections {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		System.out.println(al1);
		ArrayList al2=new ArrayList(al1);
		al2.add(5);
		al2.add(6);
		al2.add(7);
		System.out.println(al2);
		ArrayList al3=new ArrayList();
		al3.add(al2);
		al3.add(8);
		al3.add(9);
		System.out.println(al3);
	}
}