package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String hello() {
    System.out.println("Controller: /hello called");
    return "index";
  }

  @RequestMapping("/add")
  public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model) {
    System.out.println("Controller: /add called");

    int result = a + b;
    model.addAttribute("result", result);
    System.out.println("Result: " + result);

    return "result";
  }
}