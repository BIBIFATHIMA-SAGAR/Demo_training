package com.thoughtfocus.exception.customexception.checked;

public class ATMMachine {
	void draw (int amount) throws ATMException{
		
		if(amount<40000 && amount>100 && amount%100==0) {
			System.out.println("Please Collect the cash....");
		}
		else {
			ATMException atmException = new ATMException();
			throw atmException;
		}
	}

}
