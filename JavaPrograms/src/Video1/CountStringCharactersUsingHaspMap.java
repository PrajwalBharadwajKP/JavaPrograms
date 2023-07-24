package Video1;

import java.util.HashMap;

public class CountStringCharactersUsingHaspMap {
	public static void main(String[] args) {
		int count=0;
		String str="automation";
		String[] str2 = str.split("");
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<str2.length;i++) {
			if(map.containsKey(str2[i])){
				count=map.get(str2[i]);
				map.put(str2[i],count+1);
			}
			else {
				map.put(str2[i],1);
			}
		}
		System.out.println(map);
	}
}