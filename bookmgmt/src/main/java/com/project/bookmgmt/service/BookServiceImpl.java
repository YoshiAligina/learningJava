package com.project.bookmgmt.service;

import java.util.List;
import java.util.Optional;

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

	public List<BookDetails> getAllBookDetails() {
		List<BookDetails> bookDetails = bookDetailsRepository.findAll();
		return bookDetails;
	}

	public boolean updateBookDetails(BookDetailsDTO bookDetailsDto) {
		try {
			Optional<BookDetails> bookDetails = bookDetailsRepository.findById(bookDetailsDto.getId());

			bookDetails.get().setBookName(bookDetailsDto.getBookName());
			bookDetails.get().setPrice(bookDetailsDto.getPrice());
			bookDetails.get().setRemarks(bookDetailsDto.getRemarks());
			bookDetailsRepository.save(bookDetails.get());

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public BookDetails getBookDetailsById(Integer id) 
	{
		Optional<BookDetails> response = bookDetailsRepository.findById(id);

		
		return response.get();
	}
}
