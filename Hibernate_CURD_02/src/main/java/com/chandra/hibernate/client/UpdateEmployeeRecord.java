package com.chandra.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.pojo.Employee;

public class UpdateEmployeeRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e = s.get(Employee.class, new Integer(2));
		e.setEname("Charan");
		
		s.update(e);
		tx.commit();
		s.close();
		

	}

}
