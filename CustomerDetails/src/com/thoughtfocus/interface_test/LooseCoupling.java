package com.thoughtfocus.interface_test;

public class LooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Epson e = new Epson();
		Sony s = new Sony();
		Computer c = new Computer();
		c.slot(e);
		c.slot(s);
		

	}

}
