package com.skilldistillery.brewery.entities;


import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class BreweriesTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Breweries breweries;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("BreweryPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		breweries = em.find(Breweries.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.clear();
		breweries = null;
	}

	@Test
	@DisplayName("testing entity mapping")
	void test_Breweries_entity_mapping() {
//		assertNotNull(breweries.getId());
		assertEquals(2, breweries.getId());
	
	}

}
