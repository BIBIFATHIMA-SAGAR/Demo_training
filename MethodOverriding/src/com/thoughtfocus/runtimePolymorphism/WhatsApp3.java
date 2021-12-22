package com.thoughtfocus.runtimePolymorphism;

public class WhatsApp3 extends WhatsApp2 {
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Blue tick supported");
	}
	@Override
	void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("Video call supported");
	}
	void story() {
		System.out.println("Can upload images as Story");
	}

}
