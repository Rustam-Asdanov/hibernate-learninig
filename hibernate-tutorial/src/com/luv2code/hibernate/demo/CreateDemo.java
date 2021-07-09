package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;

public class CreateDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		/*
		 * try {
		 * 
		 * } catch () {
		 * 
		 * }
		 */
	}
}
