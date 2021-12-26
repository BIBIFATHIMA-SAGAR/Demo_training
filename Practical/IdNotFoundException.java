package com.thoughtfocus.Practical;


class IdNotFoundException extends RuntimeException 
{  
    public String getMessage() {
		return "Invalid id please enter a correct Id";
    	
    }
	
} 
