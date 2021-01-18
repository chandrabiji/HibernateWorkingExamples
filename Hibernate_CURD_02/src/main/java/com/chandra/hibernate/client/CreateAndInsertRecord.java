package com.chandra.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.pojo.Employee;

public class CreateAndInsertRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEname("ABC");
		e1.setSalary(5000);
		
		Employee e2 = new Employee();
		e2.setEname("PQR");
		e2.setSalary(6000);
		
		Employee e3 = new Employee();
		e3.setEname("XYZ");
		e3.setSalary(7000);
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		tx.commit();
		s.close();
	}

}
