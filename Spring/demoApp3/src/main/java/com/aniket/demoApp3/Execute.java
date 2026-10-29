package com.aniket.demoApp3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Execute {
	
	
	Vehicle vehicle;
	
	public Execute(@Qualifier("bike") Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	
	public void show() {
		
		System.out.println("Welcome to the factory!");
		vehicle.horn();
	}

	
}
