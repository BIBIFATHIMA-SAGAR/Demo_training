package com.thoughtfocus.Assignments.Loops;


class Execution{
	int j = 10;
	void forloop() {
		for(int i = 0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("=====================");
		
	}
	
	void foreach() {
		String[] cars = {"volvo","mazda","BMW"};
		for(String c:cars) {
			System.out.println(c);
		}
	}
	
	void whileloop() {
		
		while(j<15) {
			System.out.println(j);
			j++;
		}
		System.out.println("===============================");
	}
	
	void dowhile() {
		
		do {
			System.out.println(j);
			j++;
			
		}
		while(j<20);
	}
}


