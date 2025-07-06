package com.company.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.company.rest.entity.Aeroplane;
import com.company.rest.service.AeroplaneService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/aeros")
@AllArgsConstructor
public class AeroplaneController {
	private AeroplaneService service;
	
	@GetMapping
	public List<Aeroplane> getAllAeroplanes(){
		return service.getAllAeroplane();
	}
	
	@PostMapping("/save")
	public Aeroplane saveAeroplane(@RequestBody Aeroplane aeroplane) {
		return service.saveAeroplane(aeroplane);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aeroplane> getAeroplaneById(@PathVariable Long id){
		return service.findAeroplaneById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<Aeroplane> getAeroplaneById(@PathVariable String name){
		return service.findAeroplaneByName(name).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/make/{make}")
	public ResponseEntity<List<Aeroplane>> getAeroplaneByMake(@PathVariable String make){
		List<Aeroplane> aeroplanes = service.getAeroplaneByMake(make);
		return ResponseEntity.ok(aeroplanes);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Aeroplane> updateAeroplane(@PathVariable Long id,@RequestBody Aeroplane aeroplane){
		try {
			return ResponseEntity.ok(service.update(id, aeroplane));
		}catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAeroplane(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
