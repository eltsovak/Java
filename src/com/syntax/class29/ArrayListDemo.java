package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// Let' create an ArrayList that will store numbers
		
		 ArrayList<Integer> alist= new ArrayList<>();
		alist.add(100);//0
		alist.add(200);//1
		alist.add(300);//2
//		alist.add("400"); we cannot store String Objects into ArrayList of Integer Object
		
		System.out.println("Size of alist is " + alist.size());
		System.out.println(alist);
		
		alist.add(1);//3
		alist.add(2);//4
		alist.add(2);//5
		alist.add(2);//6
		alist.add(2);//7
		
		
		System.out.println(alist);
		
		alist.remove(2); // specifying index of 300(of the index of the element that we want to remove)
		System.out.println(alist);
		
		
		
		
	}

}
