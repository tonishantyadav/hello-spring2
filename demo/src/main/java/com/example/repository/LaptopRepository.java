package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.model.dummy.Laptop;

@Repository
public class LaptopRepository {
  public void save(Laptop laptop) {
    System.out.println("Saved in laptop...");
  }
}
