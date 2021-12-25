package com.thoughtfocus.interface_assignment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc hdfc = new Hdfc();
		Sbi sbi = new Sbi();
		Atm atm = new Atm();
		
		atm.slot(sbi);
		atm.slot(hdfc);

	}

}
