package com.project.learnspringframeworkBasic.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TataMotors 
{
	@Autowired // Dependency Injection implicitly.
	Vehicle vehicle;  //Loosely coupled.

	public Vehicle getVehicle() // ALT SHIFT S to generate
	{
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public void config()
	{
		System.out.println("Tata Motors");
		
		vehicle.drive();
	}
	
}
