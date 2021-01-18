package com.chandra.hibernate.client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NamedParametersClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Student set sname=:n where sno=:i");
		q.setParameter("n", "Sekhar");
		q.setParameter("i", 100);
		
		int status = q.executeUpdate();
		if(status!=0) {
			System.out.println("Successfully Record Updated....");
		}else {
			System.out.println("Record Updation Failed.Please try again....");
		}
		tx.commit();
		s.close();

	}

}
