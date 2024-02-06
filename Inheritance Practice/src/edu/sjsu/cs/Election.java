package edu.sjsu.cs;

import java.util.ArrayList;

public class Election
{
	private ArrayList<Candidate> candidateList;
	private ArrayList<Voter> voterList;

	public Election()
	{
		this.candidateList = new ArrayList<Candidate>();
		this.voterList = new ArrayList<Voter>();
	}

	public void addCandidate(Candidate c)
	{
		candidateList.add(c);
	}
	public void addVoter(Voter v)
	{
		voterList.add(v);
	}

	public void castVotes()
	{
		for(Voter v : voterList)
		{

		}
	}
}
