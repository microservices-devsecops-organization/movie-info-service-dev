package br.com.clarobr.movieinfoservice.resources;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clarobr.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId, @RequestHeader HttpHeaders headers) {
//    	headers.forEach((key, value) -> {
//			System.out.println(String.format("##### Header '%s' = %s", key, value));
//	    });
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
    	return new Movie(movieId, "Name for movie with ID " + movieId);
    }

}
