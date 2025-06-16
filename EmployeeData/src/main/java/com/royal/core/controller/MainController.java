package com.royal.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.royal.core.entity.Employee;
import com.royal.core.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class MainController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public String listEmployees(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/add")
	public String addEmployeeForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "employee_form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable int id,Model model) {
		model.addAttribute("employee",employeeService.getEmployeeById(id));
		return "edit_employee_form";
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
	}
}