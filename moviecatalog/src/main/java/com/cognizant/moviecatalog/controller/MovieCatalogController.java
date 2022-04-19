package com.cognizant.moviecatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cognizant.moviecatalog.model.Movie;
import com.cognizant.moviecatalog.model.MovieCatalog;
import com.cognizant.moviecatalog.model.Rating;

@RestController
@RequestMapping("/moviecatalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{id}")
	public MovieCatalog getMovieCatalog(@PathVariable int id) {

		Movie movie = restTemplate.getForObject("http://moviedetailservice/movies/" + id, Movie.class);
		Rating rating = restTemplate.getForObject("http://movieratingservice/movies/rating/" + id, Rating.class);

		MovieCatalog movieCatalog = new MovieCatalog();
		movieCatalog.setId(id);
		movieCatalog.setImdbId(movie.getImdb_id());
		movieCatalog.setName(movie.getTitle());
		movieCatalog.setRating(rating.getVote_average());
		movieCatalog.setVoteAverage(rating.getPopularity());

		return movieCatalog;
	}
}
