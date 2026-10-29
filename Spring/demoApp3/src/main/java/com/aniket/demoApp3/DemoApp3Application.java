package com.aniket.demoApp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class DemoApp3Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(DemoApp3Application.class, args);
	
	Execute execute =context.getBean(Execute.class);
	execute.show();
	}

}
