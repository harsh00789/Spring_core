package com.springcore.fmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/fmethod/fconfig.xml");
	//A a =	(A)context.getBean("ob1");
	
	Printable pf = (Printable)context.getBean("ob2");
	pf.print();
	}

}
