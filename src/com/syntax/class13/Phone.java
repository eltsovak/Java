package com.syntax.class13;

public class Phone {


	String operatingSystemOfPhone;
	String modelOfPhone;
	String colorOfPhone;
	int yearOfPhone;
	int memoryOfPhone;
	
	void call () {
		System.out.println(operatingSystemOfPhone + " phone can used for making and receiving calls");
	}
	void photo () {
		System.out.println(operatingSystemOfPhone + " phone can make photos ans videos");
	}
	void music () {
		System.out.println(operatingSystemOfPhone + " phone can play music");
	}
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.operatingSystemOfPhone = "iPhone";
		phone1.modelOfPhone = "11 Pro";
		phone1.colorOfPhone = "Space Grey";
		phone1.yearOfPhone = 2019;
		phone1.memoryOfPhone = 264;
		
		System.out.println("The mobile operating system of the phone is " + phone1.operatingSystemOfPhone + " , the model is " +
		phone1.modelOfPhone + " and it is in " + phone1.colorOfPhone + " color. It has " +
				phone1.memoryOfPhone + " GBs of memory and was reliesed in " + phone1.yearOfPhone);
		
		phone1.call();
		phone1.photo();
		phone1.music();
		
		System.out.println("----");
		Phone phone2 = new Phone();
		phone2.operatingSystemOfPhone = "Android";
		phone2.modelOfPhone = "Samsung Note II";
		phone2.colorOfPhone = "Black";
		phone2.yearOfPhone = 2019;
		phone2.memoryOfPhone = 192;
		
		System.out.println("The make of phone is " + phone2.operatingSystemOfPhone + " , the model is " +
		phone2.modelOfPhone + " and it is in " + phone2.colorOfPhone + " color. It has " +
				phone2.memoryOfPhone + " GBs of memory and was reliesed in " + phone2.yearOfPhone);
		
		phone2.call();
		phone2.photo();
		phone2.music();
		
		System.out.println("----");
		Phone phone3 = new Phone();
		phone3.operatingSystemOfPhone = "Nokia";
		phone3.modelOfPhone = "5200";
		phone3.colorOfPhone = "Red and White";
		phone3.yearOfPhone = 2006;
		phone3.memoryOfPhone = 2;
		
		System.out.println("The make of phone is " + phone3.operatingSystemOfPhone + " , the model is " +
		phone3.modelOfPhone + " and it is in " + phone3.colorOfPhone + " color. It has " +
				phone3.memoryOfPhone + " GBs of memory and was reliesed in " + phone3.yearOfPhone);
		
		phone3.call();
		phone3.photo();
		phone3.music();
		
		
	}
	

}

