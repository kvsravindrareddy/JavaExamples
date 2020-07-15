package com.trendingtech;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");//65
		set.add("B");//66
		set.add("A");//65 Map<A,Object> key : A and value :Object HashKey : 65 and value A
		set.add("Aa");
		set.add("BB");
		System.out.println(set);
		Iterator<String> setItr = set.iterator();
		while(setItr.hasNext())
		{
			System.out.println(setItr.next());
			//set.remove("B");
		}
		
		
		Map<String, Integer> map = new HashMap();
		map.put("A", 1);
		map.put("B", 2);
		map.put("A", 1);
		map.put("C", 1);
		map.put("D", 3);
		map.put("E", 4);
		map.put("Aa", 5);
		map.put("BB", 6);
		map.put(null, null);
		map.put(null, null);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		
		Hashtable<String, Integer> hTable = new Hashtable();
		hTable.put("A", 1);
		hTable.put("B", 2);
		hTable.put("A", 1);
		hTable.put("C", 1);
		hTable.put("D", 3);
		hTable.put("E", 4);
		hTable.put("Aa", 5);
		hTable.put("BB", 6);
//		hTable.put(null, null);
//		hTable.put("Z", null);
//		hTable.put(null, 7);
		
		Set<Entry<String, Integer>> enSet = hTable.entrySet();
		for(Entry<String, Integer> entry : enSet)
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}
}