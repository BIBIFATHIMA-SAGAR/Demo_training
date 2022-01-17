package com.thoughtfocus.jdbc.Assessment3;

public class SerialNumberNotFoundException extends RuntimeException{
	public static void message() {
		System.out.println("Invalid Serial number");
	}

}
