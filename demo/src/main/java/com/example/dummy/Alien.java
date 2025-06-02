package com.example.dummy;

import org.springframework.stereotype.Component;

@Component
public class Alien {
  int age;
  int salary;
  Computer computer;

  public Computer getComputer() {
    return computer;
  }

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
