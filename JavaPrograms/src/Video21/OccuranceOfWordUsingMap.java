package Video21;

import java.util.HashMap;

public class OccuranceOfWordUsingMap {
	public static void main(String[] args) {
		String str="red blue white red black";
		String[] s = str.split(" ");
		int count=0;
		HashMap<String,Integer> h=new HashMap<String, Integer>();
		for(int i=0;i<s.length;i++) {
			if(h.containsKey(s[i])) {
				count=h.get(s[i]);
				h.put(s[i],count+1);
			}
			else
				h.put(s[i],1);
		}
		System.out.println(h);
	}
}