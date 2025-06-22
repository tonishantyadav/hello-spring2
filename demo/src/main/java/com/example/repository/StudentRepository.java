package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.student.Student;

@Repository
public class StudentRepository {
  @Autowired
  private JdbcTemplate jdbc;

  public JdbcTemplate getJdbc() {
    return jdbc;
  }

  public void setJdbc(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  public void save(Student student) {
    String query = "INSERT INTO student (rollNo, age, name) values (?, ?, ?)";
    int rows = jdbc.update(query, student.getRollNo(), student.getAge(), student.getName());
    System.out.println("Rows affected: " + rows);
  }

  public List<Student> findAll() {
    String query = "SELECT * FROM student";
    return jdbc.query(query, (resultSet, rowNo) -> {
      Student student = new Student();
      student.setRollNo(resultSet.getInt("rollNo"));
      student.setAge(resultSet.getInt("age"));
      student.setName(resultSet.getString("name"));
      return student;
    });
  }

}
