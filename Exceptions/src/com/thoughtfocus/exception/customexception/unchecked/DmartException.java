package com.thoughtfocus.exception.customexception.unchecked;

public class DmartException extends RuntimeException{
	public String getMessage() {
		return "Item not available";
	}
	

}
