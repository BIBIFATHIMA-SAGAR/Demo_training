package com.thoughtfocus.exception.customexception.unchecked;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a ;
		
		Scanner s =new Scanner(System.in);
		
		try {
			
			for(int i = 0;i<4;i++) {
				System.out.println("Enter your age");
				int age = s.nextInt();
				if(age<18) {
					throw new YoungerAgeException("You are not eligible to vote");
				
				}
				else {
					System.out.println("You can vote");
				}
				
				}
		
			}
			
			

		catch(YoungerAgeException e)
		{
		e.printStackTrace();
		
		}
		System.out.println("hello");
}
}

