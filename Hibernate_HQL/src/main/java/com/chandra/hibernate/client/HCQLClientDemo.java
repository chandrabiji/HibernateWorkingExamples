package com.chandra.hibernate.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.chandra.hibernate.pojo.Student;

public class HCQLClientDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Criteria c = s.createCriteria(Student.class);
		c.add(Restrictions.gt("marks", 89));
		List list = c.list();
		System.out.println("Above 89 marks student count = "+list.size());
		tx.commit();
		s.close();

	}

}
