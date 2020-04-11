package com.yasmin.spring.microservices.projects.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yasmin.spring.microservices.projects.models.MovieModel;

@RestController
@RequestMapping("/movies")
public class MovieInfoController 
{

	@GetMapping("/{movieId}")
	private MovieModel getMovie(@PathVariable ("movieId") String movieID)
	{
		return new MovieModel ("100","Transformer");
	}
}
