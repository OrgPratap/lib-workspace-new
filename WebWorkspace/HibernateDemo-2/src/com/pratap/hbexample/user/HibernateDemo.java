package com.pratap.hbexample.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo 
{
	public static void main(String[] args) 
	{
			
		User u1=new User();
		u1.setUserId(100);
		u1.setUserName("Kranti");
		u1.setUserPassword("ki");
		u1.setLastVisit(new Date());
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(u1);
		tx.commit();
		session.close();
		
		/*
		 *	CONSOLE TRACE
		 * 
		 * INFO: HHH000227: Running hbm2ddl schema export
		 * Hibernate: drop table if exists User
		 * Hibernate: create table User (userId integer not null, lastVisit datetime, userName varchar(255), userPassword varchar(255), primary key (userId))
		 * Mar 10, 2015 1:50:55 AM org.hibernate.tool.hbm2ddl.SchemaExport execute
		 * INFO: HHH000230: Schema export complete
		 * Hibernate: insert into User (lastVisit, userName, userPassword, userId) values (?, ?, ?, ?)
		 *
		 */
		
		
	}
}
