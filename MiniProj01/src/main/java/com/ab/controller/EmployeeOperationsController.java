package com.ab.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ab.model.Employee;
import com.ab.service.IEmployeeMgmtService;

import jakarta.servlet.http.HttpSession;

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
		Iterable<Employee> emps = empService.getAllEmployees();
		map.put("empsList", emps);
		return "show_employee_report";
	}

	@GetMapping("/emp_add")
	public String showFormPageToSaveEmployee(@ModelAttribute("emp") Employee emp) {
		return "register_employee";
	}

	/*
	 * @PostMapping("/emp_add")// here we will get repetition problem after
	 * refreshing public String saveEmployee(Map<String, Object>
	 * map,@ModelAttribute("emp") Employee emp) { String
	 * msg=empService.registerEmployee(emp); Iterable<Employee>
	 * itEmps=empService.getAllEmployees(); map.put("resultMsg", msg);
	 * map.put("empsList", itEmps); return "show_employee_report"; }
	 */

	/*
	 * @PostMapping("/emp_add") //solution 1 using PRG(PostRedirectGet)
	 * //limitation: result msg generated will not be displayed public String
	 * saveEmployee(Map<String, Object> map,@ModelAttribute("emp") Employee emp) {
	 * String msg=empService.registerEmployee(emp); map.put("resultMsg", msg);
	 * return "redirect:emp_report"; }
	 */

	
	  @PostMapping("/emp_add") //solution 2: (Best) Using PRG- Using flash attribute of RedirectAttribute Object 
	  public String saveEmployee(RedirectAttributes attrs,@ModelAttribute("emp") Employee emp) {
	  String msg=empService.registerEmployee(emp);
	  attrs.addFlashAttribute("resultMsg" ,msg);
	  return "redirect:emp_report"; }
	 

	/*
	 * @PostMapping("/emp_add")// If u want to see generated msg after refreshing
	 * also then we need HttpSessoin object public String saveEmployee(HttpSession
	 * ses,@ModelAttribute("emp") Employee emp) { String
	 * msg=empService.registerEmployee(emp); ses.setAttribute("resultMsg", msg);
	 * return "redirect:emp_report"; }
	 */
}
