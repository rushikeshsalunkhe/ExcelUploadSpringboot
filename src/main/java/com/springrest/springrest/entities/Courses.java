package com.springrest.springrest.entities;

public class Courses {

	
	private long id;
	
	private String titile;
	
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", titile=" + titile + ", description=" + description + "]";
	}

	public Courses(long id, String titile, String description) {
		super();
		this.id = id;
		this.titile = titile;
		this.description = description;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
