package com.thoughtfocus.Assignments.CompileTimePolymorphism;

public class Test{
	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add(2, 3);
		ad.add(2.0, 3.0);
	}
}