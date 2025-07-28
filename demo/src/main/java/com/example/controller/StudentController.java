package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.student.Student;

@Controller
public class StudentController {
  // ModelAttribute use on function level
  @ModelAttribute("course")
  public String getCourse() {
    return "Java";
  }

  @RequestMapping("/student")
  public ModelAndView student(ModelAndView mv) {
    System.out.println("Controller: /student called");
    mv.setViewName("studentForm");
    return mv;
  }

  // ModelAttribute use on Controller level

  // This can be:
  // @RequestMapping("/studentDetails")
  // public String StudentDetails(@ModelAttribute("student") Student student) {
  //   System.out.println("Controller: /studentDetails called");
  //   return "studentDetails";
  // }

  // Writen as this: More clean
  @RequestMapping("/studentDetails")
  public String StudentDetails(Student student) {
    System.out.println("Controller: /studentDetails called");
    return "studentDetails";
  }
}
