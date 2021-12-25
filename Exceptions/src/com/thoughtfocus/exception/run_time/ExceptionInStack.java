package com.thoughtfocus.exception.run_time;

public class ExceptionInStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		ArithmeticOperation ae =new ArithmeticOperation();
		try {
			System.out.println(ae.computeDivision(20, 0));
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Main Ended");
	}

}
