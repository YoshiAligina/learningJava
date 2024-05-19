package com.project.bookmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bookmgmt.model.BookDetails;
import com.project.bookmgmt.repository.BookDetailsRepository;
import com.project.booksmgmt.dto.BookDetailsDTO;

@Service // Returns business logic
public class BookServiceImpl implements BookService {

	@Autowired
	BookDetailsRepository bookDetailsRepository;

	@Override
	public String getBookMessage() {

		return "Improve your knowledge.";
	}

	@Override
	public boolean SaveBookDetails(BookDetailsDTO bookDetailsDto) {

		try {
			BookDetails bookDetails = new BookDetails();

			bookDetails.setBookName(bookDetailsDto.getBookName());
			bookDetails.setPrice(bookDetailsDto.getPrice());
			bookDetails.setRemarks(bookDetailsDto.getRemarks());
			bookDetails.setId(bookDetailsDto.getId());

			bookDetailsRepository.save(bookDetails);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<BookDetails> getAllBookDetails()
	{
		List<BookDetails> bookDetails = bookDetailsRepository.findAll();
		return bookDetails;
	}
}
