package com.thoughtfocus.multiThreading;

public class Student extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Studying.....!!");
	}

}
}