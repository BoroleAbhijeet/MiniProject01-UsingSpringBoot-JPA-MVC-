package com.ab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
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

}
