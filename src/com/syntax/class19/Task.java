package com.syntax.class19;

public class Task {

//	Create a method that will accept an array as parameters and will return 
//	a sum of all elements from that array. Method should be visibly only within
//	same package and accessible by the creating an instance of the class.


protected int sumOfElements(int[] array) { // protected or default
int sum = 0;

for(int element : array) {
	sum+=element;
	
}
return sum;
}

//Create a method that will take a String as a parameter and returns reversed String. 
//Method should be available to all classes within your project and accessible by class name.

public static String reversed (String word) {
String reversed = "";
for(int i = word.length() - 1; i >=0; i--) {
	reversed += word.charAt(i);
}
return reversed;
}


public static void main(String[] args) {
System.out.println("---first method-----");
Task a = new Task();
int[] array = {3, 5, 0, 1, 2};
System.out.println(a.sumOfElements(array));

System.out.println("----second method-------");

System.out.println(Task.reversed("Hello"));
	
} 


}




