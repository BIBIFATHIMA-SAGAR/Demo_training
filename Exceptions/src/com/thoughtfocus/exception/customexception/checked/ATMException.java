package com.thoughtfocus.exception.customexception.checked;

public class ATMException extends Exception{
	public String getMessage() {
		return "Invalid amount entered";
		
	}
	

}
