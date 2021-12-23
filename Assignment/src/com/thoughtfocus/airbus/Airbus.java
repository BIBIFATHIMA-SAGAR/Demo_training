package com.thoughtfocus.airbus;

public class Airbus implements Plane,Bus{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("VRL Logistics");
		
	}

	@Override
	public void seatsAvailable() {
		// TODO Auto-generated method stub
		System.out.println("Number of seats available: 24");
		
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("Cost per head: 1000Rs.");
		
	}

	@Override
	public void timing() {
		// TODO Auto-generated method stub
		System.out.println("Boarding: 10.30pm");
		
	}

	@Override
	public void airLine() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Jet Airways");
		
	}

	@Override
	public void handBaggage() {
		// TODO Auto-generated method stub
		System.out.println("Maximum of 12kg baggage you can carry");
		
	}

	@Override
	public void arrival() {
		// TODO Auto-generated method stub
		System.out.println("Arrives at 6:53pm");
		
	}

}
