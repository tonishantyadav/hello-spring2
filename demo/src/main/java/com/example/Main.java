package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.dummy.Laptop;
import com.example.service.LaptopService;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		Laptop laptop = context.getBean(Laptop.class);
		LaptopService laptopService = context.getBean(LaptopService.class);
		laptopService.add(laptop);

	}
}