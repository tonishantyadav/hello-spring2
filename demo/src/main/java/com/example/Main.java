package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.dummy.Alien;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Alien alien = context.getBean(Alien.class);
			System.out.println(alien.getAge());
			System.out.println(alien.getSalary());
			alien.code();
		}
	}
}