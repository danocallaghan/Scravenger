package com.geneca.scravenger.models;

public final class Hint extends BaseModel {
	
	public Hint(int id, String description)
	{
		this.id = id;
		this.description = description;
	}
	
	private final int id;
	public int getId() { return id; }
	
	private final String description;
	public String getDescription() { return description; }
	

}
