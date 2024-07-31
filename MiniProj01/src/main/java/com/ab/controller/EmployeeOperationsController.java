package com.ab.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ab.model.Employee;
import com.ab.service.IEmployeeMgmtService;



@Controller
public class EmployeeOperationsController {
	
	@Autowired
	private IEmployeeMgmtService empService;
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String, Object> map) {
		Iterable<Employee> emps=empService.getAllEmployees();
		map.put("ampsList", emps);
		return "show_employee_report";
	}
}
