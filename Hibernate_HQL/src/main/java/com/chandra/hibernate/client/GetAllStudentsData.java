package com.chandra.hibernate.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.hibernate.pojo.Student;

public class GetAllStudentsData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Query query = s.createQuery("from Student");
		List<Student> list = query.list();
		System.out.println("No of Student Records = "+list.size());
		System.out.println("SNO"+"\t"+"SNAME"+"\t"+"MARKS");
		System.out.println("------------------------------");
		for(Student st:list) {
			System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getMarks());
		}
		
		tx.commit();
		s.close();
		

	}

}
