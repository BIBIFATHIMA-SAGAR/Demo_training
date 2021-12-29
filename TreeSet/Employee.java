package com.thoughtfocus.collections.TreeSet;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	
//	private String companyName;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
//		this.companyName = companyName;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	@Override
	public int compareTo(Employee emp) {
		if(this.id <emp.id) {
			return -1;
		}
		else if(this.id>emp.id) {
			return 1;
		}
		else {
		return 0;
	}
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
