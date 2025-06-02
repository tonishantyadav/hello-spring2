package com.example.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.dummy.Alien;
import com.example.dummy.Computer;
import com.example.dummy.Desktop;
import com.example.dummy.Laptop;

@Configuration
public class AppConfig {
  @Bean
  public Alien alien(Computer com) { // @Qualifier("laptop")
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

  @Bean
  @Primary
  public Laptop laptop() {
    return new Laptop();
  }

}
