package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/jdbc/applicationcontext.xml");
	EmpDao e=(EmpDao)context.getBean("empdao");
	
	//Employee ep = new Employee("harsh", "4564", "emailldfd","india");
	//ep.getName();
	
	/*
	 * int status = e.saveemployee(ep);
	 * 
	 * System.out.println(status);
	 * 
	 * if(status>0) { System.out.println("inserted successfully");
	 * 
	 * }else { System.out.println("failed"); }
	 */
	
	/*
	 * Employee ep = new Employee(); ep.setId(15); int status = e.delete(ep);
	 * if(status>0) { System.out.println("deleted successfully"); }else {
	 * System.out.println("not deleted"); }
	 */
	
	Employee ep = new Employee();
	ep.setId(9);
	ep.setName("tribhuvan");
	int status = e.update(ep);
	if(status>0) {
		System.out.println("update successfully");
	}else {
		System.out.println("update failed");
	}
	
	}

}
