package com.syntax.class24;

public class CreditCardTest {

	public static void main(String[] args) {
		
		CreditCard cc = new CreditCard(450);
		System.out.println(cc.calculateInterest());
		
		
		Visa visa = new Visa(700);
		System.out.println(visa.calculateInterest());
		
		AX ax = new AX(670);
		System.out.println(ax.calculateInterest());
	}

}

