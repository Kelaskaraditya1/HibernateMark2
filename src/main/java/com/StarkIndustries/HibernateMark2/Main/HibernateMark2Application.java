package com.StarkIndustries.HibernateMark2.Main;

import com.StarkIndustries.HibernateMark2.Utility.HibernateUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMark2Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMark2Application.class, args);
		System.out.println(HibernateUtility.getSessionFactory());
	}

}
