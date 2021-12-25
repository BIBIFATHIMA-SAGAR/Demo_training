package com.thoughtfocus.abstractionexample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung samsung = new Samsung();
		Iphone iphone = new Iphone();
		RepairShop r =new RepairShop();
		r.repair(samsung);
		r.repair(iphone);
//		s.call();
//		s.camera();
//		i.call();
//		i.camera();

	}

}
