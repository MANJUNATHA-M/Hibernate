package com.hibernate.viveksir.FIRST_PROJECT;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{

		Student s=new Student();
		s.setsID(1);
		s.setsNAME("MANJUNATHA");
		s.setsContact(12334567);

		Student s1=new Student();
		s1.setsID(2);
		s1.setsNAME("HANSA");
		s1.setsContact(456789);

		Student s2=new Student();
		s2.setsID(3);
		s2.setsNAME("BWOBWO");
		s2.setsContact(143);

		Configuration cfg= new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction trans=ses.beginTransaction();

		// add all the object into arraylist

		List<Student> stulist=new ArrayList<Student>();
		stulist.add(s);
		stulist.add(s1);
		stulist.add(s2);

		// BY USING FOR EACH LOOP WE ARE GOING TO SAVE ALL OBJECT ONCE

		for( Student stu: stulist)
		{
			ses.save(stu);
		}

		trans.commit();
		ses.close();	

	}
}


// employee details in the employee database
