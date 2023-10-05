package com.springcore.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Ref/refconfig.xml");
		AdeponB o = (AdeponB)context.getBean("aref");
		System.out.println(o);
		System.out.println(o.getX());
		System.out.println(o.getOb().getY());
	}

}
