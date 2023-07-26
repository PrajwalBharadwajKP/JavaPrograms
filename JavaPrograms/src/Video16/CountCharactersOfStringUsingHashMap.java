package Video16;

import java.util.HashMap;

public class CountCharactersOfStringUsingHashMap {
	public static void main(String[] args) {
		String s="hello and welcome to automation";
		int count=0;
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<=s.length();i++)
			hm.put("key",count++);
		System.out.println("total number of characters are: "+hm.get("key"));
	}
}