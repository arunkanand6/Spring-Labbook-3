package com.capg.spring.labbook_3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesJpaRepository extends JpaRepository<Movies, Integer> {

	public List<Movies> findByGenre(String genre);
	
}
