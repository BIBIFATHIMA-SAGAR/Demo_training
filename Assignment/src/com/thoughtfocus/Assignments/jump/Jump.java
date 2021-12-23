package com.thoughtfocus.Assignments.jump;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =0;i<10;i++) {
			if (i==4) {
				break;
			}
			System.out.println(i);
		}
		
		//continue stmt
		System.out.println("------------------------------");
		
		for(int j=0;j<20;j++) {
			if(j%2 ==0) {
				continue;
				
			}
			System.out.println(j);
		}

	}

}
