package edu.sjsu.cs;

public class Candidate extends Person
{
	private int candidateId;
	private String party;

	public Candidate(String firstName, String lastName, int id, String p)
	{
		super(firstName, lastName);
		this.candidateId = id;
		this.party = p;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nID: " + candidateId + "\nParty: " + party;
	}
}
