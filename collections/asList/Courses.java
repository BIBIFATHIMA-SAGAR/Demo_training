package com.thoughtfocus.collections.asList;

import java.util.Arrays;
import java.util.List;

public class Courses {
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("C","C++","Java","Spring","Hibernate");
		
		
		for(String course:courses) {
			System.out.println(course);
		}
	}

}
