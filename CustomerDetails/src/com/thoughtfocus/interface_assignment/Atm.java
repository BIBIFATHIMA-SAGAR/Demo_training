package com.thoughtfocus.interface_assignment;

public class Atm {
	
	
	
	void slot(DebitCard debit) {
//		int amount = 1000;
//		int amount1 = 20000000;
//		int bal = amount1 - amount;
		debit.withdraw();
		debit.balance();
	} 
}
