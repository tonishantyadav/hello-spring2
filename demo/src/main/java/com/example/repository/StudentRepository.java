package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.student.Student;

public class StudentRepository {
  private JdbcTemplate jdbc;

  public JdbcTemplate getJdbc() {
    return jdbc;
  }

  public void setJdbc(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  public void save(Student student) {
    String query = "insert into student(roll, age, name) values(?, ?, ?)";
    int rows = jdbc.update(query, student.getRoll(), student.getAge(), student.getName());
    System.out.println("Rows affected: " + rows);
  }

  public List<Student> findAll() {
    List<Student> students = new ArrayList<>();
    return students;
  }

}
