package com.thoughtfocus.exception.customexception.checked;

public class CustomChecked {
	public static void main(String[] args) {
		
	
	ATMMachine atmMachine = new ATMMachine();
	try {
		atmMachine.draw(50000);
	}
	catch(ATMException ae){
		ae.printStackTrace();
		
	}
}
}