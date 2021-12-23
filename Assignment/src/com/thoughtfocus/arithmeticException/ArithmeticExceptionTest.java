package com.thoughtfocus.arithmeticException;

public class ArithmeticExceptionTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int k ;
		try {
			k = i/j;
			}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
	}

}
