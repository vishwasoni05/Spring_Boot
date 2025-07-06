package com.company.rest.entity;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "meds")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotNull(message = "name is mandatory")
	private String name;
	
	@Column(nullable = false)
	@DecimalMin(value = "100",message = "min-value constarint violated")
	private double price;
	
	@Column(nullable = false)
	@NotNull(message = "expiry date is mandatory")
	private Date expiryDate;
	
}
