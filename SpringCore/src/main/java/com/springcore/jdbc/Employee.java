package com.springcore.jdbc;

public class Employee {
	private int id;
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

private String name,password,email,country;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Employee(String name, String password, String email, String country) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.country = country;
}

public Employee() {
	super();
}

@Override
public String toString() {
	return "Employee [name=" + name + ", password=" + password + ", email=" + email + ", country=" + country + "]";
}


}
