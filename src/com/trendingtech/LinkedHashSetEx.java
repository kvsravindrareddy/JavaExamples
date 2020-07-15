package com.trendingtech;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("A");
		linkedSet.add("Z");
		linkedSet.add("F");
		linkedSet.add("B");
		linkedSet.add("D");
		linkedSet.add("M");
		linkedSet.add("A");
		linkedSet.add("N");
		linkedSet.add("B");
		linkedSet.add("L");
		linkedSet.add("C");
		linkedSet.add(null);
		System.out.println(linkedSet);
	}
}