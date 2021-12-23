package com.thoughtfocus.array;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details details =new Details(23, "abc", "banglore");
		Details details1 =new Details(34, "def", "bangkok");
		Details details2 =new Details(21, "xyz", "baroda");
		Customer c =new Customer();
		c.add(details);
		c.add(details1);
		c.add(details2);
		c.display();
	}

}
