package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.dummy.Alien;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Alien alien1 = context.getBean("alien", Alien.class);
		alien1.code();
		System.out.println(alien1.getAge());
		System.out.println(alien1.getSalary());

		((ClassPathXmlApplicationContext) context).close();
	}
}
