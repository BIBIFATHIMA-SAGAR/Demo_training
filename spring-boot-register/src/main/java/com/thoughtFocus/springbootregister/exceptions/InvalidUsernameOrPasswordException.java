package com.thoughtFocus.springbootregister.exceptions;

public class InvalidUsernameOrPasswordException extends RuntimeException{
	public InvalidUsernameOrPasswordException(String msg) {
		super(msg);
		
	}

}
