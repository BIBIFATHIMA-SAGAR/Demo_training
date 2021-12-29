package com.thoughtfocus.collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>(new ReversingAlphabets());
		treeSet.add("Alpha");
		treeSet.add("Tom");
		treeSet.add("Jenny");
		treeSet.add("Harry");
		
		for(String name:treeSet) {
			System.out.println(name);
		}
	}

}
