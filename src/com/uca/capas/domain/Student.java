package com.uca.capas.domain;

public class Student {
	private String name;
	private String lasName;
	private String dDate;
	private String carrer;
	private String exprerience;
	
	
	
	public Student(String name, String lasName, String dDate, String carrer, String exprerience) {
		super();
		this.name = name;
		this.lasName = lasName;
		this.dDate = dDate;
		this.carrer = carrer;
		this.exprerience = exprerience;
	}
	public Student() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	public String getdDate() {
		return dDate;
	}
	public void setdDate(String dDate) {
		this.dDate = dDate;
	}
	public String getCarrer() {
		return carrer;
	}
	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}
	public String getExprerience() {
		return exprerience;
	}
	public void setExprerience(String exprerience) {
		this.exprerience = exprerience;
	}
	
	
}
