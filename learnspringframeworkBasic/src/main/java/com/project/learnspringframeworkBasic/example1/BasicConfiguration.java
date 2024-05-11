package com.project.learnspringframeworkBasic.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // Source of bean defination
public class BasicConfiguration 
{
	@Bean
	public String name() 
	{
		return "yoshi!";
	}

	@Bean
	public int age() 
	{
		return 19;
	}
}
