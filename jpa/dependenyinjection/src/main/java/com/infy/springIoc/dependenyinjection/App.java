package com.infy.springIoc.dependenyinjection;

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
        Employee emp=(Employee) context.getBean("employee");
        Employee emp1=(Employee) context.getBean("employee1");
        System.out.println(emp.toString());
        System.out.println(emp1.toString());
    }
}
