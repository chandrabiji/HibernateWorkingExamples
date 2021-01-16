package com.chandra.hibernate.client;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.pojo.Answer;
import com.chandra.hibernate.pojo.Question;

public class HibernateClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Answer a1 = new Answer();
		a1.setAnswername("Java is a programming language");
		a1.setPostedBy("Chandra");
		
		Answer a2 = new Answer();
		a2.setAnswername("Java is a platform");
		a2.setPostedBy("Charan");
		
		Question q1 = new Question();
		q1.setQname("What is Java?");
		ArrayList<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		q1.setAnsers(list);
		
		Answer a3 = new Answer();
		a3.setAnswername("Servlet is an interface");;
		a3.setPostedBy("Sai");
		
		Answer a4 = new Answer();
		a4.setAnswername("Servlet is an API");
        a4.setPostedBy("Sekhar");
        
        Question q2 = new Question();
        q2.setQname("What is Servlet?");
        ArrayList<Answer> list2 = new ArrayList<Answer>();
        list2.add(a3);
        list2.add(a4);
        q2.setAnsers(list2);
        
        s.persist(q1);
        s.persist(q2);
        tx.commit();
        s.close();
	}

}
