package com.aniket.demoApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

	
	
//	Constructor Injection
//	Laptop laptop;
//	public Dev(Laptop laptop) {
//		this.laptop= laptop;
//	}
	
	
//	Setter Injection
	Laptop laptop;
	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop= laptop;
	}
	
	public void hello() {
		System.out.println( "Hello from Dev");
		laptop.laptop();
	}
}
