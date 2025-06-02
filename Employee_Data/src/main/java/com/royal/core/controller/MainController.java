package com.royal.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.royal.core.entity.EmployeeEntity;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@PostMapping("/sent")
	public String employee(@ModelAttribute("emp") EmployeeEntity emp,Model model) {
		model.addAttribute("emp_id",emp.getEmp_id());
		model.addAttribute("name",emp.getName());
		model.addAttribute("first_name",emp.getFirst_name());
		model.addAttribute("last_name",emp.getLast_name());
		model.addAttribute("department",emp.getDepartment());
		model.addAttribute("salary",emp.getSalary());
		model.addAttribute("experience",emp.getExperience());
		model.addAttribute("joining_date",emp.getJoining_data());
		model.addAttribute("date_of_birth",emp.getDate_of_birth());
		model.addAttribute("city",emp.getCity());
		model.addAttribute("state",emp.getState());
		model.addAttribute("country",emp.getCountry());
		model.addAttribute("zip_code",emp.getZip_code());
		return "showEmployee";
	}
}
