package com.skilldistillery.brewery.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Breweries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public Breweries() {

	}

	public Breweries(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
