package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.example") // Scan the example package for the components
public class AppConfig {
  // @Bean
  // public Alien alien(Computer com) { // @Qualifier("laptop")
  // Alien alien = new Alien();
  // alien.setAge(10);
  // alien.setSalary(1000);
  // alien.setComputer(com);
  // return alien;
  // }

  // @Bean
  // public Desktop desktop() {
  // return new Desktop();
  // }

  // @Bean
  // @Primary
  // public Laptop laptop() {
  // return new Laptop();
  // }
}
