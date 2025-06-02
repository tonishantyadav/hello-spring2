package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.example") // Scan the example package for the components
public class AppConfig {
  // No need to create the bean explicitly, Spring will manage the instances
  // automatically.
}
