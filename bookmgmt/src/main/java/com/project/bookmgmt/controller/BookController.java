package com.project.bookmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.bookmgmt.service.BookService;

@Controller
public class BookController 
{
	@Autowired
	BookService bookService;
	
	@GetMapping("/book/message")
	@ResponseBody
	public ResponseEntity<String> getBookMsg()
	{
		String response = bookService.getBookMessage();
		return ResponseEntity.ok(response);
	}
}
