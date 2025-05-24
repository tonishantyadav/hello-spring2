package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dummy.Alien;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		Alien alien = context.getBean(Alien.class);
		alien.code();

	}
}
