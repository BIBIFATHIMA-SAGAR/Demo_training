package com.thoughtfocus.interface_test;

public class TaxCalc implements CentralTax,StateTax {
	@Override
	public void entertainmentTax() {
		System.out.println("entertainment tax is");
		
	}
	
	public void incomeTax() {
		// TODO Auto-generated method stub
		System.out.println("income tax is");
		
	}
	
}
