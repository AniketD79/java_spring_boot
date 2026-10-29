package com.aniket;

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
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Ssd ssd = (Ssd) context.getBean("ssd");
        ssd.store();
    }
}
