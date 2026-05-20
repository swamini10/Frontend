package com.skillio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Student_table 
{
    public static void main( String[] args )
    {
    	
        Configuration cf = new Configuration().configure("hibernate.cfg.xml")
    											.addAnnotatedClass(Student.class);
    	SessionFactory sf = cf.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	
    	Student s4 = new Student();
    	s4.setRollno(1);
    	s4.setName("vinod");
    	s4.setAddress("pune");
    	
    	Student s1 = new Student(2,"riya","solapur");
    	Student s2 = new Student(3,"swamini","pune");
    	Student s3 = new Student(4,"s0ham","solapur");
    	//session.save(session);//to save the data
    	
// to add multiple student in list    	
    	List<Student> stds =new ArrayList <Student>();
    	
    	//we can add student in single line 
    //	List<Student> student = Arrays.asList(s1,s2,s3,s4);
    	
    	stds.add(s3);
    	stds.add(s2);
    	stds.add(s1);
    	stds.add(s4);
    	
    	//for (i=0;i<=stds.size();i++) we use for loop   	
//    	for (Student st: stds) {
//    		session.persist(st);
//    	}
  	
    		
    	//to save single object
    	session.persist(s4);
    	session.persist(s1);
    	session.persist(s2);
    	session.persist(s3);
    	
   	
    	//select * from student where rollno =2;    	
    	session.get(Student.class, 2);
    	//it only for id we can not use it for other 
    	
    	// to hold all the data 
    	Student s0=session.get(Student.class, 2);
    	//we get student object
    	
    	System.out.println(s0.getName());
    	s0.setName("rrrrrrrr");
    	System.out.println(s0.getName());
    	//----
    	//----
    	
    	
         Student s9 = session.get(Student.class, 2);
    	
    	session.remove(s9);
    	// DELETE FROM student WHERE rollno = 2;
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
