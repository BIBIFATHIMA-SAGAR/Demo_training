package com.thoughtfocus.multiThreading;

public class Test {
	public static void main(String[] args) {
		
		Student student =new Student();
		student.start();
		
		Teacher teacher = new Teacher();
		
		Thread object = new Thread(teacher);
		object.start();
	}

}
