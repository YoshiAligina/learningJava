package com.project.traditional;

public class Contact
{
	public String name() 
	{
		return "yoshi!";
	}

	
	public int age() 
	{
		return 19;
	}
	
	public static void main (String[] args)
	{
		Contact contact = new Contact();
		
		String name = contact.name();
		int age = contact.age();		
		
		System.out.println("name = "+ name);
		System.out.println("age = "+ age);		
	}
}
