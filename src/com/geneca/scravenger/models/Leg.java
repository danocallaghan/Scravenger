package com.geneca.scravenger.models;

import java.util.List;

public class Leg extends BaseModel {
	private float latitude;
	private float longitude;
	private List<Integer> hintIds;
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
	public List<Integer> getHintIds() {
		return hintIds;
	}
	public void setHintIds(List<Integer> hintIds) {
		this.hintIds = hintIds;
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
