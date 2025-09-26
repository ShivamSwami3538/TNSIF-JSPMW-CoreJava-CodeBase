package com.tnsif.dayeight.interfacedemo;

public class SavingAccount extends Customer implements Bank {
	
	private int accNO;
	private float balance;
	
	

	public SavingAccount(String name, String city, int accNO, float balance) {
		super(name, city);
		this.accNO = accNO;
		this.balance = balance;
	}
	
	

	public int getAccNO() {
		return accNO;
	}



	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}


	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount < 0 || amount > Deposit_Limit) {
			System.out.println("Please deposit valid amount");
		} else {
			balance += amount;
			System.out.println("Rs:" + amount + " is deposited Successfully.");
		}
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount < balance-MINBAL) {
			balance -= amount;
			System.out.println("Rs:" + amount + " withdraw is Successfully");
		} else {
			System.out.println("Insufficient Balance");
		}
	}



	@Override
	public String toString() {
		return "SavingAccount [accNO=" + accNO + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	

}
