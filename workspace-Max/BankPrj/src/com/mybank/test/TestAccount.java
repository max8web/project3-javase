package com.mybank.test;
import com.mybank.domain.Account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acct = new Account (100.0);
		acct.deposit(50.0);
		acct.withdraw(147.0);
		System.out.println("Final account - " + acct.getBalance());
	}

}
