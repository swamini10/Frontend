package com.skillio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 

public class Teacher_table {


	    public static void main( String[] args )
	    {
	    	
	    	 // Hibernate Configuration
	    	 // configure() loads hibernate.cfg.xml file
	    	 // addAnnotatedClass(Teacher.class) registers Teacher entity class
	    	 Configuration cf = new Configuration().configure("hibernate.cfg.xml")
	    	                                         .addAnnotatedClass(Teacher.class);

	    	 // Build SessionFactory object
	    	 SessionFactory sf = cf.buildSessionFactory();

	    	 // Open Hibernate session
	    	 Session session = sf.openSession();

	    	 // Begin transaction
	    	 session.beginTransaction();

	    	 // Creating Teacher object using setters
	    	 Teacher s4 = new Teacher();
	    	 s4.setId(1);
	    	 s4.setName("vinod");
	    	 s4.setDept("CSE");
	    	 s4.setSubject("java");

	    	 // Creating Teacher objects using constructor
	    	 Teacher s1 = new Teacher(2, "riya", "AIDS", "aiml");
	    	 Teacher s2 = new Teacher(3, "swamini", "ENTC", "mp");
	    	 Teacher s3 = new Teacher(4, "s0ham", "IT", "cloud");

	    	 // Creating list to store multiple teachers
	    	 List<Teacher> teachers = new ArrayList<>();

	    	 // Adding teacher objects into list
	    	 teachers.add(s1);
	    	 teachers.add(s2);
	    	 teachers.add(s3);
	    	 teachers.add(s4);

	    	 // Save all teacher objects into database
	    	 for (Teacher t : teachers) {
	    	     session.persist(t);
	    	 }

	    	 // Fetch teacher whose id = 2
	    	 // SQL: SELECT * FROM teacher WHERE id = 2;
	    	 Teacher t1 = session.get(Teacher.class, 2);

	    	 // Print teacher name
	    	 System.out.println(t1.getName());

	    	 // Update teacher name
	    	 t1.setName("shreee");

	    	 // Print updated name
	    	 System.out.println(t1.getName());

	    	 // Fetch teacher whose id = 3
	    	 Teacher t2 = session.get(Teacher.class, 3);

	    	 // Delete teacher record whose id = 3
	    	 // SQL: DELETE FROM teacher WHERE id = 3;
	    	 session.remove(t2);

	    	 // Commit transaction
	    	 // Changes are saved permanently into database
	    	 session.getTransaction().commit();

	    	 // Close session
	    	 session.close();
	    	
	    }
	}

