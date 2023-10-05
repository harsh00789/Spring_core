package com.springcore.jdbc.pstatement;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/pstatement/stconfig.xml");
StudentDao sd =(StudentDao)	context.getBean("stDao");

/*
 * Student s = new Student("djkkgg", "h","dfdffasdf", "engand");
 * 
 * Boolean b =sd.save(s); //System.out.println(b); if(!b) {
 * System.out.println("inserted"); }else { System.out.println("not inserted"); }
 */


List<Student> l = sd.getstudent();

Iterator<Student> i =l.iterator();

while(i.hasNext()) {
	System.out.println(i.next());
	
}


	}

}
