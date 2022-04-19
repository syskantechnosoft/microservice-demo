package com.cognizant.moviedetail.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cognizant.moviedetail.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}") // $ -- EL Symbol - Expression Lang
	private String apiKey;
	
	@GetMapping("/{movieId}")
	public Movie getMovieDetail(@PathVariable int movieId) {
		return restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey, Movie.class);
	}
	
	@GetMapping("/")
	public List<Movie> getMovieDetails () {
		List<Movie> movieList = new ArrayList<Movie>();
		for(int i=500;i<=510;i++) {
			movieList.add(getMovieDetail(i));
		}
		return movieList;
	}
}
