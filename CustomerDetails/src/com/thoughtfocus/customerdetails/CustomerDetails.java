package com.thoughtfocus.customerdetails;

public class CustomerDetails {
	String customerName;
	String customerAddress;
	int customerAge;
	long phoneNumber;
	char gender;
	
	
	
	public CustomerDetails() {
		System.out.println("Customer Details Are");
	}
	public CustomerDetails(String customerName,String customerAddress,int customerAge,long phoneNumber,char gender) 
	{
		this.customerName =customerName;
		this.customerAddress = customerAddress;
		this.customerAge = customerAge;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		
//		addCustomer();
		
		
		
	}
	
	
	public void addCustomer() {
		System.out.println("Customer added successfully");
		
	}
	public void showCustomer() {
		System.out.println("showing "+customerName+" details ");
		
		
	}
	public void display() {
		System.out.println("Customer Name "+customerName);
		System.out.println("Address "+customerAddress);
		System.out.println("Age "+customerAge);
		System.out.println("Phone "+phoneNumber);
		
	}
	public void deleteCustomer() {
		System.out.println("Customer deleted successfully");
		
	}
	

}
