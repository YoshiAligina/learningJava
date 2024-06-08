package com.project.bookmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bookmgmt.model.BookDetails;

@Repository
public interface BookDetailsRepository extends JpaRepository<BookDetails, Integer> 
{

}
