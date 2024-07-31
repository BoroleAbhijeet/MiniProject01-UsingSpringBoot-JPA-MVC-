package com.ab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EmployeeOperationsController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
}
