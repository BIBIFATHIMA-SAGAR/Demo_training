package com.thoughtfocus.collections.TreeSetUsingStringBuffer;

import java.util.TreeSet;

public class Student {
	
	public static void main(String[] args) {
		
		
		TreeSet<StringBuffer> nameList =new TreeSet<StringBuffer>(new BufferComparator());
		nameList.add(new StringBuffer("vandana"));
		nameList.add(new StringBuffer("pavi"));
		nameList.add(new StringBuffer("soumya"));
		nameList.add(new StringBuffer("adi"));
		
		System.out.println(nameList);
		
		TreeSet<String> name =new TreeSet<String>(new StringComparator());
		name.add("vandana");
		name.add("pavi");
		name.add("soumya");
		name.add("adi");
		System.out.println(name);
	}

}
