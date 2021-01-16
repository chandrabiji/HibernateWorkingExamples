package com.chandra.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.pojo.Address;
import com.chandra.hibernate.pojo.Employee;

public class HibernateClientApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Address a1 = new Address();
		a1.setAddressLine("West Venkatapuram");
		a1.setCity("Secundrabad");
		a1.setSate("TS");
		a1.setCountry("India");
		
		Employee e1 = new Employee();
		e1.setName("Charan");
		e1.setEmail("charan@gmail.com");
		e1.setAddress(a1);
		
		Employee e2 = new Employee();
		e2.setName("Chandra");
		e2.setEmail("chandramca04@gmail.com");
		e2.setAddress(a1);
		
		s.persist(e1);
		s.persist(e2);
		tx.commit();
		s.close();
		
		

	}

}
