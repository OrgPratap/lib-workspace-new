package com.pratap.hbexample.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo 
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setId(100);
		s1.setName("Abhishek");
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s1);
		//session.getTransaction().commit();
		tx.commit(); 
		/**
		 * CONSOLE TRACE
		 * 
		 * INFO: HHH000227: Running hbm2ddl schema export
		 * Hibernate: drop table if exists Student
		 * Hibernate: create table Student (id integer not null, name varchar(255), primary key (id))
		 * Mar 10, 2015 1:21:00 AM org.hibernate.tool.hbm2ddl.SchemaExport execute
		 * INFO: HHH000230: Schema export complete
		 * Hibernate: insert into Student (name, id) values (?, ?)
		 * 
		 */
				
	}

}
