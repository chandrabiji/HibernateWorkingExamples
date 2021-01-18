package com.chandra.hibernate.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClientApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();//Transient State
		Transaction tx = s.beginTransaction();
		
		Emp e1 = new Emp();
		e1.setEname("ABC");
		e1.setSalary(5000);
		
		s.save(e1);
		System.out.println(s.contains(e1));//Persistent State
		s.evict(e1);//Detached State
		Emp e2 = new Emp();
		e2.setEname("PQR");
		e2.setSalary(6000);
		s.merge(e2);//Persistent State
		s.delete(e2);//Remove
		
		

	}

}
