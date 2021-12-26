package com.thoughtfocus.Practical;

public class BrandNameNotFoundException extends RuntimeException {
	 public String getMessage() {
			return "Brand details not found";
	 }

}
