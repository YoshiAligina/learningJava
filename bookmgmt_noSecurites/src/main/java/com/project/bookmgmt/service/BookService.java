package com.project.bookmgmt.service;

import java.util.List;

import com.project.bookmgmt.model.BookDetails;
import com.project.booksmgmt.dto.BookDetailsDTO;

public interface BookService 
{
	String getBookMessage();
	
	boolean SaveBookDetails(BookDetailsDTO bookDetailsDto);
	
	List<BookDetails> getAllBookDetails();
	
	boolean updateBookDetails(BookDetailsDTO bookDetailsDto);
	
	BookDetails getBookDetailsById(Integer id);
	
}
