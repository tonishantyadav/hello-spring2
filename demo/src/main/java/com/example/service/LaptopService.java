package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.dummy.Laptop;
import com.example.repository.LaptopRepository;

@Service
public class LaptopService {
  @Autowired
  private LaptopRepository laptopRepository;

  public void add(Laptop laptop) {
    laptopRepository.save(laptop);
  }
}
