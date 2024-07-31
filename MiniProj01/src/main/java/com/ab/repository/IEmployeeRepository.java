package com.ab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ab.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
