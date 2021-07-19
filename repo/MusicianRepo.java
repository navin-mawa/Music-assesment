package com.qa.springmusician.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springmusician.domain.Musician;

@Repository
public interface MusicianRepo extends JpaRepository<Musician, Long> {

}
