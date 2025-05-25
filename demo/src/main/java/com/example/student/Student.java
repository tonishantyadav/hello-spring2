package com.example.student;

import java.util.List;

public class Student {
  private int id;

  private int roll;

  private String name;
  private int age;

  private Address address;

  private List<Laptop> laptops;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getRoll() {
    return roll;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Laptop> getLaptops() {
    return laptops;
  }

  public void setLaptops(List<Laptop> laptops) {
    this.laptops = laptops;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", age=" + age + ", address=" + address
        + ", laptops=" + laptops + "]";
  }
}