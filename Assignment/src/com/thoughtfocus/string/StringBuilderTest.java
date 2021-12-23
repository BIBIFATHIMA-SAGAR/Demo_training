package com.thoughtfocus.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s =new StringBuilder();
		System.out.println(s.capacity());
		s.append("hii");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.reverse());
		System.out.println(s.charAt(0));
		System.out.println(s.replace(0, 2,"bye"));
		System.out.println(s.indexOf("y"));
		
		
		
		

	}

}
