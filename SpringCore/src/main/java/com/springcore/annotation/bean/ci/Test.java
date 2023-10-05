package com.springcore.annotation.bean.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context =new AnnotationConfigApplicationContext(com.springcore.annotation.bean.ci.collageConfiguration.class);
collage c =(collage)context.getBean("collageBean");
System.out.println(c);
c.test();
collage a =(collage)context.getBean("collageBea");
System.out.println(a.getId());

}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              