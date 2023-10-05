package com.springcore.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/AutoWire/autoconfig.xml");
	System.out.println("byname");
	B b1 = 	(B)context.getBean("autob1");
	
	System.out.println("bytype");
	System.out.println();
	
	B b2 = 	(B)context.getBean("autob2");
	System.out.println("constructor");
	System.out.println();
	B b3 = 	(B)context.getBean("autob3");

	System.out.println("byname");
	
	b1.display();
	System.out.println("bytype");
	System.out.println();
	b2.display();
	System.out.println("constructor");
	System.out.println();
	b3.display();
	
	}

}
