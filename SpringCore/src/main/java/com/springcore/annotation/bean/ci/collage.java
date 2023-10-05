package com.springcore.annotation.bean.ci;

import org.springframework.stereotype.Component;


public class collage {
private int id;
private String name;


@Override
public String toString() {
	return "collage [id=" + id + ", name=" + name + "]";
}


public collage(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public int getId() {
	return id;
}


public collage() {
	super();
}


public collage(int id) {
	super();
	this.id = id;
}


public void setId(int id) {
	this.id = id;
}


public void test() {
	System.out.println("this is my collage");
	
}
	

	
}
