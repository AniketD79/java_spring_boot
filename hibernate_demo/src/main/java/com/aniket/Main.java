package com.aniket;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Office office = new Office();
		
		office.setOfficeId(101);
		office.setOfficeName("Zeta-V");
		office.setOfficeTurnOver(50);
		office.setOfficeStrength(20);
		
		try {
			
			
			Configuration config = new Configuration();
			config.addAnnotatedClass(com.aniket.Office.class);
			config.configure();
			
			SessionFactory factory = config.buildSessionFactory();
			
			Session session = factory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
//			session.persist(office);

			session.remove(office);
			
			transaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
