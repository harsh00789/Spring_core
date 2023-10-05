package com.springcore.annotation.bean.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context =new  AnnotationConfigApplicationContext(com.springcore.annotation.bean.si.CollageConfig.class);
	Collage c =	(Collage)context.getBean("CollageBean");
	System.out.println(c);
	}

}
