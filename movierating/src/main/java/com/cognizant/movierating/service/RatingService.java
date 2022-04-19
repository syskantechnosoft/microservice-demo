package com.cognizant.movierating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.movierating.model.Rating;

@Service
public class RatingService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	public Rating getMovieRating(int id) {
		return restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+id+"?api_key="+apiKey, Rating.class);
	}

}
