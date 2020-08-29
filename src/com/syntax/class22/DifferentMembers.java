package com.syntax.class22;

public class DifferentMembers extends ScrumTeam{
	
	String productOwner = "Product Owner";
	String scrumMaster = "Scum Master";
	String developer = "Developer";
	String tester = "Tester";
	String businessAnalyst = "Business Analyst";

	void communicate() {
		System.out.println(productOwner + " should communicate with the team");
	}
	
	void prioritizePb() {
		System.out.println(productOwner + " is prioritizing Pb");
	}
	
	void shieldTeam() {
		System.out.println(scrumMaster + " is the shield for the team");
	}
	
	void doMeetings() {
		System.out.println(scrumMaster + " is the one who is arrenging meetings");
	}
	
	void code() {
		System.out.println(developer + " is writing a code");
	}
	
	void test() {
		System.out.println(tester + " is tedting the code");
	}
	
	void gatherRequirements() {
		System.out.println(businessAnalyst + " is the one who gathers all the requirements for the project");
	}
	
}
