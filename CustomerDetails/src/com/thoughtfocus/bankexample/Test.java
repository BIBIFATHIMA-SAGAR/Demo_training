package com.thoughtfocus.bankexample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateAccount create = new CreateAccount("Jack","Newyork",22);
		create.showDetails();
		create.savings(50000);
		create.deposit(20000);
		create.fixedDeposit(500000);
		create.withdraw(1000);
		
		DeleteAccount delete = new DeleteAccount();
		

	}

}
