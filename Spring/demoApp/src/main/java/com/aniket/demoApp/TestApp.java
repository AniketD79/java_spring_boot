package com.aniket.demoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApp {

	@RequestMapping("/")
	public String hello() {
		
		return "Hey This is Spring Boot Web";
	}
}
