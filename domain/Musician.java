package com.qa.springmusician.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 @Entity
 public class Musician {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	private int noOfAwards;
	private String birthPlace;
	private int yearOfBirth;
	
	
	public Musician() {}
	
	public Musician(String name, int noOfMusician, String birthPlace, int yearOfBirth) {
		this.name = name;
		this.noOfAwards = noOfMusician;
		this.birthPlace = birthPlace;
		this.yearOfBirth = yearOfBirth;
		}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfAwards() {
		return noOfAwards;
	}
	public void setNoOfAwards(int noOfMusician) {
		this.noOfAwards = noOfMusician;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	

}
