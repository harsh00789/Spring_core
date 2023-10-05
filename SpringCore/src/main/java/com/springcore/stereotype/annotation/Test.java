package com.springcore.stereotype.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
public static void main(String[] args) {
	ApplicationContext context =new  ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/config.xml");
   Student s = (Student)context.getBean("ob");
System.out.println(s.getName());
System.out.println(s.getCity());

}

}