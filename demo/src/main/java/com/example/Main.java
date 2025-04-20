package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.student.Student;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Student student = new Student();
		student.setRoll(6);
		student.setName("Tim Bruton");
		student.setAge(22);

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = null;
		try {
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			logger.error("SessionFactory creation failed", e);
			throw new ExceptionInInitializerError(e);
		}

		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.persist(student);
				transaction.commit();
				logger.info("Student saved successfully.");
			} catch (Exception e) {
				if (transaction != null)
					transaction.rollback();
				logger.error("Transaction failed, rolled back.", e);
			} finally {
				session.close();
			}
		} catch (Exception e) {
			logger.error("Error opening session", e);
		} finally {
			if (sessionFactory != null)
				sessionFactory.close();
		}
	}
}
