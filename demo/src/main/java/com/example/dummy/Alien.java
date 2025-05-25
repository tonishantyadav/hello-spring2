package com.example.dummy;

public class Alien {
  int age;
  Laptop laptop;

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
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
