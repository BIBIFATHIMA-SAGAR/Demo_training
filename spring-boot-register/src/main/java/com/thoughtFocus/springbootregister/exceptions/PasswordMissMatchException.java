package com.thoughtFocus.springbootregister.exceptions;

public class PasswordMissMatchException extends RuntimeException{
	public PasswordMissMatchException(String msg) {
		super(msg);
		
	}

}
