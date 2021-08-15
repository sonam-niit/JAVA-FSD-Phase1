package com.simplilearn.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "tommy");
		map.put(2, "Mary");
		map.put(3, "catty");
		map.put(3, "sonam");
		map.put(null, null);
		map.put(null, null);
		map.put(6, null);
		
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		//map can accept one null key and multiple null values.
		
		Hashtable<Integer, String> table=new Hashtable<>();
		table.put(1, "tommy");
		table.put(2, "Mary");
		table.put(3, "catty");
		table.put(3, "sonam");
//		table.put(null, null);
//		table.put(null, null);
//		table.put(6, null);
		
		System.out.println(table);
		
		for(Map.Entry m:table.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		//map can accept one null key and multiple null values.
		
		//TreeMap
		TreeMap<Integer, String> map1=new TreeMap<>();
		map1.put(1, "tommy");
		map1.put(90, "Mary");
		map1.put(56, "catty");
		map1.put(8, "sonam");
//		map1.put(null, null);
//		map1.put(null, null);
//		map1.put(6, null);
		
		System.out.println(map1);
		
		for(Map.Entry m:map1.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}
}
