package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dummy.Alien;
import com.example.dummy.Computer;
import com.example.dummy.Desktop;

@Configuration
public class AppConfig {
  @Bean
  public Alien alien(Computer com) {
    Alien alien = new Alien();
    alien.setAge(10);
    alien.setSalary(1000);
    alien.setComputer(com);
    return alien;
  }

  @Bean
  public Desktop desktop() {
    return new Desktop();
  }
}
