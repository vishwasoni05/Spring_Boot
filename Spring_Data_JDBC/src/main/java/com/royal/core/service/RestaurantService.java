package com.royal.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.royal.core.entity.Restaurant;
import com.royal.core.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	private final RestaurantRepository repository;
	
	public RestaurantService(RestaurantRepository repository) {
		this.repository = repository;
	}
	
	public List<Restaurant> listAll(){
		return repository.findAll();
	}
	
	public Restaurant get(int id) {
		return repository.findById(id);
	}
	
	public void save(Restaurant restaurant) {
		repository.save(restaurant);
	}
	
	public void update(Restaurant restaurant) {
		repository.update(restaurant);
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
