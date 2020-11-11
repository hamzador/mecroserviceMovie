package org.tem.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.tem.entities.CatalogIthem;
import org.tem.entities.Movie;
import org.tem.entities.UserRaiting;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//private WebClient.Builder webClientBuilder;
	
	
	@RequestMapping("/{userId}")
	List<CatalogIthem> getCatalog(@PathVariable("userId") String userId){
		
		
		WebClient.Builder builder = WebClient.builder(); 
		
		UserRaiting raitings = restTemplate.getForObject("http://localhost:7000/raitingsdata/user/"+userId, UserRaiting.class );
			
		return raitings.getUserRaiting().stream().map(rating -> {
			//For each movie ID, call movie info service and get details 
			Movie movie = restTemplate.getForObject("http://localhost:6700/movie/"+rating.getMovieId(), Movie.class );	
			//pull them all together 
			return new CatalogIthem(movie.getName(), "description filed", rating.getRaiting());
		 }).collect(Collectors.toList());
		
		
		
		
		
		//return Collections.singletonList(
			//	new CatalogIthem("transformes", "description filed", 4));
		 
	}
}
//WebClientBuilder (method------- 2)
/*
  Movie movie = webClientBuilder.build()

	.get()
	.uri("http://localhost:6700/movie/"+rating.getMovieId())//the url that you need to access
	.retrieve()
	.bodyToMono(Movie.class)//converted of an instance of this. Mono means not now but it will come (this is the asynchronous method )
	.block()

	; */ //all of this give me instance of Movie