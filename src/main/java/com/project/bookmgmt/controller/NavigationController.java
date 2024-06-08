package com.project.bookmgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

	@GetMapping("/book")
	public String displayBookPage() {

		return "user/book";
	}

}