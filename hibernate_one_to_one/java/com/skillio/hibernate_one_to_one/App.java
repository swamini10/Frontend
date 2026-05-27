package com.skillio.hibernate_one_to_one;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        	
            Configuration cf = new Configuration().configure("hibernate.cfg.xml")
        											.addAnnotatedClass(User.class)
        											.addAnnotatedClass(Aadhar.class);
        	SessionFactory sf = cf.buildSessionFactory();
        	
        	Session session =sf.openSession();
        	
        	session.beginTransaction();
        	//----
        	
        	User user = new User();
        	
        	user.setId(1);
        	user.setName("Swamini");
        	user.setAddress("Pune");
        	
        	session.persist(user);
        	User user1 = new User();
        	user1.setId(2);
        	user1.setName("soham");
        	user1.setAddress("Pune"); 	
        	session.persist(user1);
        	
        	Aadhar aadhar = new Aadhar();	
        	aadhar.setId(101);    	
        	aadhar.setAadharNumber(123123);
        	aadhar.setUsr(user);
        	session.persist(aadhar);
        	
        	Aadhar aadhar1 = new Aadhar();	
        	aadhar1.setId(102);    	
        	aadhar1.setAadharNumber(987987);
        	aadhar1.setUsr(user1);
        	session.persist(aadhar1);
 
        	session.getTransaction().commit();
        	session.close();
        }
    }
