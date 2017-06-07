package com.doj.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class HelloSpring4Controller {
	
	@RequestMapping("/hello")  
	 public ModelAndView sayHello() {  
	  String message = "Welcome to Spring 4.0 !!!";  
	  return new ModelAndView("hello", "message", message);  
	 }  
}
