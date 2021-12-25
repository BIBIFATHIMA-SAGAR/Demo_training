package com.thoughtfocus.bankexample;

class CreateAccount {
	
	private String customerName;
	private String customerAddress;
	private int customerAge;
	int amount = 0;
	
	public CreateAccount(String customerName,String customerAddress,int customerAge){
		this.customerName =customerName;
		this.customerAddress = customerAddress;
		this.customerAge = customerAge;
		
	}
	
	
	public void showDetails() {
		System.out.println("Name"+customerName+"\n Address "+customerAddress+"\n Age"+customerAge);
	}
	
	
	public void savings(int amount1) 
	{
		amount = amount+amount1;
		System.out.println(customerName+" Saving is Rs."+amount);
		
	}
	
	
	public void deposit(int amount) {
		System.out.println(customerName+" deposited of Rs."+amount);
		
	}
	
	public void withdraw(int amount1) {
		amount = amount - amount1;
		System.out.println(customerName+" withdrwan Rs. "+amount1);
		System.out.println(customerName+" balance Rs. "+amount);
		
	}
	
	
	public void fixedDeposit(int amount) {
		System.out.println(customerName+" has a fixed deposit of Rs."+amount);
		
	}
}
