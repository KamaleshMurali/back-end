package com.ofs.example.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.ofs.example.model.User;

//@org.springframework.context.annotation.Configuration
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
    	try {
    	Configuration configuration = new Configuration();
		
		//Create Properties, can be read from property files too
		Properties props = new Properties();
		props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		props.put("hibernate.connection.url", "jdbc:mysql://192.168.20.170/training");
		props.put("hibernate.connection.username", "root");
		props.put("hibernate.connection.password", "root");
		props.put("hibernate.current_session_context_class", "thread");
		
		configuration.setProperties(props);
		
		configuration.addAnnotatedClass(User.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
    	System.out.println("Hibernate Java Config serviceRegistry created");
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	
        return sessionFactory;
    	}
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
	}

	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
}
