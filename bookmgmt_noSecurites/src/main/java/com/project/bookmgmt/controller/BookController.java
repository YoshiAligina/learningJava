package com.project.bookmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.bookmgmt.model.BookDetails;
import com.project.bookmgmt.service.BookService;
import com.project.booksmgmt.dto.BookDetailsDTO;

@Controller
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/book/message")
	@ResponseBody
	public ResponseEntity<String> getBookMsg() {
		String response = bookService.getBookMessage();
		return ResponseEntity.ok(response);
	}

	@RequestMapping(value = "/book/saveBookDetails", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public boolean saveBookDetails(@RequestBody BookDetailsDTO bookDetailsDto) {

		boolean response = bookService.SaveBookDetails(bookDetailsDto);

		return response;

	}

	@RequestMapping(value = "/book/getAllDetails", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public List<BookDetails> getAllBookDetails() {
		List<BookDetails> bookDetails = bookService.getAllBookDetails();

		return bookDetails;
	}

	@RequestMapping(value = "/book/updateBookDetails", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public boolean updateBookDetails(@RequestBody BookDetailsDTO bookDetailsDto) {
		boolean response = bookService.updateBookDetails(bookDetailsDto);

		return response;
	}

	@RequestMapping(value = "/book/getBookDetailsById", method = {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public BookDetails getBookDetailsById(@RequestParam Integer id)
	{
		BookDetails response = bookService.getBookDetailsById(id);

		return response;
	}

}
