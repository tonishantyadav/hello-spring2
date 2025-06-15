package com.example.model.dummy;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
  public Laptop() {
    System.out.println("Laptop object created...");
  }

  @Override
  public void compile() {
    System.out.println("Compiling from Laptop...");
  }
}