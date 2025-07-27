package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String hello() {
    System.out.println("Controller: /hello called");
    return "index.jsp";
  }
  
  @RequestMapping("add")
  public String add(HttpServletRequest req) {
    System.out.println("Controller: /add called");
    
    int num1 = Integer.parseInt(req.getParameter("num1"));
    int num2 = Integer.parseInt(req.getParameter("num2"));
    
    int result = num1 + num2;
    System.out.println("Result: " + result);
    return "result.jsp";
  }
}