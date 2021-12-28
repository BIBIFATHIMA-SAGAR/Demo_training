package com.thoughtfocus.collections.linkedList;

public class Student {
	private String name;
	private String usn;
	private int age;
	
	public Student( String name, String usn, int age) {
		this.name = name;
		this.usn = usn;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", age=" + age + "]";
	}
	
	

}
