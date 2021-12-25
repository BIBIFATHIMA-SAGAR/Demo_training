package com.thoughtfocus.typeCasting.nonPrimitiveTypeCasting;

public class Test {
	public static void main(String[] args) {
		//UPCASTING
		
		Movies movie = new Animations();
		System.out.println(movie.type);
		movie.funny();
		
		System.out.println("--------------------");
		
		//DOWNCASTING
		Animations anime = (Animations) movie;
		System.out.println(anime.type);
		System.out.println(anime.name);
		anime.funny();
		anime.horror();
		
	}

}
