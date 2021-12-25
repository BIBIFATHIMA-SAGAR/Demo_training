package com.thoughtfocus.interface_assignment;

public class Hdfc implements DebitCard {
	
//	public void withdraw() {
//		System.out.println("withdraw from Hdfc bank");
//	}
//
	int amount = 1000;
	int amount1 = 200000;
	int bal = amount1 - amount;

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw Rs."+amount+" from HDFC bank");
		
	}
	public void balance() {
		System.out.println("Balance avilable is Rs."+bal);
		
	}

	
}
