package com.thoughtFocus.springbootregister.exceptions;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String msg) {
		super(msg);
	}


}
