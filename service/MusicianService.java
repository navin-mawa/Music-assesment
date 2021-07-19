package com.qa.springmusician.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.springmusician.domain.Musician;
import com.qa.springmusician.repo.MusicianRepo;

@Service
public class MusicianService {
	
	private MusicianRepo repo;
	
	public MusicianService(MusicianRepo repo) {
		this.repo = repo;
		
	}

	public Musician create(Musician ms) {
		return this.repo.saveAndFlush(ms);
		
	}
	
	public List<Musician> read() {
		return this.repo.findAll();
	}
	
	public Musician update(Long id, Musician newms) {
		
		Musician existing = this.repo.getById(id);
		
		existing.setName(newms.getName());
		existing.setNoOfAwards(newms.getNoOfAwards());
		existing.setBirthPlace(newms.getBirthPlace());
		existing.setYearOfBirth(newms.getYearOfBirth());
		Musician updated = this.repo.save(existing);
		return updated;
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
		
	}
	
}
