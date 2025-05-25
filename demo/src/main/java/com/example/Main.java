package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.dummy.Alien;

public class Main {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			Alien alien = context.getBean("alien", Alien.class);
			alien.code();
		}
	}
}
