package com.example.model.student;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
  private int id;

  private int rollNo;
  private int age;
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getRollNo() {
    return rollNo;
  }

  public void setRollNo(int roll) {
    this.rollNo = roll;
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

  @Override
  public String toString() {
    return "Student [id=" + id + ", roll=" + rollNo + ", name=" + name + ", age=" + age + "]";
  }
}