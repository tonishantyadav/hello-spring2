package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
  @RequestMapping("/hello")
  public ModelAndView hello(ModelAndView mv) {
    mv.setViewName("index");
    return mv;
  }

  @RequestMapping("/add")
  public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView mv) {
    System.out.println("Controller: /add called");

    int result = a + b;

    mv.addObject("result", result);
    mv.setViewName("result");

    return mv;
  }
}