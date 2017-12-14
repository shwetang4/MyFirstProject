package com.fh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fh.entities.Project;

public class FHBTest {

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
		System.out.println(configuration);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		System.out.println(sessionFactory);
		
		Session session=sessionFactory.openSession();
		
		Project project=(Project)session.get(Project.class,101);
		System.out.println(project);
		
		session.close();
		sessionFactory.close();
	}

}
