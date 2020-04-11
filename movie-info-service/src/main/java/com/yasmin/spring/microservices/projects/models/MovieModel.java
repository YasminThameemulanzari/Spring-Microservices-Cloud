package com.yasmin.spring.microservices.projects.models;

public class MovieModel 

{
	private String movieId;
	private String movieName;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public MovieModel(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "MovieModel [movieId=" + movieId + ", movieName=" + movieName + "]";
	}
	
}
