package Video11;

import java.util.ArrayList;

public class OddArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		int odd=0;
		al.add(40);
		al.add(52);
		al.add(15);
		al.add(38);
		al.add(21);
		al.add(76);
		al.add(63);
		for(Object i:al) {
			if((int)i%2==1) {
				odd++;
				System.out.println(i);
			}	
		}
		System.out.println("Number of even numbers are : "+odd);
	}
}