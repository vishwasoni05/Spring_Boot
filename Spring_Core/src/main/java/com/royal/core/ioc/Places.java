package com.royal.core.ioc;

import java.util.ArrayList;

public class Places {
  int id;
  String name;
  ArrayList<String> t_places;
public Places(int id, String name, ArrayList<String> t_places) {
	super();
	this.id = id;
	this.name = name;
	this.t_places = t_places;
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
public ArrayList<String> getT_places() {
	return t_places;
}
public void setT_places(ArrayList<String> t_places) {
	this.t_places = t_places;
}

@Override
public String toString() {
	return "Places [id=" + id + ", name=" + name + ", t_places=" + t_places + "]";
}
  
  
  
}