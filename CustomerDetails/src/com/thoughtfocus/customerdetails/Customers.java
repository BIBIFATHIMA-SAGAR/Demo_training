package com.thoughtfocus.customerdetails;

public class Customers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails peter = new CustomerDetails("peter","US", 30, 2842712l, 'M');
		CustomerDetails harry = new CustomerDetails("harry","WI", 28, 1336712l, 'M');
		
		
//		peter.showCustomer("peter","US", 30, 2842712l, 'M');
		peter.addCustomer();
		peter.showCustomer();
		peter.display();
		peter.deleteCustomer();
		
		harry.showCustomer();
		harry.display();
		
		
//		harry.addCustomer();
		
		
		

	}

}
