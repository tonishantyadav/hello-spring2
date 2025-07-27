package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String hello() {
    System.out.println("Controller: /hello called");
    return "index.jsp";
  }
  
  @RequestMapping("/add")
  public String add(HttpServletRequest req, HttpSession session) {
    System.out.println("Controller: /add called");
    
    int num1 = Integer.parseInt(req.getParameter("num1"));
    int num2 = Integer.parseInt(req.getParameter("num2"));
    
    int result = num1 + num2;
    session.setAttribute("result", result);
    System.out.println("Result: " + result);
    
    return "result.jsp";
  }
}