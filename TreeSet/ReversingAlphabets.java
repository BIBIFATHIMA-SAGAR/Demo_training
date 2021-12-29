package com.thoughtfocus.collections.TreeSet;

import java.util.Comparator;

public class ReversingAlphabets implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		
		return -o1.compareTo(o2);
	}
	

}
