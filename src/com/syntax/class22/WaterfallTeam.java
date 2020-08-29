package com.syntax.class22;

public class WaterfallTeam extends Employee {
	
	public void slowWork() {
		
	}
	
	public static void main(String[] args) {
		
		WaterfallTeam wt = new WaterfallTeam();
		WaterfallTeam.company = "Instagram";
		wt.fullName = "John Snow"; // protected variable is accessible to default
		System.out.println(wt.fullName);
	}

}

