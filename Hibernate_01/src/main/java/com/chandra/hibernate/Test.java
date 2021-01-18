package com.chandra.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Product p = new Product();
		p.setPid(2);
		p.setPname("SOAP");
		p.setQty(1);
		p.setPrice(120);
		
		s.save(p);
		tx.commit();
		s.close();

	}

}
