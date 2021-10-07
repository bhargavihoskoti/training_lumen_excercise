package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.services.BookService;

@RestController
@RequestMapping(path="/api/v1/books")
public class BookController {
	
	private BookService service;
	
	@Autowired
	public void setClient( BookService service) {
		
		 this.service = service;
	}
	
	@GetMapping(path="/{bookId}")
	public Book getBookById(@PathVariable("bookId") int bookId){
		
		
		return this.service.getBookById(bookId);
		
	}
	
	

}
