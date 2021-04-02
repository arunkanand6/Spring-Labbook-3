package com.capg.spring.labbook_3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {

	@Autowired
	private MoviesJpaRepository moviesJpa;
	
	public Movies addMovie(Movies movie) {
		return moviesJpa.save(movie); 
	}
	
	public void deleteMovie(Movies movie) {
		moviesJpa.delete(movie);
	}
	
	public void deleteMovie(int id) {
		moviesJpa.deleteById(id);
	}
	
	public List<Movies> searchAllMovies(){
		return moviesJpa.findAll();
	}
	
	public Movies updateMovie(Movies movie) {
		return moviesJpa.save(movie);
	}
}
