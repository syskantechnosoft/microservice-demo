package com.cognizant.moviecatalog.model;

import lombok.Data;

@Data
public class Rating {

	private int id;
	private String imdb_id;
	private double popularity;
	private double vote_average;
}
