package com.chandra.hibernate.model;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClientApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Answer a1 = new Answer();
		a1.setAnsername("Java is a programming language");
		a1.setPostedBy("xyz");
		
		Answer a2 = new Answer();
		a2.setAnsername("Java is a platform");
		a2.setPostedBy("pqr");
		
		Answer a3 = new Answer();
		a3.setAnsername("Servlet is an API");
		a3.setPostedBy("abc");
		
		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		
		Question q1 = new Question();
		q1.setQname("What is Java?");
		q1.setAnswers(list1);
		
		s.persist(q1);
		tx.commit();
		s.close();
	}

}
