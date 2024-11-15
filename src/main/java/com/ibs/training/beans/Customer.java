package com.ibs.training.beans;

public class Customer {

	public Customer() {
		System.out.println("in Cusotmer Constructor");
	}
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		System.out.println("in set Account");
		this.account = account;
	}

	Account account;
	
	public void enrol() {
		System.out.println("Enroling account "+account);
	}
	
}
