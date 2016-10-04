package com.barclays;

public class Entry {
public static void main(String[] args) {
	System.out.println("Hello , World");
	
	Person person;
	person = null;
	
	person = new Person();
	
	System.out.println(person.getName());
	System.out.println(person.getAge());
	
	person = null;
	
	System.out.println(Person.getCount());
}
	
	
}
