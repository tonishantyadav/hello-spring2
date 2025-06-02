package com.example.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
  int age;
  int salary;
  Computer computer;

  public Computer getComputer() {
    return computer;
  }

  @Autowired
  // @Qualifier("myLaptop")
  public void setComputer(Computer computer) {
    this.computer = computer;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void code() {
    System.out.println("Coding...");
    computer.compile();
  }
}
