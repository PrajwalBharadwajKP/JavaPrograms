package Video3;

import java.util.LinkedList;

public class PalindromeInLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		LinkedList<String> ll1=new LinkedList<String>();
		ll.add("rat");
		ll.add("bat");
		ll.add("cat");
		ll.add("bat");
		ll.add("rat");
		for(int i=ll.size()-1;i>=0;i--) {
			String e=ll.get(i);
			ll1.add(e);
		}
		if(ll.equals(ll1))
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	}
}