package com.example.student;

import java.util.List;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Cacheable
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(unique = true, nullable = false)
  private int roll;

  private String name;
  private int age;

  private Address address;

  @OneToMany(mappedBy = "students")
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