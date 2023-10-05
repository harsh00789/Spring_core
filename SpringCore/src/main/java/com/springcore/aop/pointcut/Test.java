package com.springcore.aop.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/aop/pointcut/aopconfig.xml");
	Operation o =	(Operation)context.getBean("ope");
	o.m();
	
	o.n();
	
	o.o();
	
		
	}

}
