package com.chandra.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.chandra.hibernate.pojo.Product;

public class FetchRecords {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Product p1 = s.load(Product.class, 1);
		System.out.println(p1.getPid()+"\t"+p1.getPname()+"\t"+p1.getQty()+"\t"+p1.getPrice());
		s.close();
		Session s1 = sf.openSession();
		Product p2 = s1.load(Product.class, 1);
		System.out.println(p2.getPid()+"\t"+p2.getPname()+"\t"+p2.getQty()+"\t"+p2.getPrice());
		s1.close();

	}

}
