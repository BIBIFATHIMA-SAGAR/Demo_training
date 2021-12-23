package com.thoughtfocus.string;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");
		System.out.println(sb);
		System.out.println(sb.charAt(3));
		
		
		System.out.println(sb.length());
		
		System.out.println("-------------------");
		sb.insert(1, "Java");
		System.out.println(sb);
		
		System.out.println("-----------------");
		StringBuffer s = new StringBuffer("Welcome ");
		s.replace(1, 3, "java");
		System.out.println(s);
		System.out.println("-----------------");
		s.delete(1, 3);
		System.out.println(s);
		System.out.println("------------------");
		
		StringBuffer s1 = new StringBuffer("String ");
		s1.reverse();
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		System.out.println("------------------");
		StringBuffer s3 = new StringBuffer("Harry Hello");
		System.out.println(s3.lastIndexOf("H"));
		System.out.println(s3.deleteCharAt(0));
		System.out.println(s3.subSequence(5, 9));
		s3.setCharAt(3, 'i');
		System.out.println(s3);
		s3.setLength(4);
		System.out.println(s3);
		
	}

}
