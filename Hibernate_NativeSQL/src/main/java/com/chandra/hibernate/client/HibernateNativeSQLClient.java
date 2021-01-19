package com.chandra.hibernate.client;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateNativeSQLClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		SQLQuery query = s.createSQLQuery("select pid,pname,qty,price from product");
		List list = query.list();
		System.out.println("No Of Records = "+list.size());
		tx.commit();
		s.close();
		

	}

}
