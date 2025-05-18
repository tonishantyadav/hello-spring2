package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.student.Laptop;
import com.example.student.Student;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();

		Student s1 = session1.get(Student.class, 1);
		System.out.println(s1);

		Student s2 = session2.get(Student.class, 1);
		System.out.println(s2);

		session1.close();
		session2.close();

		sessionFactory.close();
	}
}
