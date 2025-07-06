package com.company.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.company.rest.entity.Aeroplane;
import com.company.rest.repository.AeroplaneRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AeroplaneService {

	private AeroplaneRepository repository;

	
	public Aeroplane saveAeroplane(Aeroplane aeroplane) {
		return repository.save(aeroplane);
	}
	
	public List<Aeroplane> getAllAeroplane(){
		return repository.findAll();
	}
	
	public Optional<Aeroplane> findAeroplaneById(Long id){
		return repository.findById(id);
	}
	
	public Optional<Aeroplane> findAeroplaneByName(String name){
		return repository.findByName(name);
	}
	
	public List<Aeroplane> getAeroplaneByMake(String make){
		return repository.findByMake(make);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	public Aeroplane update(Long id,Aeroplane aeroplane) {
		return repository.findById(id)
				.map(existing -> {
					existing.setName(aeroplane.getName());
					existing.setMake(aeroplane.getMake());
					existing.setName(aeroplane.getModel());
					return repository.save(existing);
				}).orElseThrow(() -> new RuntimeException("Aeroplane with id" + id + " not found"));
	}
}
