package com.thoughtfocus.interface_assignment;

public class Sbi implements DebitCard {
	int amount = 1000;
	int amount1 = 300000;
	int bal = amount1 - amount;


	@Override
	public void withdraw() {
	// TODO Auto-generated method stub
	System.out.println("withdraw Rs."+amount+" from SBI bank");
	
	}
	
	
	public void balance() {

		System.out.println("Balance avilable is Rs."+bal);
	}
	

	

}
