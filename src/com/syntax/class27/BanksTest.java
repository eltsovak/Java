package com.syntax.class27;

public class BanksTest {

public static void main(String[] args) {
		
		Mortgage pnc = new PNC();
		pnc.giveMortgage();
		Trustable pnc1 = new PNC();
		pnc1.trust();
		Investments pnc2 = new PNC();
		pnc2.doInvestments();
		Bank pnc3 = new PNC();
		pnc3.deposit();
		pnc3.withdraw();
		
		Mortgage bofa = new BofA();
		bofa.giveMortgage();
		Trustable bofa1 = new BofA();
		bofa1.trust();
		Investments bofa2 = new BofA();
		bofa2.doInvestments();
		Bank bofa3 = new BofA();
		bofa3.deposit();
		bofa3.withdraw();
		 
		
		 
		
		
	}

}

