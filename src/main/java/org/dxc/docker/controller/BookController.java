package org.dxc.docker.controller;


import org.dxc.docker.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	
	@RequestMapping("/book")
	public Book showBookDetails() {
		Book book=new Book(100,"java","khanna");
		book.getBookId();
		book.getBookName();
		book.getPublisher();
		return book;
	}
}
