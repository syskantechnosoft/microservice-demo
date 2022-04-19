package com.cognizant.moviecatalog.model;

import lombok.Data;

@Data
public class MovieCatalog {
	
	private int id;
	private String imdbId;
	private String name;
	private double rating;
	private double voteAverage;

}
