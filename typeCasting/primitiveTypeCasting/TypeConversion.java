package com.thoughtfocus.typeCasting.primitiveTypeCasting;

public class TypeConversion {

	public static void main(String[] args) {
		
		System.out.println("---------Widening----------");  //small to big
		
		int a = 10;
		double b= a;				//implicitly
		System.out.println(a+" "+b);
		
		
		char c = 'A';
		int d = c;
		System.out.println(c+" "+d);
		
		
		
		System.out.println("----------------Narrowing-----------");  //Big to small  
		
		double i =5.34;
		int j = (int)i;					//explicitly
		System.out.println(i+" "+j);
		
		int k = 67;
		char l = (char)k;
		System.out.println(k+" "+l);
		
		
		
		System.out.println("============================");
		
		System.out.println("A"+"B");
		System.out.println("A"+20);
		System.out.println('A'+'B');
		System.out.println('a'+20);
		System.out.println('a'+"a");
		
		
		System.out.println("-----------------------");
		float f = 2.55f;   
		
		int z = 34;
		
		long l1 = 32874444442333333l;	
		
		
	}
}


