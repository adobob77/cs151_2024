package edu.sjsu.cs;

public class Person
{
	protected String firstName, lastName;

	public Person()
	{
		this.firstName = "";
		this.lastName = "";
	}

	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName()
	{
		return firstName + " " + lastName;
	}

	public void setFirstName(String n)
	{
		this.firstName = n;
	}

	public void setLastName(String n)
	{
		this.lastName = n;
	}

	public String toString()
	{
		return "Name: " + firstName + " " + lastName;
	}
}