package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

    	
//    	Employees emp = new Employees();
    	
//    	emp.setEmpId(102);
//    	emp.setEmpName("Bunny");
//    	emp.setEmpRole("Backend Developer");
    	Configuration config = new Configuration();
    	config.addAnnotatedClass(com.aniket.Employees.class);
    	config.configure();
    	SessionFactory factory=config.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
//    	session.persist(emp);
    	Employees emp=	session.find(Employees.class, 102);
    	if(emp != null)
    	System.out.println(emp);
    	else
    		System.out.print("Not found!");
    	
    	session.remove(emp);
    	transaction.commit();
    	
    	
    	session.close();
    	factory.close();
    }
}

//The emp and transaction commited cause we dont need when not updating values