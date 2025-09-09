package com.tnsif.dayfive.multilevelinheritance;
//package com.tnsif.dayfive.MLInheritanceDemo;

public class Country {
	private String countryname;
	private String capital;
	
//	Non parameterized Constructor   // Default Constructor
	public Country() {
		super();
	}

//	Parameterized Constructor 
public Country(String countryname, String capital) {
	super();
	this.countryname = countryname;
	this.capital = capital;
}

//getter/setter method
public String getCountryname() {
	return countryname;
}

public void setCountryname(String countryname) {
	this.countryname = countryname;
}

public String getCapital() {
	return capital;
}

public void setCapital(String capital) {
	this.capital = capital;
}

// tostring method
@Override
public String toString() {
	return "Country [countryname=" + countryname + ", capital=" + capital + "]";
}
	

	
	
}
