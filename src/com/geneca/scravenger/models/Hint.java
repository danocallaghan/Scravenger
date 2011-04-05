package com.geneca.scravenger.models;

public class Hint extends BaseModel {
	
	public Hint(int id, String description)
	{
		this.id = id;
		this.description = description;
	}
	
	private int id;
	public int getId() { return id; }
	
	private String description;
	public String getDescription() { return description; }
	

}
