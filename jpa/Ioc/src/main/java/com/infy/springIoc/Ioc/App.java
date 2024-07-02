package com.infy.springIoc.Ioc;
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
       ApplicationContext contex=new ClassPathXmlApplicationContext("config.xml");
Airtel air=contex.getBean("airtel",Airtel.class);
air.calling();
Voda vo=contex.getBean("voda",Voda.class);
vo.calling();
    }
}
