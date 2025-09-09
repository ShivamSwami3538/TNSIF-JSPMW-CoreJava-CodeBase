package com.tnsif.dayfive.multilevelinheritance;

public class State extends Country{

	private String stateName;
	private String language;
	
//	Non Parameterized Constructor   // Default Constructor
	public State() {
		super();
	}
	
//	Parameterized Constructor
	public State(String stateName, String language) {
		super();
		this.stateName = stateName;
		this.language = language;
	}
	
//	getter/setter method
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
//	toString
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
		
	
}
