package com.springcore.stereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("harsh")
	private String name;
	@Value("rajkot")
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
	}
	
}
