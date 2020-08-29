package com.syntax.class27;

abstract class Mortgage{
	
	protected abstract void giveMortgage();
} 

public interface Trustable {
	
	void trust();
}
interface Investments {
	
	void doInvestments();
}

interface Bank extends Trustable {
	
	void deposit();
	void withdraw();

}
class PNC extends Mortgage implements Bank, Investments{
	
	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}
	
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}
	
	public void trust() {
		System.out.println("You can trust PNC with your money");
	}
	
	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}
	
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
}

class BofA extends Mortgage implements Bank, Investments{
	
	public void deposit() {
		System.out.println("Bank of America takes deposits");
	}
	
	public void withdraw() {
		System.out.println("Bank of America gives you your money");
	}
	
	public void trust() {
		System.out.println("You can trust Bank of America with your money");
	}
	
	public void giveMortgage() {
		System.out.println("Bank of America gives mortgage");
	}
	
	public void doInvestments() {
		System.out.println("You can invest your money with Bank of America");
	}
	
}
