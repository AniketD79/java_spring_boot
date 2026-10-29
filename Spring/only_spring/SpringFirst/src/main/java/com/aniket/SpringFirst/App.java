package com.aniket.SpringFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Dev dev =(Dev)context.getBean("dev");
    	dev.code();
    }
}
