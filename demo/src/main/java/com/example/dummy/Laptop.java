package com.example.dummy;

import org.springframework.stereotype.Component;

@Component("myLaptop") // Custom name for the Laptop bean
public class Laptop implements Computer {
  public Laptop() {
    System.out.println("Laptop object created...");
  }

  @Override
  public void compile() {
    System.out.println("Compiling from Laptop...");
  }
}