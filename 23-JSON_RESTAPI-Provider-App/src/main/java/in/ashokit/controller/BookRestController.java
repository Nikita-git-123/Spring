package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Book;

@RestController
public class BookRestController {

	@GetMapping("/book" )
	public ResponseEntity<Book> getBook() {
		
		Book b = new Book();
		b.setId(101);
		b.setName("REST APIs");
		b.setPrice(1200.00);
		
		return new ResponseEntity<>(b, HttpStatus.OK);
	}
	
	@GetMapping("/books" )
	public ResponseEntity<List<Book>> getBooks() {
		
		Book b1 = new Book();
		b1.setId(101);
		b1.setName("REST APIs");
		b1.setPrice(1200.00);
		
		Book b2 = new Book();
		b2.setId(102);
		b2.setName("JAVA");
		b2.setPrice(1250.00);
		
		Book b3 = new Book();
		b3.setId(103);
		b3.setName("JAVA");
		b3.setPrice(1500.00);
		
		List<Book> asList = Arrays.asList(b1, b2, b3);
		return new ResponseEntity<>(asList, HttpStatus.OK);
	}
}
