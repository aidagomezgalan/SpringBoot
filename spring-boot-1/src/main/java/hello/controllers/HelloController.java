package hello.controllers;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Author;
import hello.model.Book;

import org.springframework.web.bind.annotation.RequestMapping;

//controlador
@RestController
public class HelloController {
	//métodos
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/a")
    public String a() {
        return "Segundo método!";
    }
    
    @RequestMapping("/b")
    public Book b() {
        Book book = new Book("El señor de los gramillos", 20);
        book.setAuthor(new Author("Umberto Eco", 102));
        
       return book;
    }

}