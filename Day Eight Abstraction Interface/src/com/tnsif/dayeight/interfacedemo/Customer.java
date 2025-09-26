package com.tnsif.dayeight.interfacedemo;

public class Customer {
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer() {
		super();
	}
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + "]";
	}
	
	
}
