package com.aniket.SpringSecond;

public class Earth {

	
	Mars mars;
	
//	public Earth() {
//		System.out.println("Earth is calling!...");
//	}
	
	public Earth(Mars mars) {
		this.mars=mars;
	}
	public void rain() {
		System.out.println("Raining on Earth!...");
		mars.storm();
//		Sysy
	}
}
