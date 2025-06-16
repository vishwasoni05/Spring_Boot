package com.royal.core.entity;

import lombok.Data;

@Data
public class Employee {
	private int emp_id;
	private String name;
	private String first_name;
	private String last_name;
	private String department;
	private double salary;
	private int experience;
	private String joining_data;
	private String date_of_birth;
	private String city;
	private String state;
	private String country;
	private int zip_code;
}