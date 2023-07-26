package Video16;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapMethods {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		hm.put("k1",20);
		hm.put("k2",60);
		hm.put("k5",30);
		hm.put("k3",10);
		hm.put("k6",50);
		hm.put("k4",40);
		System.out.println(hm);
		for(String key:hm.keySet())
			System.out.println(key+" having value as "+hm.get(key));
		for(Entry<String, Integer> es:hm.entrySet())
			System.out.println(es);
		//use of contains key
		System.out.println(hm.containsKey("k8"));
		System.out.println(hm.containsKey("k2"));
		//use of contains value
		System.out.println(hm.containsValue(40));
		System.out.println(hm.containsValue(90));
		//use of remove 
		hm.remove("k3");
		System.out.println(hm);
		//use of size
		System.out.println(hm.size());
		//use of values
		System.out.println(hm.values());
	}
}