package com.project.learnspringframeworkBasic.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasic 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasicConfiguration.class);
		System.out.println("Using Spring Concepts");
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
	}
}

/* 
@ComponentScan:

1. Instructs spring where to look for classes annotated with @Component
2. basePackages: parameter of @ComponentScan

@Component:
- Register as a class as being managed by Spring
*/