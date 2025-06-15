package com.example.model.student;

import java.util.List;

public class Laptop {
  private int id;

  private String name;
  private double price;

  private List<Student> students;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @Override
  public String toString() {
    return "Laptop [id=" + id + ", name=" + name + ", price=" + price + ", students=" + students + "]";
  }
}
