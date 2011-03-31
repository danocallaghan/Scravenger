package com.geneca.scravenger.models;

import java.util.List;

public class Leg {
	private float latitude;
	private float longitude;
	int id;
	private List<Integer> hint_ids;
	private String name;
	private String description;
	
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Integer> getHint_ids() {
		return hint_ids;
	}
	public void setHint_ids(List<Integer> hint_ids) {
		this.hint_ids = hint_ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
