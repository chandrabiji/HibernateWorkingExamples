package com.chandra.hibernate.client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudentRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Query query = s.createQuery("delete from Student where sno=300");
		int status =query.executeUpdate();
		if(status!=0) {
			System.out.println("One Student Record Successfully Deleted....");
		}else {
			System.out.println("Student Record Notable to Deleted.Please try again");
		}
		tx.commit();
		s.close();
	}

}
