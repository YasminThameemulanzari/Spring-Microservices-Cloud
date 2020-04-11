package com.yasmin.spring.microservices.projects.controller;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yasmin.spring.microservices.projects.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@HystrixCommand(fallbackMethod = "getFallbackCatalog")
	@GetMapping("/{userID}")
	private List<CatalogItem> getRating(@PathVariable("userID") String userID)
	{
		return Collections.singletonList(new CatalogItem("Muthu","Rajini Movie",30));
	}
}
