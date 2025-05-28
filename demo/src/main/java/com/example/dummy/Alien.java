package com.example.dummy;

public class Alien {
  int age;
  int salary;
  Laptop laptop;

  public Alien(int age, int salary, Laptop laptop) {
    this.age = age;
    this.salary = salary;
    this.laptop = laptop;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  // public void setLaptop(Laptop laptop) {
  // this.laptop = laptop;
  // }

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
    laptop.compiling();
  }
}
