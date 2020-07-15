package com.trendingtech;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("Z");
		treeSet.add("F");
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("M");
		treeSet.add("A");
		treeSet.add("N");
		treeSet.add("B");
		treeSet.add("L");
		treeSet.add("C");
		//treeSet.add(null);
		System.out.println(treeSet);
	}
}