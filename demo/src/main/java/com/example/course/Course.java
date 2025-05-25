package com.example.course;

public class Course {
  private int id;

  private String course;
  private double price;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Course [id=" + id + ", course=" + course + ", price=" + price + "]";
  }

}
