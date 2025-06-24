package com.royal.core.entity;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	
	@Id
	private int id; 
	
	@NotBlank(message = "Restaurant name must not be blank")
	@Size(max = 100, message = "Restaurant name must not exceed 100 characters")
    private String name;   
    
	@NotBlank(message = "Location must not be blank")
	@Size(max = 100, message = "Location must not exceed 100 characters")
    private String location;  
    
	@NotBlank(message = "Cuisine Type must not be blank")
	@Size(max = 50, message = "Cuisine Type must not exceed 50 characters")
    private String cuisineType;   
    
    private double averageRating;   
    
    private boolean isOpen;             
    
}
