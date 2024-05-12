package com.project.bookmgmt.service;

import org.springframework.stereotype.Service;

@Service // Returns business logic
public class BookServiceImpl implements BookService
{

	@Override
	public String getBookMessage() 
	{
		
		
		
		return "Improve your knowledge.";
	}

}
