package com.thoughtfocus.arrayassignment;

public class TestWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week = new Week();
//		week.save("Sun");
		String del = week.delete("Sun");
		System.out.println(del);
		week.printAll();
		

	}

}
