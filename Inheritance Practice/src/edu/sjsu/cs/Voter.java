package edu.sjsu.cs;

public class Voter extends Person
{
	private int voterId;
	private boolean hasVoted;

	public Voter(String firstName, String lastName, int id, boolean v)
	{
		super(firstName, lastName);
		this.voterId = id;
		this.hasVoted = v;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nID: " + voterId + "\nHas Voted: " + hasVoted;
	}
}
