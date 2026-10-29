package com.aniket.demoApp3;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		
		System.out.println("Blowing horn from a Bike");
	}

	
}
