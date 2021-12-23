package com.thoughtfocus.array;

public class Customer {
	Details[] details = new Details[4];
	int index = 0;
	public void add(Details dt) {
		details[index]=dt;
		index++;
		System.out.println("element is added");
	}
	public void display() {
		for(int i=0;i<details.length;i++) {
			System.out.println(details[i].getId());
			System.out.println(details[i].getName());
			System.out.println(details[i].getAddress());


		}
	}
	public void update(int id ,String name ) {
		for(int i=0;i<details.length;i++) {
			if(details[i].getId()==id) {
				details[i].setName(name);
			}
		}
		
	}

}
