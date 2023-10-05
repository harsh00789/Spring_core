package com.springcore.AutoWire;

public class B {
private A ob;


public A getOb() {
	return ob;
}

public void setOb(A ob) {
	this.ob = ob;
}

public B() {
	System.out.println("b constructor");
}

void print() {
	System.out.println("b print");
}



public B(A ob) {
	super();
	this.ob = ob;
}

void display() {
	print();
	ob.print();
}

}
