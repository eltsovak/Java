package com.syntax.class28;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.setAccountNumber(435823583);
		System.out.println(bank.getAccountNumber());
		
		bank.setBalance(1000);
		System.out.println(bank.getBalance());
	}

}
