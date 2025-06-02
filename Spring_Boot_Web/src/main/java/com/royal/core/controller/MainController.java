package com.royal.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.royal.core.entity.UserEntity;



@Controller
public class MainController {
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/send")
	public String sendData() {
		return "user";
	}
	
	@PostMapping("/sent")
	public String getData(@ModelAttribute("user") UserEntity user,Model model) {
		model.addAttribute("id",user.getId());
		model.addAttribute("name",user.getName());
		model.addAttribute("email",user.getEmail());
		model.addAttribute("password",user.getPassword());
		
		return "showUser";
	}
}
