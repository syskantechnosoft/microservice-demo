package com.cognizant.moviedetail.model;

import java.sql.Date;

public class Movie {

	private int id;
	private String imdb_id;
	private String title;
	private String tagline;
	private Date release_date;

	public Movie(int id, String imdb_id, String title, String tagline, Date release_date) {
		super();
		this.id = id;
		this.imdb_id = imdb_id;
		this.title = title;
		this.tagline = tagline;
		this.release_date = release_date;
	}

	public Movie() {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

}
