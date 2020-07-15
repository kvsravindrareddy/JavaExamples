package com.trendingtech;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMapEx {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("A", 1);
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			map.put("C", 3);
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		for(String str : list)
		{
			list.add("B");
			System.out.println(str);
		}
		System.out.println(list);
		
	}
}