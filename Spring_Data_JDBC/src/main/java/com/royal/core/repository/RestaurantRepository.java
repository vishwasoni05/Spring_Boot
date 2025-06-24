package com.royal.core.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.royal.core.entity.Restaurant;

@Repository
public class RestaurantRepository {
	
	private final JdbcTemplate jdbcTemplate;
	
	public RestaurantRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	private final RowMapper<Restaurant> rowMapper = (rs,rowNum) -> {
		Restaurant restaurant = new Restaurant();
		restaurant.setId(rs.getInt("id"));
		restaurant.setName(rs.getString("name"));
		restaurant.setLocation(rs.getString("location"));
		restaurant.setCuisineType(rs.getString("cuisineType"));
		restaurant.setAverageRating(rs.getDouble("averageRating"));
		restaurant.setOpen(rs.getBoolean("isOpen"));
		
		return restaurant;
	};
	
	public List<Restaurant> findAll(){
		return jdbcTemplate.query("SELECT * FROM restaurant", rowMapper);
	}
	
	public Restaurant findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM restaurant WHERE id = ?", rowMapper, id);
	}
	
	public void save(Restaurant restaurant) {
		jdbcTemplate.update("INSERT INTO restaurant (name, location, cuisineType,averageRating,isOpen) VALUES (?, ?, ?, ?, ?)",restaurant.getName(),restaurant.getLocation(),restaurant.getCuisineType(),restaurant.getAverageRating(),restaurant.isOpen());
	}
	
	public void update(Restaurant restaurant) {
		jdbcTemplate.update("UPDATE restaurant SET name = ?, location = ?, cuisineType = ?, averageRating = ?, isOpen = ? WHERE id = ?", restaurant.getName(),restaurant.getLocation(),restaurant.getCuisineType(),restaurant.getAverageRating(),restaurant.isOpen(),restaurant.getId());
	}
	
	public void deleteById(int id) {
		jdbcTemplate.update("DELETE FROM restaurant WHERE id = ?", id);
	}
}
