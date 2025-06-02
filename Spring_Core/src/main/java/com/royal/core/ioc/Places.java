package com.royal.core.ioc;

import java.util.ArrayList;

public class Places {
	int id;
	String name;
	ArrayList<String> tourist_places;
	public Places(int id, String name, ArrayList<String> tourist_places) {
		super();
		this.id = id;
		this.name = name;
		this.tourist_places = tourist_places;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getTourist_places() {
		return tourist_places;
	}
	public void setTourist_places(ArrayList<String> tourist_places) {
		this.tourist_places = tourist_places;
	}
	@Override
	public String toString() {
		return "Places [id=" + id + ", name=" + name + ", tourist_places=" + tourist_places + "]";
	}
	
	
}
