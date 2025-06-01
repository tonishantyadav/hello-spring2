package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.dummy.Desktop;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Desktop desktop = context.getBean(Desktop.class);
			desktop.compile();
		}
	}
}
