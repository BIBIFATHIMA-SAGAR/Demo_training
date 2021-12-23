package com.thoughtfocus.Assignments.DecisionMaking;

public class Statements {
	int i = 2;
	int age = 25;
	int weight = 48;

	void firstif() {
		if (i == 5) {
			System.out.println("i is equal to 5");
		} else {
			System.out.println("i is not equal to 5");
		}
	}

	void ifelseif() {
		if (i < 1) {
			System.out.println("i is not less than 1");

		} else if (i == 1) {
			System.out.println("i is not equal to 1");
		}

		else {
			System.out.println("i is greater than 1");
		}
	}

	void nestedif() {
		if (age != 25) {
			if (weight != 48) {
				System.out.println("You are eligible to donate blood ");

			} else {
				System.out.println("You are not eligible to donate blood ");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}

}
