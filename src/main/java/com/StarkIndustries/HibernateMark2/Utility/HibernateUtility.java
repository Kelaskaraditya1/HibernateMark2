package com.StarkIndustries.HibernateMark2.Utility;

import com.StarkIndustries.HibernateMark2.Keys.Keys;
import com.StarkIndustries.HibernateMark2.Models.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtility {

    private static SessionFactory sessionFactory;

    public HibernateUtility(){

    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.put(Environment.DRIVER,Keys.DATABASE_DRIVER);
            properties.put(Environment.URL,Keys.DATABASE_URL);
            properties.put(Environment.USER,Keys.USERNAME);
            properties.put(Environment.PASS,Keys.PASSWORD);
            properties.put(Environment.DIALECT,Keys.DIALECT);
            properties.put(Environment.HBM2DDL_AUTO,Keys.HBM2DLL);
            properties.put(Environment.FORMAT_SQL,true);
            properties.put(Environment.SHOW_SQL,true);
            configuration.setProperties(properties);

            // Adding Tables

            configuration.addAnnotatedClass(Student.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory=configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
