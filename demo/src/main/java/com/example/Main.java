package com.example;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.student.Address;
import com.example.student.Laptop;
import com.example.student.Student;

public class Main {
	public static void main(String[] args) {
		Address add1 = new Address();
		add1.setCountry("India");
		add1.setState("West Bengal");
		add1.setCity("Asansol");
		add1.setSteet("ABC");
		add1.setPin("101");

		Address add2 = new Address();
		add2.setCountry("India");
		add2.setState("Mumbai");
		add2.setCity("Bandra");
		add2.setSteet("ZXC");
		add2.setPin("102");

		Student s1 = new Student();
		s1.setName("John Smith");
		s1.setAge(20);
		s1.setRoll(10);
		s1.setAddress(add1);

		Student s2 = new Student();
		s2.setName("Matt Smith");
		s2.setAge(20);
		s2.setRoll(30);
		s2.setAddress(add1);

		Student s3 = new Student();
		s3.setName("Jane Doe");
		s3.setAge(20);
		s3.setRoll(11);
		s3.setAddress(add2);

		Laptop l1 = new Laptop();
		l1.setName("DELL");
		l1.setPrice(200);

		Laptop l2 = new Laptop();
		l2.setName("HP");
		l2.setPrice(300);

		Laptop l3 = new Laptop();
		l3.setName("Asus");
		l3.setPrice(400);

		s1.setLaptops(Arrays.asList(l1, l3));
		s2.setLaptops(Arrays.asList(l1, l2));
		s3.setLaptops(Arrays.asList(l2, l3));

		l1.setStudents(Arrays.asList(s1, s2));
		l2.setStudents(Arrays.asList(s1, s3));
		l3.setStudents(Arrays.asList(s2, s3));

		Configuration configuration = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		session.persist(l1);
		session.persist(l2);
		session.persist(l3);
		transaction.commit();

		session.close();
		sessionFactory.close();
	}
}
