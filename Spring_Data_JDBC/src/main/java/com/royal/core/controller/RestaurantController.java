package com.royal.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.royal.core.entity.Restaurant;
import com.royal.core.service.RestaurantService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
	
	private final RestaurantService restaurantService;
	
	public RestaurantController(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	@GetMapping
	public String list(Model model) {
		model.addAttribute("restaurants",restaurantService.listAll());
		return "restaurant_items/items";
	}
	
	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("item", new Restaurant());
		return "restaurant_items/form";
	}
	
	@PostMapping("/save")
	public String save(@Valid @ModelAttribute Restaurant restaurant) {
		restaurantService.save(restaurant);
		return "redirect:/restaurant";
	}
	
	@GetMapping("/view/{id}")
	public String view(@PathVariable int id, Model model) {
		model.addAttribute("item", restaurantService.get(id));
		return "restaurant_items/view";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("item", restaurantService.get(id));
		return "restaurant_items/form";
	}
	
	@PostMapping("/update")
	public String update(@Valid @ModelAttribute Restaurant restaurant) {
		restaurantService.update(restaurant);
		return "redirect:/restaurant";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		restaurantService.deleteById(id);
		return "redirect:/restaurant";
	}
}
