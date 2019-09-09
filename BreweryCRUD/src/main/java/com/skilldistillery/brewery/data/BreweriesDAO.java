package com.skilldistillery.brewery.data;

import java.util.List;

import com.skilldistillery.brewery.entities.Breweries;

public interface BreweriesDAO {
	public Breweries findBreweriesById(int BreweriesId);

	public List<Breweries> findAllBreweries();

	public Breweries newBreweries(Breweries brewery);
	
	public boolean deleteBreweries(Breweries brewery);
	
	public boolean addBreweries(Breweries brewery);
	
	public Breweries update(Integer id, Breweries updatedBrew);
}
