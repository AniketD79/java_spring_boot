package com.aniket.SpringSecond;

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
    	
    	Earth e1= (Earth) context.getBean("earth");
    	e1.rain();
    	
    	
    	
    }
}
