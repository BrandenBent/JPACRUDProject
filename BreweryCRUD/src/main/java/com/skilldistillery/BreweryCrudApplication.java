package com.skilldistillery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.skilldistillery.brewery.entities")
public class BreweryCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreweryCrudApplication.class, args);
	}

}
