package com.tnsif.dayfive.multilevelinheritance;

public class City extends State{

	private String cityname;
	private float area;
	
//	Non Parameterized Constructor   // Default Constructor
	public City() {
		super();
	}
	
//	Parameterized Constructor
	public City(String cityname, float area) {
		super();
		this.cityname = cityname;
		this.area = area;
	}
	
//	getter/setter method
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryname()=" + getCountryname() + ", getCapital()="
				+ getCapital() + "]";
	}
	

	
}
