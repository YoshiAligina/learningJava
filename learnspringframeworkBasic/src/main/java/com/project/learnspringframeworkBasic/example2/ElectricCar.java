package com.project.learnspringframeworkBasic.example2;

import org.springframework.stereotype.Component;

@Component
public class ElectricCar implements Vehicle
{

	@Override
	public void drive() 
	{
		System.out.println("To Drive TATA Nexon-EV");		
		
	}

}
