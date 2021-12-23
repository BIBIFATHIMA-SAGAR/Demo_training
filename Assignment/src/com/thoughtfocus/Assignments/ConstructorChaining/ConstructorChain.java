package com.thoughtfocus.Assignments.ConstructorChaining;

public class ConstructorChain {
	
	ConstructorChain(){
		this(5);
		System.out.println("The default Constructor");
	}
	
	ConstructorChain(int x){
		this(5,15);
		System.out.println(x);
		
	}
	
	ConstructorChain(int x, int y){
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstructorChain c = new ConstructorChain();
		new ConstructorChain();
		

	}

}
