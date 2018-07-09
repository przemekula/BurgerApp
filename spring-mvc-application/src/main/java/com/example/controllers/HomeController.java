package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;

@Controller
@RequestMapping("/")
public class HomeController {

	
	
	
	@RequestMapping(method=RequestMethod.GET)
	 public String home(){
	
	  
	  return ("redirect:/user/list");
	 }
}
