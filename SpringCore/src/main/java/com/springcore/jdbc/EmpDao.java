package com.springcore.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
JdbcTemplate jdbctemplate;

public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	
	this.jdbctemplate = jdbctemplate;
	
}


public int saveemployee(Employee e) {
	
	String query = "insert into user9(name,password,email,country)values('"+e.getName()+"','"+e.getPassword()+"','"+e.getEmail()+"','"+e.getCountry()+"')";
	
	return 	jdbctemplate.update(query);
}

public int delete(Employee e) {
	
	String query = "delete from user9 where id='"+e.getId()+"'";
	return jdbctemplate.update(query);
	
}
public int update(Employee e) {
	
	String query = "update user9 set name='"+e.getName()+"'where id='"+e.getId()+"'";
	return jdbctemplate.update(query);
	
}



	
}
