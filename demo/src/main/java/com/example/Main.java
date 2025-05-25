package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.dummy.Alien;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Alien alien1 = context.getBean("alien", Alien.class);
		alien1.code();
		System.out.println(alien1.getAge());

		Alien alien2 = context.getBean("alien", Alien.class);
		alien2.code();
		System.out.println(alien2.getAge());

		((ClassPathXmlApplicationContext) context).close();
	}
}
