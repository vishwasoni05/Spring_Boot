package com.company.rest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aeros")
public class Aeroplane {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "name is mandatory")
	private String name;
	
	@Column(nullable = false)
	@NotNull(message = "make is mandatory")
	private String make;
	
	@Column(nullable = false)
	@NotNull(message = "model is mandatory")
	private String model;
}
