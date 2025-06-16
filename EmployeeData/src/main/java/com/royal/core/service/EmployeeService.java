package com.royal.core.service;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royal.core.entity.Employee;
import com.royal.core.repository.EmployeeRepository;

@Service
public class EmployeeService {
	 
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return  employeeRepository.findAll();
	}
	
	public void saveEmployee(Employee entity) {
		employeeRepository.save(entity);
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}
	
	public void updateEmployee(Employee entity) {
		employeeRepository.update(entity);
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.delete(id);
	}
	
	
}
