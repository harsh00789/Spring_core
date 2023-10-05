package com.springcore.xml.ci;

public class Person {
 private String name;
 private int age;
 private RefCerti certi;
 
 
 
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", certi=" + certi.name + "]";
}



public Person(String name, int age , RefCerti certi) {
	super();
	this.name = name;
	this.age = age;
	this.certi=certi;
	
}
	
	
}
