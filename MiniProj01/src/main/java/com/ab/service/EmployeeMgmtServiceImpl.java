package com.ab.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ab.model.Employee;
import com.ab.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeRepository empRepo;
	@Override
	public Iterable<Employee> getAllEmployees() {

		return empRepo.findAll();
	}
	
	@Override
	public String registerEmployee(Employee emp) {
		
		return "employee is saved with id value: "+empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeByNo(int eno) {
		Employee emp= empRepo.findById(eno).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
		return emp;
	}
	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is updated with having id value ::"+empRepo.save(emp).getEmpno();
	}
}
