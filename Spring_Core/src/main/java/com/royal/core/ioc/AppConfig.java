package com.royal.core.ioc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name="f1")
	public Food food1() {
		return new Food(1,"Pizza",500); 
	}
	
	@Bean(name="f2")
	public Food food2() {
		return new Food(2,"Shake",250); 
	}
	
	@Bean(name="p1")
	public  Places place1() {
		return new Places(1, "Rajasthan", new ArrayList<>(Arrays.asList("Jaipur","Udaipur","Jesalmer")));
	}
	
	@Bean(name="p2")
	public  Places place2() {
		return new Places(1, "Mumbai", new ArrayList<>(Arrays.asList("Gateway of Indai","Shree Siddhivinayak Temple","Chhatrapati Shivaji Maharaj Terminus","EsselWorld")));
	}
	
}