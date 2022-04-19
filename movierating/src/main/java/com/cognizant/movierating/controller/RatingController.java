package com.cognizant.movierating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.movierating.model.Rating;
import com.cognizant.movierating.service.RatingService;

@RestController
@RequestMapping("/movies/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable int movieId) {
		return ratingService.getMovieRating(movieId);
	}
}
