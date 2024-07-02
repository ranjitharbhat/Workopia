package com.infy.aspect1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//@Before("execution( * get*())")
	//public void loggingAdvice() {
	//	System.out.println("Advice run!...");
		
	//}
	//@After("execution(public String com.infy.aop1.model.Circle.getName())")
    //public void loggingAdviceafter() {
	//System.out.println("Advice run After!...");
//}
	
	
	
//	@Before("allGetters()  && allCircleMethods()")
//	public void loggingAdviceone() {
//		System.out.println("1st Advice run!...");
//	}
	
//	@Before("allCircleMethods()")
//	public void loggingAdvicetwo(JoinPoint joinpoint) {
//		System.out.println(joinpoint.getTarget());
//	}
	
	
	
//	@Pointcut("execution( * get*())")
//	public void allGetters() {}
	
	
//	@Pointcut("execution(public String com.infy.aop1.model.Circle.*(..))")
//	public void allCircleMethods() {}
	
	
	
	


	@Before("execution(public void com.infy.aop1.model.Circle.setName(String)) && args(name)")
    public void stringArgumentMethod(String name) {
        System.out.println("method which takes str args...");
    }
    
 //   @AfterReturning("execution(public String com.infy.aop1.model.Circle.getName())")
   // public void afterGetName() {
     //   System.out.println("method which takes str args after...");
    //}
    
    
    
    @AfterThrowing("execution(public String com.infy.aop1.model.Circle.getName())")
    public void exceptionadvice() {
        System.out.println("method which gives exception advice...");
    }
    
    
	}

	
	

