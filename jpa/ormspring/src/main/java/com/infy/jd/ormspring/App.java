package com.infy.jd.ormspring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.jd.ormspring.Dao.studentDao;
import com.infy.jd.ormspring.entity.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Ensure that the bean name used here matches exactly with the one in config.xml
        studentDao studentDao = (studentDao) context.getBean("studentDao");

       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
       boolean go=true;
       while(go)
       {
    	   System.out.println("press 1 to add new student");
    	   System.out.println("press 2 to display all students");
    	   System.out.println("press 3 to display details of 1 student");
    	   System.out.println("press 4 to delete a student");
    	   System.out.println("press 5 to update a student");
    	   System.out.println("press 6 to exit");
    	   
    	   try {
    		   int input=Integer.parseInt(br.readLine());
    		   switch(input)
    		   {
    		   case 1:
    			   System.out.println("enter the name");
    			   String sName=br.readLine();
    			   System.out.println("enter the city");
    			   String sCity=br.readLine();
    			   Student s=new Student();
    			   s.setStuCity(sCity);
    			   s.setStuName(sName);
    			   int r=studentDao.insert(s);
    			   System.out.println("data inserted successfully");
    			   System.out.println("************************");
    			   System.out.println("");
    			   break;
    		   case 2:
    			   List<Student> students=studentDao.getAllStudents();
    			   for (Student st:students)
    			   {
    				   System.out.println("Id :"+st.getStuId());
    				   System.out.println("Name :"+st.getStuName());
    				   System.out.println("City :"+st.getStuCity());
    				   System.out.println("--------------------------");
    			   }
    			   System.out.println("*****************************");
    			   break;
    		   case 3:
    			   System.out.println("enter the student id");
    			   int studentId=Integer.parseInt(br.readLine());
    			   Student student=studentDao.getStudentId(studentId);
    			   System.out.println("Id :"+student.getStuId());
				   System.out.println("Name :"+student.getStuName());
				   System.out.println("City :"+student.getStuCity());
				   System.out.println("--------------------------");
    			   break;
    		   case 4:
    			   System.out.println("enter the student id");
    			   int stuId=Integer.parseInt(br.readLine());
    			   studentDao.deleteStudent(stuId);
    			   System.out.println("deleted sucessfully");
    			   break;
    		   case 5:
    			   System.out.println("Enter the student ID");
                   int id = Integer.parseInt(br.readLine());
                   Student stuToUpdate = studentDao.getStudentId(id);
                   if (stuToUpdate != null) {
                       System.out.println("Enter the new name");
                       String newName = br.readLine();
                       System.out.println("Enter the new city");
                       String newCity = br.readLine();
                       stuToUpdate.setStuName(newName);
                       stuToUpdate.setStuCity(newCity);
                       studentDao.update(stuToUpdate);
                       System.out.println("Updated successfully");
                   } else {
                       System.out.println("Student not found");
                   }
                   break;
    		   case 6:
    			   go=false;
    			   break;
    			
    		   }
    	   }
    	   catch(Exception e) {
    		   System.out.println("Invalid input...try again");
    		   System.out.println(e.getMessage());
    	   }
    	   System.out.println("thankyou for using our application");
       }
    }
}
