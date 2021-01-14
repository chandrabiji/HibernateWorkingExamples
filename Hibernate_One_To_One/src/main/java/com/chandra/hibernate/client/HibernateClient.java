package com.chandra.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.model.Address;
import com.chandra.hibernate.model.Employee;

public class HibernateClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Address a1 = new Address();
		a1.setAddressLine("West Venkatapuram");
		a1.setCity("Hyderabad");
		a1.setState("TS");
		a1.setCountry("India");
		a1.setPinCode(500015);
		
		Employee e1 = new Employee();
		e1.setName("Charan");
		e1.setEmail("charan@gmail.com");
		e1.setAddress(a1);
		
		s.save(e1);
		tx.commit();
		s.close();

	}

}
