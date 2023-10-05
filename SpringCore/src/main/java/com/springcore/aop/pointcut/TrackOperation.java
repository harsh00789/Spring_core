package com.springcore.aop.pointcut;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
@Pointcut("execution(* Operation.*(..))")
public void k() {}

@Before("k()")

public void advice() {
	
	System.out.println("advised");
	
}

@Pointcut("execution(* Operation.*(..))")

public void x() {}

@After("x()")

public void advice2() {
	System.out.println("advice2");
}

/*
 * @Pointcut("execution(* Operation.*(..))")
 * 
 * public void y() {}
 * 
 * @Around("y()") public void around() {
 * 
 * System.out.println("around"); }
 */

}
