package com.thoughtfocus.Encapsulation;

public class JavaBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag bag = new Bag();
		
		bag.setBrand("Wild craft");
		bag.setNoOfPockets(5);
		bag.setPrice(2000);
		bag.setQuantity("4ltr");
		bag.setType("backpack bag");
		
		System.out.println("name "+bag.getBrand());
		System.out.println("Noofpckts "+bag.getNoOfPockets());
		System.out.println("price "+bag.getPrice());
		System.out.println("quant "+bag.getQuantity());
		System.out.println("type "+bag.getType());
	}

}
