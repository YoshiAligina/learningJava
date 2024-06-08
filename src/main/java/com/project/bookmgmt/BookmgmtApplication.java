package com.project.bookmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.project.bookmgmt.repository")
public class BookmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmgmtApplication.class, args);
	}

}
