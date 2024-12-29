package com.StarkIndustries.HibernateMark2.Main;

import com.StarkIndustries.HibernateMark2.Models.Student;
import com.StarkIndustries.HibernateMark2.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMark2Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMark2Application.class, args);
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

		Student student = new Student();
		student.setName("Aditya");
		student.setEmail("kelaskataditya1@gmail.com");
		student.setDepartment("Computer");
		student.setRollNo(54);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}

}
