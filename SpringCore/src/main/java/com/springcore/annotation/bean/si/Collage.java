package com.springcore.annotation.bean.si;

public class Collage {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Collage(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Collage() {
	super();
}
@Override
public String toString() {
	return "Collage [id=" + id + ", name=" + name + "]";
}
	
	
}
