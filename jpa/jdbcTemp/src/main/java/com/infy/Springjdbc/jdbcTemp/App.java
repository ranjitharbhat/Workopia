package com.infy.Springjdbc.jdbcTemp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.infy.Springjdbc.jdbcTemp.entity.student1;
import com.infy.Springjdbc.jdbcTemp.studentDao.studentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        studentDao studao=con.getBean("studao",studentDao.class);
        student1 stu=new student1();
        //stu.setId(1111);
        //stu.setName("ramajitha");
        //stu.setCity("karkala");
       //int res=studao.insert(stu);
        //System.out.println("record is..."+result);
        
        
       // stu.setId(1111);
       // stu.setName("rajitha");
        //stu.setCity("karkal");
       //int res=studao.update(stu);
        //System.out.println("update is..."+res);
        
        
       // int res=studao.delete(101);
        //System.out.println("deleted is..."+res);
        
        
      //  studao.getstudent(1111);
        //System.out.println(stu);
        
        
        List<student1> students=studao.getallstudent();
        for(student1 s:students) {
        	System.out.println(s);
        }
    }
}



