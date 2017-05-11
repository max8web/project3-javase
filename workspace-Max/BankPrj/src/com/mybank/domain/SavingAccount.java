package com.mybank.domain;

public class SavingAccount extends Account{
	private double interestRate;
	
	public SavingAccount (double initBalance, double interestRate) {
		super(initBalance);
		this.interestRate = interestRate;
	}
	
	public void accumulateInterest () {
		balance += (balance * (interestRate / 12));
	}
}
