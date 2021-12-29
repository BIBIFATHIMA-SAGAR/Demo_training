package com.thoughtfocus.collections.TreeSet;

import java.util.Comparator;

public class MyComperator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return -o1.compareTo(o2);
	}

}
