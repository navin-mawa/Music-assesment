package com.qa.springmusician.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springmusician.domain.Musician;
import com.qa.springmusician.service.MusicianService;

@RestController
@RequestMapping("/musician")
@CrossOrigin
public class MusicianController {
	
	
	
	
	private MusicianService service;
@Autowired

public MusicianController(MusicianService service) {
	this.service = service;
	}
	
	
	
	
@GetMapping("/music")
public String music() {
	return "This is all about music";
}
	
@PostMapping("/create")
public ResponseEntity<Musician> create(@RequestBody Musician ms) {
	return new ResponseEntity<Musician>( this.service.create(ms), HttpStatus.CREATED);
}

@GetMapping("/read")
public ResponseEntity<List<Musician>> read() {
	return new ResponseEntity<List<Musician>>(this.service.read(), HttpStatus.OK );
	
}
	
@PutMapping("/replace/{id}")
public ResponseEntity<Musician> update(@PathVariable Long id, @RequestBody Musician ms){
	return new ResponseEntity<Musician>(this.service.update(id, ms), HttpStatus.ACCEPTED);
}
	
@DeleteMapping("/delete/{id}")
public ResponseEntity<Boolean> delete(@PathVariable Long id) {
	return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
}
	

}
