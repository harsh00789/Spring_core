package com.springcore.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.core.convert.Property;

public class Employee {
private String name;
private List<String> phones;
private Set<String> address;
private Map<String,String> courses;
private Property prop;

public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses, Property prop) {
	super();
	this.name = name;
	this.phones = phones;
	this.address = address;
	this.courses = courses;
	this.prop = prop;
}
public Property getProp() {
	return prop;
}
public void setProp(Property prop) {
	this.prop = prop;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
	super();
	this.name = name;
	this.phones = phones;
	this.address = address;
	this.courses = courses;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + ", prop="
			+ prop + "]";
}
	
	
}
