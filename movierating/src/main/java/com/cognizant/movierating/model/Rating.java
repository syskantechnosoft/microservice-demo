package com.cognizant.movierating.model;

public class Rating {

	private int id;
	private String imdb_id;
	private double popularity;
	private double vote_average;
	private long vote_count;

	public Rating(int id, String imdb_id, double popularity, double vote_average, long vote_count) {
		super();
		this.id = id;
		this.imdb_id = imdb_id;
		this.popularity = popularity;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
	}

	public Rating() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public double getVote_average() {
		return vote_average;
	}

	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}

	public long getVote_count() {
		return vote_count;
	}

	public void setVote_count(long vote_count) {
		this.vote_count = vote_count;
	}

}
