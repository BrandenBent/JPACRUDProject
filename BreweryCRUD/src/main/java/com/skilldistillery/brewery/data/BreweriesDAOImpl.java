package com.skilldistillery.brewery.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.brewery.entities.Breweries;

@Transactional
@Service
public class BreweriesDAOImpl implements BreweriesDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Breweries findBreweriesById(int id) {
		return em.find(Breweries.class, id);
	}

	@Override
	public Breweries newBreweries(Breweries brew) {
		em.persist(brew);
		em.flush();
		em.close();
		return brew;

	}

	@Override
	public boolean deleteBreweries(Breweries brew) {
		Breweries brews = em.find(Breweries.class, brew.getId());
		em.remove(brews);
		em.flush();
		em.close();
		return !em.contains(brew);
	}

	@Override
	public List<Breweries> findAllBreweries() {
		String jdql = "SELECT b FROM Breweries b ";
		List<Breweries> brews = em.createQuery(jdql, Breweries.class).getResultList();
		return brews;
	}

	public Breweries update(Integer id, Breweries updateBrew) {

		Breweries brews = em.find(Breweries.class, id);
		brews.setName(updateBrew.getName());
		brews.setAddress(updateBrew.getAddress());
		brews.setProvince(updateBrew.getProvince());
		brews.setZipcode(updateBrew.getZipcode());
		em.persist(brews);
		em.flush();
		em.close();
		return brews;
	}

	@Override
	public boolean addBreweries(Breweries brewery) {
		return false;
	}

}
