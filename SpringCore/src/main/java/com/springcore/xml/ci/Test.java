package com.springcore.xml.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Person p1 = (Person)context.getBean("per1");
	System.out.println(p1);
	
}
}
