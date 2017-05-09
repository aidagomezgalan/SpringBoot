package movies.controllers;

import movies.model.Director;
import movies.model.Movie;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//controlador
@RestController
public class MoviesController {
	
	List<Movie> movies = new ArrayList<>();
	
	public MoviesController() {
		Movie movie1 = new Movie ("Kill Bill", 18);
		movie1.setDirector (new Director ("Quentin Tarantino", 54, 0));
        
		Movie movie2 = new Movie ("300", 18);
		movie2.setDirector (new Director ("Zack Snyder", 51, 1));
        
        movies.add(movie1);
        movies.add(movie2);
    }
	
	//métodos
    @RequestMapping("/")
    public String index() {
        return "Movies Powered by Spring Boot!";
    }
    
    @RequestMapping(value="/getMovie")
    public Object getMovie (@ModelAttribute(name="idx") int idx) {
        Movie movie = movies.size() > idx?movies.get(idx): null;
        
       if(movie==null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        
       return movie;
    }

}