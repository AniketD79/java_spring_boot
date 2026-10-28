package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		City city = new City();
		SexRatio sexRatio = new SexRatio();
		city.setCityId(101);
		city.setCityName("DeulgaonRaja");
		city.setCityPopulation(150000);
		city.setCityZipCode(443204);
		
		sexRatio.setCityMales(90000);
		sexRatio.setCityFemales(70000);
		
		city.setSexRatio(sexRatio);
		
		
		
		try {
			
			Configuration config = new Configuration();
			config.addAnnotatedClass(com.aniket.City.class);
			config.configure();
			
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			session.persist(city);
			
			transaction.commit();
			
			session.close();
			factory.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
