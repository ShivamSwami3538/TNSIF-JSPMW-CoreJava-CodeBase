package com.tnsif.dayfive.multilevelinheritance;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City c = new City();
		c.setCityname("Pune");
		c.setArea(12345.890f);
		c.setStateName("maharashtra");
		c.setLanguage("marathi");
		c.setCountryname("India");
		c.setCapital("Delhi");
		
		System.out.println(c);
	}

}
