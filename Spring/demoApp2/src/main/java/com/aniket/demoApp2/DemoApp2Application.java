package com.aniket.demoApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApp2Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(DemoApp2Application.class, args);
	
	Dev dev;
	dev =context.getBean(Dev.class);
	dev.hello();
	}

}
