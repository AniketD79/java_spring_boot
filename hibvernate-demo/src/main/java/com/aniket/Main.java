package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		
//		Below Commentyed is for save Insert
//		City city = new City();
//		city.setCityId(101);
//		city.setCityName("Deulgaon Raja");
//		city.setCityPopulation(150000);
//		city.setCityArea(112.2);
//		city.setCityArea(222.2);
		
		
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(com.aniket.City.class);
		config.configure();
		
		SessionFactory factory =config.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		Below Commented is for Inserting
//		session.persist(city);
		
		
//		Below operation is for updating the values;
		
		City city = session.find(City.class, 101);
		if(city!=null)
			city.setCityArea(222.2);
		transaction.commit();
		

	}

}
