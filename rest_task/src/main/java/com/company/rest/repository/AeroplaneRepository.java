package com.company.rest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.rest.entity.Aeroplane;


@Repository
public interface AeroplaneRepository extends JpaRepository<Aeroplane, Long>{
	
	Optional<Aeroplane> findByName(String name);
	
	List<Aeroplane> findByMake(String make);
}
