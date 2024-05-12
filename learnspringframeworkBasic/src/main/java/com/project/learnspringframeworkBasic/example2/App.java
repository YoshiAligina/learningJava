package com.project.learnspringframeworkBasic.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.learnspringframeworkBasic.example1.BasicConfiguration;

public class App 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TataMotors motor = context.getBean(TataMotors.class);
		
		motor.config();
	}
}

/*
 * 
 * Layers:
 * - Controller
 * - Service
 * -Repository
 */
*/