package com.company.rest.repository;

import com.company.rest.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    // custom queries
	
	Optional<Medicine> findByName(String name);
	
	List<Medicine> findByPriceGreaterThan(Double price);
}