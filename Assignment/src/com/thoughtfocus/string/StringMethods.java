package com.thoughtfocus.string;

public class StringMethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greet = "Welcome to java";
		
		String[] words = greet.split("\\s");
		for(String w:words) {
			System.out.println(w);
		}
		System.out.println("Length is:"+greet.length());
		System.out.println("Character at index 3 is:"+greet.charAt(3));
		System.out.println("index is:"+greet.indexOf("to"));
		System.out.println("-------------");
		
		
		System.out.println(greet.contains("java"));
		System.out.println(greet.startsWith("W"));
		System.out.println(greet.endsWith("s"));
		System.out.println(greet.substring(2,4));
		System.out.println("-------------");
		
		
		String s1 = "hello";
		String s2 = "bye";
		String name ="Micky";
		String sf1 = String.format("name is %s",name);
		System.out.println(s1.compareTo(s2));
		String s3=s1.replace("ello", "ii");
		System.out.println(s3);
		
		System.out.println(sf1);
		
		
		System.out.println("-----------");
		String s = "    hello string        ";
		System.out.println(s.trim());
		
		
		System.out.println("------------");
		String fName = "HARRY";
		String lName =  "potter";
		System.out.println(fName.concat(lName));
		System.out.println(fName.toLowerCase());
		System.out.println(lName.toUpperCase());
		
		System.out.println("---------------");
		String check1 = "java";
		String check2 = "JAVA";
		System.out.println(check1.equals(check2));
		System.out.println(check1.equalsIgnoreCase(check2));

	}

}
