package com.StarkIndustries.HibernateMark2.Main;

import com.StarkIndustries.HibernateMark2.Keys.Keys;
import com.StarkIndustries.HibernateMark2.Models.Student;
import com.StarkIndustries.HibernateMark2.Utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HibernateMark2Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMark2Application.class, args);
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();

		// Insert Operation

		Student student1 = new Student();
		student1.setName("Aditya");
		student1.setEmail("kelaskataditya1@gmail.com");
		student1.setDepartment("Computer");
		student1.setRollNo(54);

		Student student2 = new Student();
		student2.setName("Mayur");
		student2.setEmail("mayur1@gmail.com");
		student2.setDepartment("Computer");
		student2.setRollNo(56);

		Student student3 = new Student();
		student3.setName("Sandesh");
		student3.setEmail("sandesh1@gmail.com");
		student3.setDepartment("Computer");
		student3.setRollNo(41);
//
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		session.save(student1);
//		session.save(student2);
//		session.save(student3);


		// Getting all entries from database.

//		List<Student> studentList = new ArrayList<>();
//		studentList = session.createQuery("from Student", Student.class).list();
//		studentList.stream().forEach(value->{
//			System.out.println(value);
//		});

		// Getting Single value from table using Primary Key

//		Student student = session.get(Student.class,2);
//		System.out.println(student);

		// 	Updating entry : get the entity which has to be updated using get or load method and then apply saveOrUpdate method.

		Student student = session.get(Student.class,2);
		student.setName("Aditya Kelaskar");
		student.setRollNo(54);
		student.setDepartment("Computer Science");
		student.setEmail("kelaskaraditya10@gmail.com");
//		session.saveOrUpdate(student);


		// Delete Query: get student entity which has to be deleted and then use delete method.

		session.delete(student);


		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
