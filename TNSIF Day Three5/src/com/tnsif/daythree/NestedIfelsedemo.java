package com.tnsif.daythree;

public class NestedIfelsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nested Loop means Loop inside another Loops. Query inside 2nd query.
		int a=10, b=20, c=5;
		System.out.println("The largest Number is: ");
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {		
		if(c>b) {
			System.out.println(c);
		} else {
			System.out.println(b);
		  }
		} 
		
		
//		String correctUsername = "Shivam";
//        String correctPassword = "12345";
//        "Ganesh", "Atul"
		String username1, username2, username3;
		username1="Shivam"; 
		username2="Ganesh";
		username3="Atul";
//		int a1=3344, b2=1122, c3= 2233;
		String password1, password2, password3;
		password1="3344";
		password2="1122";
		password3="2233";
		
//		System.out.println("The largest Number is: ");
//		
//		if(username==Shivam3344) {
//		    {
//				System.out.println("You are logged in successfully");
//			} else {
//				System.out.println("Username is Wrong.");
//			}
//		} else {		
//			if(c>b) {
//				System.out.println(c);
//			} else {
//				System.out.println(b);
//			}       
//		} 
        
//        System.out.println("Enter Username: ");
        
        
//        if(correctUsername==correctUsername)
//        {
//        	System.out.println("Username correct.");
//        } 
//        else 
//        {
//        	System.out.println("Username Incorrect");
//        }
		
		if(username1=="Ganesh") 
		{
			if(username2=="Shivam")
			{
				if(username3=="Atul")
				{
					System.out.println("Username correct Logged in Successfully.");
				}
				else
				{
					System.out.println("Wrong Username.");
				}
			}	
		}
		else 
		{
			if(password1=="1122")
			{
				if(password2=="2233")
				{
					if(password3=="3344")
					{
						System.out.println("Password Correct Logged in Successfully.");
					}
					else
					{
						System.out.println("Wrong Password.");
					}	
				}				
			}
		}
		System.out.println("Failed to Login, Please Print the correct Username & Password");
		
				
	}

}

// Program Without using Scanner class object - Username & Password Login Program