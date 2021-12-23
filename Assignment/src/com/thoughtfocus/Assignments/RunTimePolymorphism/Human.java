package com.thoughtfocus;

public class Human {
	public static void main(String[] args) {
		Human friend = new Human();
		Human unknown = new Human();
		friend.speak("chaitanya","eng");
		unknown.speak("jack", 20, "hindi");
		
	}

	
	void speak(String name,String lang1) {
		System.out.println(name+" is speaking "+lang1);
	}
	
	void speak(String name,int age,String lang2){
		System.out.println(name+ " is "+age+" years old "+"and speaking "+lang2);
		
	}
	
}

	

