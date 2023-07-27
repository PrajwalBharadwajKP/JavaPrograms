package Video19;

import java.util.HashMap;

public class OccuranceUsingMap {
	public static void main(String[] args) {
		String str="automation";
		String[] s = str.split("");
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