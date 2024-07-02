package com.infy.reference.ConstructorArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student) context.getBean("student");
        
        System.out.println(student.toString());
        context.close();
    }
   
}
