package com.thoughtfocus.map;

public class KeyNotFoundException extends RuntimeException{
	public String getMessage() {
		return "Invalid key found";
	}
}
