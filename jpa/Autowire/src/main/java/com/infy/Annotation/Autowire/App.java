package com.infy.Annotation.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Emp emp= (Emp) context.getBean("emp");
        System.out.println(emp.hashCode());
        
        Emp emp1= (Emp) context.getBean("emp");
        System.out.println(emp1.hashCode());
   }
}
