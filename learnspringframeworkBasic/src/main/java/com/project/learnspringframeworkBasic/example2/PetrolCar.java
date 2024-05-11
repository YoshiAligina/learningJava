package com.project.learnspringframeworkBasic.example2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolCar implements Vehicle
{

	@Override
	public void drive() 
	{
		System.out.println("To Drive TATA Altroz");		
		
	}

}
