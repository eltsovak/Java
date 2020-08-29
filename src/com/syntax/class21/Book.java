package com.syntax.class21;

public class Book {

//	Write program as a Book class   that will have instance variables and 2 Constructors.
//	While creating an object make sure:
//		Instance variables are being initialized
//		Both Constructors are being executed
	
	String name;
	int pages;
	
	public Book () {
		System.out.println("I have a really good book for you to read!");
	}
	
	Book(String name, int pages) {
		this();
		this.name = name;
		this.pages = pages;
		
	}
	
	void displayInfo() {
		System.out.println("The book's name is " + name + ".");
		System.out.println("There are " + pages + " pages in this book.");
	}
	
	
	
	public static void main(String[] args) {
		
		Book n = new Book("Alice in Wonderland", 345);
		n.displayInfo();
		
	}

}

