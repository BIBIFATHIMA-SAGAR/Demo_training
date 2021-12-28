package com.thoughtfocus.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomLinkedList {

	public static void main(String[] args) {
		LinkedList<Student> studentList = new LinkedList<>();
		
		
		Student tom = new Student("tom", "2cv20", 22);
		Student jack = new Student("jack", "3me21", 24);
		Student jerry = new Student("jerry", "4ec22", 20);
		Student harry = new Student("harry", "3is21", 22);
		studentList.add(tom);
		
		studentList.add(jack);
		studentList.add(jerry);
		studentList.add(harry);
		
		java.util.Iterator<Student> itr = studentList.iterator();
		while(itr.hasNext()) {
			Student student=(Student)itr.next();
			if(student.getAge()>21) {
				System.out.println(student);
			}
		}
		studentList.forEach((Student)->{
			System.out.println(Student.getName());
			System.out.println(Student.getAge());
//			System.out.println(Student.getUsn());
		});
		
		
		
	
			
		}
	}


