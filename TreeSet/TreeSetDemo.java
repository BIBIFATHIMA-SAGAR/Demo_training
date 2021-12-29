package com.thoughtfocus.collections.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set<Employee> empSet = new TreeSet<Employee>(new MyComperator());
		
		Employee oggy = new Employee(10, "oggy");
		Employee tom = new Employee(25, "tom");
		Employee jerry = new Employee(15, "jerry");
		Employee harry = new Employee(12, "harry");
		
		
		empSet.add(oggy);
		empSet.add(tom);
		empSet.add(jerry);
		empSet.add(harry);
		for(Employee emp:empSet) {
			System.out.println(emp);
		}
	}

}
