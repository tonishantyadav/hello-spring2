package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.dummy.Alien;
import com.example.dummy.Desktop;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Alien alien1 = context.getBean("alien", Alien.class);
		alien1.code();
		System.out.println(alien1.getAge());
		System.out.println(alien1.getSalary());

		// Desktop object will be created only when it's been called
		Desktop desktop = context.getBean("computer2", Desktop.class);
		desktop.compile();

		((ClassPathXmlApplicationContext) context).close();
	}
}
