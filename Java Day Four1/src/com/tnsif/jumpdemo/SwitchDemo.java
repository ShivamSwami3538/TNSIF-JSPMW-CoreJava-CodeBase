package com.tnsif.jumpdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInputs=1;
		switch(userInputs)
		{
		case 1:
			System.out.println(userInputs + " : Current plan details.");
			break;
			
		case 2: 
			System.out.println(userInputs + " : Offers");
			break;
			
		case 3: 
			System.out.println(userInputs + " : Talk to our customer support persons.");
			break;
			
		case 4: 
			System.out.println(userInputs + " : New plans for you");
			break;
			
			default : 
				System.out.println(" : You had put wrong input");
				break;
		}

	}

}
