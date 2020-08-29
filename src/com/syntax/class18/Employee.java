package com.syntax.class18;

public class Employee {

//	Create a Class called Employee:
//	Create three  variables  eID , salary and set the CEO to “Sumair” 
//	Create two objects of the class Employee 
//	Set the value of eID, salary for each of the objects
//	Print out the eID , salary and  CEO for each of the objects

int eID;
int salary;
static String CEO = "Sumair";
void displayInfo() {
	System.out.println("The CEO of the company is " + CEO + ". Employee's eID is " + eID + " and his salary is " + salary);
}

public static void main(String[] args) {
	
	
	Employee employee1 = new Employee();
	employee1.eID = 245;
	employee1.salary = 1000000;
	employee1.displayInfo();
	
	Employee employee2 = new Employee();
	employee2.eID = 245545;
	employee2.salary = 115000;
	employee2.displayInfo();
	
	
	
	
	
	
}

}

