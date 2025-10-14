package com.tnsif.daythirteen.synchronization;

public class Account implements Bank {

	private int accNo;
	private String name;
	private double balance;
	
	//getter and setter
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//to string
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	//non para constaructor 
	public Account() {
		super();
	}
	//para constructor

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) throws DepositLimitException {
		if(amt >25000)
			throw new DepositLimitException("Daily limit Exceeded....");
		else {
			balance += amt;
			System.out.println("Amount Deposited .."+ amt);
		}
		
	}

	@Override
	public synchronized void withdraw(int amt) throws InsufficientBalanceException {
		
		if(balance - amt<MINBAL)
			throw new InsufficientBalanceException();
		else {
			balance =balance-amt;
			System.out.println("After withdrawal Rs: "+ amt +"Current Balnce Rs. "+ balance);
		}
	}

}