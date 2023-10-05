package com.springcore.jdbc.pstatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springcore.Collection.Employee;

public class StudentDao {
JdbcTemplate jdbctemplate;

public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}

public Boolean save(final Student s) {
	String query="insert into user9(name,password,email,country)values(?,?,?,?)";
	
	return jdbctemplate.execute(query,new PreparedStatementCallback<Boolean>() {
		
		
	 @Override
	public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		 
		 ps.setString(1,s.getName());
		 ps.setString(2,s.getPassword());
		 ps.setString(3,s.getEmail());
		 ps.setString(4,s.getCountry());
		return ps.execute();
	}
		
	});
		
		
	
	
}

public List<Student> getstudent(){

	String query = "select * from user9";
	
	return jdbctemplate.query(query,new ResultSetExtractor<List<Student>>(){
		
	   @Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		   
		   List<Student> list = new ArrayList<Student>();
		   while(rs.next()) {
			   int id = rs.getInt("id");
			   String name = rs.getString("name");
			   String password = rs.getString("password");
			   String email = rs.getString("email");
			   String country = rs.getString("country");
			   
Student s = new Student(id,name, password, email, country);
list.add(s);


			   
		   }
		return list;
	}
		
	});

	
	
}
	
	
}
