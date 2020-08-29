package com.syntax.class28;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setSalary(100000);
		double salary = emp.getSalary();
		System.out.println(salary);
		
		emp.setAge(1);// if 1 --> output will be 0, bc didn't pass validation (if age > 16)
		System.out.println(emp.getAge());
		
		emp.setEmpID(120);
		System.out.println(emp.getEmpId());
		
		emp.ssn = 4767656759l;
		
	}


}
