package com.capg.spring.labbook_3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesController {

	@Autowired
	private MoviesService moviesService;

	@PostMapping("/add")
	public Movies addMovie(Movies movie) {
		return moviesService.addMovie(movie); 
	}
	
	@DeleteMapping("/delete/byMovie")
	public void deleteMovie(@RequestBody Movies movie) {
		moviesService.deleteMovie(movie);
	}
	
	@DeleteMapping("/delete/byId/{id}")
	public void deleteMovie(@PathVariable("id") int id) {
		moviesService.deleteMovie(id);
	}
	
	@GetMapping("/listAllMovies")
	public List<Movies> searchAllMovies(){
		return moviesService.searchAllMovies();
	}
	
	@PutMapping("/update")
	public Movies updateMovie(@RequestBody Movies movie) {
		return moviesService.updateMovie(movie);
	}
}
